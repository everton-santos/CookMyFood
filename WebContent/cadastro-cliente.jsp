<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.everton.cookmyfood.Models.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

<t:bottom>
</t:bottom>