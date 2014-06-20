<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Sistema de Controle de Restaurante</title>

<!-- Core CSS - Include with every page -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="font-awesome/css/font-awesome.css" rel="stylesheet">

<!-- SB Admin CSS - Include with every page -->
<link href="css/sb-admin.css" rel="stylesheet">

</head>

<body>

	<div class="container">
		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<div class="login-panel panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Faça login para utilizar o sistema</h3>
					</div>
					<div class="panel-body">
						<form role="form" action="${linkTo[HomeController].login}" method="post">
							<fieldset>
								<div class="form-group">
									<input class="form-control" placeholder="Nome do usuario"
										name="loginName" type="text" autofocus>
								</div>
								<div class="form-group">
									<input class="form-control" placeholder="Senha"
										name="loginPass" type="password" value="">
								</div>
								<!-- Change this to a button or input when using this as a form -->

								<input type="submit" class="btn btn-lg btn-success btn-block"
									value="Login" /> <a href="cadastre-se.jsp">Cadastrar-se</a>

							</fieldset>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Core Scripts - Include with every page -->
	<script src="js/jquery-1.10.2.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>

	<!-- SB Admin Scripts - Include with every page -->
	<script src="js/sb-admin.js"></script>

</body>

</html>
