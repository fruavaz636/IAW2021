package es.iestriana.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import es.iestriana.bean.Conexion;
import es.iestriana.bean.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO {

	private String claveBD = "LibrosIES2021";
	
	@Override
	public Usuario comprobarUsuario(String login, String password, Conexion c) {
		Usuario u = null;
		
		String query = "SELECT * FROM usuarios WHERE login = ?"
				+ "AND password = AES_ENCRYPT(?, ?)";
		try {
			PreparedStatement sentencia = c.getConector().prepareStatement(query);
			
			sentencia.setString(1, login);
			sentencia.setString(2, password);
			sentencia.setString(3, claveBD);
			
			ResultSet resultado = sentencia.executeQuery();
			if (resultado.next()) {
				u = new Usuario(resultado.getInt("idUsuario"), 
								resultado.getString("login"), 
								resultado.getString("password"), 
								resultado.getString("nombre"), 
								resultado.getString("email"),
								resultado.getInt("tipo"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return u;
	}

	@Override
	public boolean buscarLogin(String login, Conexion c) {
		boolean existe = false;
		
		String query = "SELECT * FROM usuarios WHERE login = ?";
		try {
			PreparedStatement sentencia = c.getConector().prepareStatement(query);
			
			sentencia.setString(1, login);
						
			ResultSet resultado = sentencia.executeQuery();
			if (resultado.next()) {
				existe = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return existe;
	}

	@Override
	public boolean buscarEmail(String email, Conexion c) {
		boolean existe = false;
		
		String query = "SELECT * FROM usuarios WHERE email = ?";
		try {
			PreparedStatement sentencia = c.getConector().prepareStatement(query);
			
			sentencia.setString(1, email);
						
			ResultSet resultado = sentencia.executeQuery();
			if (resultado.next()) {
				existe = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return existe;
	}

	@Override
	public int registrar(Usuario usuNuevo, Conexion con) {
		int datos = 0;
		
		String query = "INSERT INTO usuarios VALUES(null, ?, AES_ENCRYPT(?, ?), ?, ?, ?)";
		try {
			PreparedStatement sentencia = con.getConector().prepareStatement(query);
			sentencia.setString(1, usuNuevo.getLogin());
			sentencia.setString(2, usuNuevo.getPassword());
			sentencia.setString(3, claveBD);
			sentencia.setString(4, usuNuevo.getNombre());
			sentencia.setString(5, usuNuevo.getEmail());
			sentencia.setInt(6, usuNuevo.getTipo());
			
			datos = sentencia.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return datos;
	}

}
