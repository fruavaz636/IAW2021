package es.iestriana.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	private Connection conector;
	
	public Conexion (String usu, String pass, String driver, String bd) {
		try {
			Class.forName(driver);
			conector = DriverManager.getConnection(bd, usu, pass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void cerrarConexion() {
		try {
			conector.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConector() {
		return conector;
	}
}
