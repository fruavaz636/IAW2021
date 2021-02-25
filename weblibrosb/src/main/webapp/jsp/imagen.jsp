<%@page import="es.iestriana.bean.Conexion"%><%@page import="java.io.OutputStream"%><%@page import="es.iestriana.dao.LibroDAOImpl"%><%@page import="es.iestriana.dao.LibroDAO"%><%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%><%try{
	ServletContext sc = getServletContext();
	String usu = sc.getInitParameter("usuario");
	String pass = sc.getInitParameter("password");
	String driver = sc.getInitParameter("driver");
	String bd = sc.getInitParameter("database");
	Conexion con = new Conexion(usu, pass, driver, bd);
	String idLibro = request.getParameter("idLibro");
	LibroDAO lDAO = new LibroDAOImpl();
	byte[] portada = lDAO.obtenerPortada(con, Integer.parseInt(idLibro));
	try {
		if (portada != null) {
			response.setContentType("image/jpeg");
			response.setHeader("Content-Disposition", "attachment");
			OutputStream o = response.getOutputStream();
			o.write(portada);
			o.flush();
			o.close();
			return;
		}
	} catch (IllegalStateException e) {}
} catch (Exception e) {}%>