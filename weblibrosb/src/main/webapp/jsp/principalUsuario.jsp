<%@page import="es.iestriana.bean.Libro"%>
<%@page import="java.util.List"%>
<%@page import="es.iestriana.dao.LibroDAOImpl"%>
<%@page import="es.iestriana.dao.LibroDAO"%>
<%@page import="es.iestriana.bean.Conexion"%>
<%@page import="es.iestriana.bean.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="es">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">

<title>LIBROS</title>
</head>
<body>
	<div class="container">
		<%
		if (session.getAttribute("usuarioWeb") == null || session.isNew()) {
			response.sendRedirect("../index.jsp?mensaje= Error de sesión");
		} else {
			// Capturar del web.xml los parámetros de la bd
			ServletContext sc = getServletContext();
			String usu = sc.getInitParameter("usuario");
			String pass = sc.getInitParameter("password");
			String driver = sc.getInitParameter("driver");
			String bd = sc.getInitParameter("database");
			
			// Crear un objeto de tipo Conexion para abrir la bd
			Conexion con = new Conexion(usu, pass, driver, bd);	
			
			// Llamar al método Listar Libros
			LibroDAO lDAO = new LibroDAOImpl();
			List<Libro> libros = lDAO.listar(con, (Usuario)session.getAttribute("usuarioWeb"));
			%>
			<div class="row">
				<div class="col-12">
					<button type="button" class="btn btn-primary" onclick="location.href='anadirLibro.jsp'">AÑADIR LIBRO</button>
					<a href="anadirLibro.jsp" class="btn btn-primary">AÑADIR LIBRO</a>
				</div>
			</div>
			<%
			int i = 1;
			for (Libro lib: libros) {
				if (i == 1) {
					out.println("<div class='row text-center'>");
				} else if (i % 4 == 0) {
					out.println("</div>");
					out.println("<div class='row text-center'>");
				}
				%>
				<div class="col-4">
					<div class="card" style="margin: 10px">
						<img alt="<%=lib.getTitulo() %>" src="imagen.jsp?idLibro=<%=lib.getIdLibro() %>" class="card-img-top" 
							style="width: 180px;height: 100px">
						<div class="card-body">
							<h5 class="card-title"><%=lib.getTitulo() %></h5>
							<p class="card-text"><%=lib.getAutor() %></p>
							<p class="card-text"><small class="text-muted"><%=lib.getIsbn() %></small></p>
							<button type="button" class="btn btn-secondary btn-sm">Actualizar</button>
							<button type="button" class="btn btn-danger btn-sm" onclick="location.href='../BorrarLibro?idLibro=<%=lib.getIdLibro()%>'">Borrar</button>
						</div>
					</div>
				</div>
				<%
				i++;
			}
		}
		%>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"
		integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js"
		integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj"
		crossorigin="anonymous"></script>
</body>
</html>