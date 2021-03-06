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
		<div class="row">
			<div class="col">
				<h2>WEB LIBROS</h2>
				<div class="row">
					<%
					String error = request.getParameter("mensaje");
					if (error != null) {
					%>
					<div class="alert alert-warning alert-dismissible fade show"
						role="alert">
						<%
						out.print(error);
						%>
						<button type="button" class="close" data-dismiss="alert"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<%
					}
					%>
				</div>
				<form role="form" method="post" action="ValidarUsuario">
					<div class="mb-3">
						<label for="usuario" class="form-label">Usuario</label> <input
							type="text" class="form-control" id="usuario" name="usuario"
							aria-describedby="usuarioHelp" autofocus="autofocus"
							required="required">
					</div>
					<div class="mb-3">
						<label for="password" class="form-label">Password</label> <input
							type="password" class="form-control" id="password"
							name="password" required="required">
					</div>
					<button type="submit" class="btn btn-primary">Enviar</button>
					<button type="button" class="btn btn-secondary" onclick="location.href='jsp/registrar.jsp'">Registrar</button>
				</form>
			</div>
		</div>
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