<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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
<style>

.container1 {
	margin-left: 3rem
}

.titulo {
	margin-left: 3rem
}
</style>
</head>

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

	<div class="titulo">
		<h2>Bootcamp programación</h2>
	</div>

	<div class="container1" id="container1">
		<br> <img alt=""
			src="https://i1.wp.com/windtux.com/wp-content/uploads/2017/08/javaee-logo.png?ssl=1"
			width="20%"> <img alt=""
			src="https://formatalent.com/wp-content/uploads/2017/02/Java-JSE-300x168.png"
			width="30%"> <img alt=""
			src="https://blog.ida.cl/wp-content/uploads/sites/5/2016/06/ecmas6_2.png"
			width="25%">
	</div>


	<script>
		(function($) {
			$.fn.showdelay = function() {
				var delay = 0;
				return this.each(function() {
					$(this).delay(delay).animate({
						opacity : 1,
						height : "+=30",
						width : "+=100"
					}, 1000);

				});
			};
		})(jQuery);

		$(document).ready(function(e) {
			$('#container1').css('display', 'block');
			$('#container1').animate({
				opacity : 0
			}, 0);
			$('#container1').showdelay();
		});
	</script>
</body>
</html>