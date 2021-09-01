<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="cl.edutecno.dao.InscripcionDAO"%>
<%@ page import="cl.edutecno.dto.InscripcionDTO"%>
<%@ page import="cl.edutecno.dto.CursoDTO"%>
<%@ page import="cl.edutecno.dao.CursoDAO"%>
<%@ page import="cl.edutecno.dao.FormaDePagoDAO"%>
<%@ page import="cl.edutecno.dto.FormaDePagoDTO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario Inscripción</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<%
CursoDAO cursoDAO = new CursoDAO();
FormaDePagoDAO formaDAO = new FormaDePagoDAO();
List<CursoDTO> cursos = cursoDAO.obtieneCursos();
List<FormaDePagoDTO> formasPago = formaDAO.obtieneFormasDePago();
// capturamos informacion que viene desde el request
request.setAttribute("cursos", cursos);
request.setAttribute("formasPago", formasPago);

%>
<body>

	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="preInscripcion">Mantenedor De
					Cursos</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="index.jsp">Home</a></li>
				<li><a href="preInscripcion">Inscribir Cursos</a></li>
				<li><a href="PreListarInscripciones">Listar Inscritos</a></li>
			</ul>
		</div>
	</nav>


	<div class="container">
		<form action="posInscripcion" method="post">
			<div class="form-group">
				<label for="nombre">Nombre:</label> <input type="text"
					class="form-control" name="nombre" id="nombre">
			</div>
			<div class="form-group">
				<label for="telefono">Telefono:</label> <input type="text"
					class="form-control" name="telefono" id="telefono">
			</div>
			<div class="form-group">
				<label for="cursos">Cursos:</label> <select name="idCurso">
					<c:forEach items="${cursos}" var="cursosTemp">

						<option value="${cursosTemp.getIdCurso()}">${cursosTemp.getDescripcion()}
					</c:forEach>

				</select><br>
			</div>
			<div class="form-group">
				<label for="formasPago">Formas de Pago:</label> <select
					name="idFormaPago">
					<c:forEach items="${formasPago}" var="pagoTemp">

						<option value="${pagoTemp.getIdFormaDePago()}">${pagoTemp.getDescripcion()}
					</c:forEach>

				</select><br>
			</div>

			<button type="submit" class="btn btn-default">Enviar</button>
		</form>
	</div>
</body>
</html>