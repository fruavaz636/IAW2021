package es.iestriana.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.iestriana.bean.Conexion;
import es.iestriana.bean.Usuario;
import es.iestriana.dao.UsuarioDAO;
import es.iestriana.dao.UsuarioDAOImpl;

/**
 * Servlet implementation class RegistrarUsuario
 */
public class RegistrarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrarUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String nombre = request.getParameter("nombre");
		String email = request.getParameter("email");

		// Capturar del web.xml los parámetros de la bd
		ServletContext sc = getServletContext();
		String usu = sc.getInitParameter("usuario");
		String pass = sc.getInitParameter("password");
		String driver = sc.getInitParameter("driver");
		String bd = sc.getInitParameter("database");

		// Crear un objeto de tipo Conexion para abrir la bd
		Conexion con = new Conexion(usu, pass, driver, bd);
		
		Usuario usuNuevo = new Usuario(login, password, nombre, email, 0);
		
		UsuarioDAO uDAO = new UsuarioDAOImpl();
		
		if (!uDAO.buscarLogin(login, con)) {
			if (!uDAO.buscarEmail(email, con)) {
				// Registrar
				int datos = uDAO.registrar(usuNuevo, con);
				if (datos == 1) {
					response.sendRedirect("index.jsp?mensaje=Usuario registrado correctamente");
				} else {
					response.sendRedirect("jsp/registrar.jsp?mensaje=Error al registrar al usuario");
				}
			} else {
				response.sendRedirect("jsp/registrar.jsp?mensaje=Email registrado en la BD");
			}
		} else {
			response.sendRedirect("jsp/registrar.jsp?mensaje=Login registrado en la BD");
		}
	}

}
