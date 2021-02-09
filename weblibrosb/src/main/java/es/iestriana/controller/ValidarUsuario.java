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
 * Servlet implementation class ValidarUsuario
 */
public class ValidarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		
		// Capturar del web.xml los parámetros de la bd
		ServletContext sc = getServletContext();
		String usu = sc.getInitParameter("usuario");
		String pass = sc.getInitParameter("password");
		String driver = sc.getInitParameter("driver");
		String bd = sc.getInitParameter("database");
		
		// Crear un objeto de tipo Conexion para abrir la bd
		Conexion con = new Conexion(usu, pass, driver, bd);
		
		// Voy a llamar al método comprobarUsuario que devuelve 
		// el usuario si lo encuentra o null si no lo encuentra
		UsuarioDAO uDAO = new UsuarioDAOImpl();
		Usuario usuWeb = uDAO.comprobarUsuario(usuario, password, con);
		
		if (usuWeb != null) {
			response.sendRedirect("principalUsuario.jsp");
		} else {
			response.sendRedirect("index.jsp?mensaje=Usuario y/o Password Incorrecto");
		}
	}

}
