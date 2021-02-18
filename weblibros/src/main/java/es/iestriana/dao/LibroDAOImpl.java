package es.iestriana.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import es.iestriana.bean.Conexion;
import es.iestriana.bean.Libro;
import es.iestriana.bean.Usuario;

public class LibroDAOImpl implements LibroDAO {

	@Override
	public List<Libro> listar(Conexion con, Usuario usu) {
		List<Libro> libros = new ArrayList<Libro>();
		
		String query = "SELECT * FROM libros WHERE idUsuario = ?";
		try {
			PreparedStatement sentencia = con.getConector().prepareStatement(query);
			
			sentencia.setInt(1, usu.getIdUsuario());
			
			ResultSet resultado = sentencia.executeQuery();
			
			while (resultado.next()) {
				Libro aux = new Libro(resultado.getInt("idLibro"), 
						resultado.getString("titulo"), 
						resultado.getString("autor"), 
						resultado.getInt("isbn"), 
						resultado.getBytes("portada"), 
						resultado.getString("uuid"), 
						resultado.getInt("idUsuario"));
				libros.add(aux);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return libros;
	}

	@Override
	public byte[] obtenerPortada(Conexion con, int idLibro) {
		byte[] portada = null;
		
		String query = "SELECT portada FROM libros WHERE idLibro = ?";
		try {
			PreparedStatement sentencia = con.getConector().prepareStatement(query);
			
			sentencia.setInt(1, idLibro);
			
			ResultSet resultado = sentencia.executeQuery();
			
			while (resultado.next()) {
				portada = resultado.getBytes("portada");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return portada;
	}

}
