<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="cl.edutecno.dao.InscripcionDAO"%>
<%@ page import="cl.edutecno.dto.InscripcionDTO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de inscripciones</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
	<style>
	.container{
	margin-left: 1rem;
	margin-right: 1rem
	}
	</style>
</head>
</head>

<%
InscripcionDAO inscripcionDAO = new InscripcionDAO();
List<InscripcionDTO> lista = inscripcionDAO.obtieneInscritos();
request.setAttribute("lista", lista);

%>

<body>
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Mantenedor De Cursos</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="index.jsp">Home</a></li>
				<li><a href="preInscripcion">Inscribir Cursos</a></li>
			</ul>
		</div>
	</nav>

	<div class="container">
		<h1>Listado de Inscripciones</h1>
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">Id inscirpcion</th>
					<th scope="col">Nombre</th>
					<th scope="col">Telefono</th>
					<th scope="col">ID curso</th>
					<th scope="col">Forma de Pago</th>
				</tr>

			</thead>
			<tbody>
				<c:forEach items="${lista}" var="listaTemp">
					<tr>
						<td>${listaTemp.getIdInsc()}</td>
						<td>${listaTemp.getNombre()}</td>
						<td>${listaTemp.getTelefono()}</td>
						<td>${listaTemp.getIdCurso()}</td>
						<td>${listaTemp.getIdFormaDePago()}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>