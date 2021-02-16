package es.iestriana.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		
		// Voy a capturar los datos del fichero web.xml
		// Creamos un objeto de tipo Conexion pasando estos valores
		// Llamamos al método comprobarUsuario del DAO que devuelve
		// el usuario si existe en la BD o null si no existe
		
		ServletContext sc = getServletContext();
		String usu = sc.getInitParameter("usuario");
		String pass = sc.getInitParameter("password");
		String driver = sc.getInitParameter("driver");
		String bd = sc.getInitParameter("database");
		
		Conexion con = new Conexion(usu, pass, driver, bd);
		
		UsuarioDAO uDAO = new UsuarioDAOImpl();
		Usuario u = uDAO.comprobarUsuario(usuario, password, con);
		
		if (u != null) {
			// Colocamos al usuario en sesión
			HttpSession sesion = request.getSession();
			
			sesion.setAttribute("usuarioWeb", u);
			
			response.sendRedirect("jsp/principalUsuario.jsp");
		} else {
			response.sendRedirect("index.jsp?mensaje=Usuario y/o Password Incorrecto");
		}
	}

}
