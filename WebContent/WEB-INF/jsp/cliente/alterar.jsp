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
					action="${linkTo[ClienteController].cadastrar }">
					
					<input type="hidden" name="cliente.id" value="${cliente.id }"  />
					<div class="col-lg-6">
						<div class="form-group">
							<label>Login</label> <input type="text" name="cliente.loginName"
								value="${ cliente.loginName}" class="form-control"
								placeholder="Digite Login">
						</div>

						<div class="form-group">
							<label>Senha</label> <input type="password"
								name="cliente.loginPass" class="form-control"
								value="${ cliente.loginPass}" placeholder="Digite Senha">
						</div>

						<div class="form-group">
							<label>Nome</label> <input name="cliente.nome"
								value="${cliente.nome }" class="form-control"
								placeholder="Digite Nome">
						</div>

						<div class="form-group">
							<label>Telefone</label> <input name="cliente.celular"
								value="${cliente.celular }" class="form-control"
								placeholder="Digite Telefone">
						</div>

						<div class="form-group">
							<label>email</label> <input type="email" name="cliente.email"
								value="${cliente.email }" class="form-control"
								placeholder="Digite Email">
						</div>

					</div>

					<div class="col-lg-6">
						<div class="form-group">
							<label>Rua</label> <input type="text"
								name="cliente.endereco.logradouro" class="form-control"
								value="${cliente.endereco.logradouro }" placeholder="Digite Rua">
						</div>

						<div class="form-group">
							<label>Numero</label> <input type="text"
								name="cliente.endereco.numero" class="form-control"
								value="${cliente.endereco.numero }" placeholder="Digite Numero">
						</div>

						<div class="form-group">
							<label>Complemento</label> <input
								name="cliente.endereco.complemento" class="form-control"
								value="${ cliente.endereco.complemento}"
								placeholder="Digite Complemento">
						</div>

						<div class="form-group">
							<label>Bairro</label> <input name="cliente.endereco.bairro"
								value="${cliente.endereco.bairro }" class="form-control"
								placeholder="Digite Bairro">
						</div>

						<div class="form-group">
							<label>CEP</label> <input type="text" name="cliente.endereco.cep"
								value="${ cliente.endereco.cep}" class="form-control"
								placeholder="Digite CEP">
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