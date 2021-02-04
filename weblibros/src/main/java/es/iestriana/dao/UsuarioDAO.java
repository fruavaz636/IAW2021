package es.iestriana.dao;

import es.iestriana.bean.Conexion;
import es.iestriana.bean.Usuario;

public interface UsuarioDAO {

	public Usuario comprobarUsuario(String login, String password, Conexion c);
	
	public boolean buscarLogin(String login, Conexion c);
	
	public boolean buscarEmail(String email, Conexion c);

	public int insertarUsuario(Usuario usuReg, Conexion con);
}
