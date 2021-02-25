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
	public List<Libro> listar(Conexion c, Usuario u) {
		List<Libro> libros = new ArrayList<Libro>();		
		
		String query = "SELECT * FROM libros WHERE idUsuario = ?";
		try {
			PreparedStatement sentencia = c.getConector().prepareStatement(query);
			
			sentencia.setInt(1, u.getIdUsuario());
			
			ResultSet resultado = sentencia.executeQuery();
			while (resultado.next()) {
				Libro aux = new Libro(resultado.getInt("idLibro"), 
						resultado.getString("titulo"), 
						resultado.getString("autor"), 
						resultado.getString("isbn"), 
						resultado.getBytes("portada"), 
						resultado.getInt("idUsuario"),
						resultado.getString("uuid"));
				
				libros.add(aux);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return libros;
	}

	@Override
	public byte[] obtenerPortada(Conexion c, int idLibro) {
		byte[] portada = null;
		
		String query = "SELECT portada FROM libros WHERE idLibro = ?";
		try {
			PreparedStatement sentencia = c.getConector().prepareStatement(query);
			
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
