package es.iestriana.bean;

import java.io.Serializable;

public class Usuario implements Serializable {

	private int idUsuario;
	private String login;
	private String password;
	private String nombre;
	private String email;
	private int tipo;
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Usuario(String login, String password, String nombre, String email, int tipo) {
		super();
		this.login = login;
		this.password = password;
		this.nombre = nombre;
		this.email = email;
		this.tipo = tipo;
	}

	public Usuario(int idUsuario, String login, String password, String nombre, String email, int tipo) {
		super();
		this.idUsuario = idUsuario;
		this.login = login;
		this.password = password;
		this.nombre = nombre;
		this.email = email;
		this.tipo = tipo;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
}