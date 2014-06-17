<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="font-awesome/css/font-awesome.css" rel="stylesheet">

<link href="css/plugins/morris/morris-0.4.3.min.css" rel="stylesheet">
<link href="css/plugins/timeline/timeline.css" rel="stylesheet">

<link href="css/sb-admin.css" rel="stylesheet">

<title>Cadastre-se</title>

</head>

<body>

	<div id="wrapper">

		<nav class="navbar navbar-default navbar-fixed-top" role="navigation"
			style="margin-bottom: 0">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".sidebar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index.html">Sistema de Controle de
				Restaurante</a>
		</div>
		<!-- /.navbar-header -->

		<ul class="nav navbar-top-links navbar-right">

			
		</ul>
		<!-- /.dropdown-user -->
		</li>
		<!-- /.dropdown -->
		</ul>
		<!-- /.navbar-top-links -->

		<div class="navbar-default navbar-static-side" role="navigation">
			
		</div>
		<!-- /.navbar-static-side --> </nav>

		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">Cadastre-se</h1>
				</div>
			</div>
			<div class="row">
			
			<div class="col-md-12">

	<div class="panel panel-default">
		<div class="panel-heading">Cadastrar Cliente</div>
		<div class="panel-body">
			<div class="row">

				<form role="form" method="post" action="cadastro-cliente.do">
					<div class="col-lg-6">
						<div class="form-group">
							<label>Login</label> <input type="text" name="loginName" class="form-control"
								placeholder="Digite Login">
						</div>

						<div class="form-group">
							<label>Senha</label> <input type="password" name="loginPass" class="form-control"
								placeholder="Digite Senha">
						</div>

						<div class="form-group">
							<label>Nome</label> <input name="nome" class="form-control"
								placeholder="Digite Nome">
						</div>

						<div class="form-group">
							<label>Telefone</label> <input name="celular" class="form-control"
								placeholder="Digite Telefone">
						</div>

						<div class="form-group">
							<label>email</label> <input type="email" name="email" class="form-control"
								placeholder="Digite Email">
						</div>

					</div>

					<div class="col-lg-6">
						<div class="form-group">
							<label>Rua</label> <input type="text" name="logradouro" class="form-control"
								placeholder="Digite Rua">
						</div>

						<div class="form-group">
							<label>Numero</label> <input type="text" name="numero" class="form-control"
								placeholder="Digite Numero">
						</div>

						<div class="form-group">
							<label>Complemento</label> <input name="complemento" class="form-control"
								placeholder="Digite Complemento">
						</div>

						<div class="form-group">
							<label>Bairro</label> <input name="bairro" class="form-control"
								placeholder="Digite Bairro">
						</div>

						<div class="form-group">
							<label>CEP</label> <input type="text" name="cep" class="form-control"
								placeholder="Digite CEP">
						</div>

						<button type="submit" class="btn btn-default">Enviar</button>

					</div>

				</form>


			</div>

		</div>

	</div>


</div>
			
			</div>
		</div>
		<!-- /#page-wrapper -->

	</div>
	<!-- /#wrapper -->

	<!-- Core Scripts - Include with every page -->
	<script src="js/jquery-1.10.2.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>

	<!-- Page-Level Plugin Scripts - Dashboard -->
	<script src="js/plugins/morris/raphael-2.1.0.min.js"></script>
	<script src="js/plugins/morris/morris.js"></script>

	<!-- SB Admin Scripts - Include with every page -->
	<script src="js/sb-admin.js"></script>

</body>


</html>

</body>
</html>