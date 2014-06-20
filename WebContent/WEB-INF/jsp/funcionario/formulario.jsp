<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:top>
	<jsp:attribute name="titulo">
      Cadastrar Cliente
    </jsp:attribute>

</t:top>

<div class="col-md-12">

	<div class="panel panel-default">
		<div class="panel-heading">Cadastrar Cliente</div>
		<div class="panel-body">
			<div class="row">

				<form role="form" method="post"
					action="${linkTo[FuncionarioController].cadastrar }">
					
					<div class="col-lg-6">
						<div class="form-group">
							<label>Login</label> <input type="text" name="funcionario.loginName"
								value="${ funcionario.loginName}" class="form-control"
								placeholder="Digite Login">
						</div>

						<div class="form-group">
							<label>Senha</label> <input type="password"
								name="funcionario.loginPass" class="form-control"
								value="${ funcionario.loginPass}" placeholder="Digite Senha">
						</div>

						<div class="form-group">
							<label>Nome</label> <input name="funcionario.nome"
								value="${funcionario.nome }" class="form-control"
								placeholder="Digite Nome">
						</div>

						<div class="form-group">
							<label>Telefone</label> <input name="funcionario.celular"
								value="${funcionario.celular }" class="form-control"
								placeholder="Digite Telefone">
						</div>

						<div class="form-group">
							<label>email</label> <input type="email" name="funcionario.email"
								value="${funcionario.email }" class="form-control"
								placeholder="Digite Email">
						</div>

					</div>

					<div class="col-lg-6">
						<div class="form-group">
							<label>Salario</label> <input type="text" name="funcionario.salario" value="${funcionario.salario }"
								class="form-control" placeholder="Digite Rua">
						</div>

						<div class="form-group">
							<label>CPF</label> <input type="text" name="funcionario.cpf" value="${funcionario.cpf }"
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