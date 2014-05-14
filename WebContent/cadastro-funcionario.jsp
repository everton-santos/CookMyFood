<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.everton.cookmyfood.Models.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>


<t:top>
	<jsp:attribute name="titulo">
      Cadastrar Funcionario
    </jsp:attribute>

</t:top>

<div class="col-md-12">

	<div class="panel panel-default">
		<div class="panel-heading">Cadastrar Funcionario</div>
		<div class="panel-body">
			<div class="row">

				<form role="form" method="post" action="cadastro-funcionario.do">
					<div class="col-lg-6">
						<div class="form-group">
							<label>Login</label> <input type="text" name="loginName"
								class="form-control" placeholder="Digite Login">
						</div>

						<div class="form-group">
							<label>Senha</label> <input type="password" name="loginPass"
								class="form-control" placeholder="Digite Senha">
						</div>

						<div class="form-group">
							<label>Nome</label> <input name="nome" class="form-control"
								placeholder="Digite Nome">
						</div>

						<div class="form-group">
							<label>Telefone</label> <input name="celular"
								class="form-control" placeholder="Digite Telefone">
						</div>

						<div class="form-group">
							<label>email</label> <input type="email" name="email"
								class="form-control" placeholder="Digite Email">
						</div>

					</div>

					<div class="col-lg-6">
						<div class="form-group">
							<label>Salario</label> <input type="text" name="salario"
								class="form-control" placeholder="Digite Rua">
						</div>

						<div class="form-group">
							<label>CPF</label> <input type="text" name="cpf"
								class="form-control" placeholder="Digite Numero">
						</div>

						<button type="submit" class="btn btn-default">Enviar</button>

					</div>

				</form>


			</div>

		</div>

	</div>


</div>

<t:bottom>
</t:bottom>