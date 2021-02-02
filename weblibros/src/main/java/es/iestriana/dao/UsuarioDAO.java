package es.iestriana.dao;

import es.iestriana.bean.Conexion;
import es.iestriana.bean.Usuario;

public interface UsuarioDAO {

	public Usuario comprobarUsuario(String login, String password, Conexion c);
}
