<%@page import="com.everton.cookmyfood.Models.Cliente"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>


<%
	Cliente cliente = (Cliente) request.getAttribute("cliente");
%>


<t:top>
	<jsp:attribute name="titulo">
      Aterar cliente
    </jsp:attribute>
</t:top>

<div class="col-md-12">

	<div class="row">

		<form role="form" method="post" action="alterar-cliente.do">

			<input type="hidden" name="id" value="<%=cliente.getId()%>" />


			<div class="col-lg-6">
				<div class="form-group">
					<label>Login</label> <input type="text" name="loginName"
						class="form-control" placeholder="Digite Login" value="<%= cliente.getLoginName() %>" >
				</div>

				<div class="form-group">
					<label>Senha</label> <input type="password" name="loginPass"
						class="form-control" placeholder="Digite Senha" value="<%= cliente.getLoginPass() %>">
				</div>

				<div class="form-group">
					<label>Nome</label> <input name="nome" class="form-control"
						placeholder="Digite Nome" value="<%= cliente.getNome() %>" >
				</div>

				<div class="form-group">
					<label>Telefone</label> <input name="celular" class="form-control"
						placeholder="Digite Telefone" value="<%= cliente.getEndereco().getTelefone() %>" >
				</div>

				<div class="form-group">
					<label>email</label> <input type="email" name="email"
						class="form-control" placeholder="Digite Email" value="<%= cliente.getEmail() %>" >
				</div>

			</div>

			<div class="col-lg-6">
				<div class="form-group">
					<label>Rua</label> <input type="text" name="logradouro"
						class="form-control" placeholder="Digite Rua" value="<%= cliente.getEndereco().getLogradouro() %>" >
				</div>

				<div class="form-group">
					<label>Numero</label> <input type="text" name="numero"
						class="form-control" placeholder="Digite Numero" value="<%= cliente.getEndereco().getNumero() %>" >
				</div>

				<div class="form-group">
					<label>Complemento</label> <input name="complemento"
						class="form-control" placeholder="Digite Complemento" value="<%= cliente.getEndereco().getComplemento() %>" >
				</div>

				<div class="form-group">
					<label>Bairro</label> <input name="bairro" class="form-control"
						placeholder="Digite Bairro" value="<%= cliente.getEndereco().getBairro() %>" >
				</div>

				<div class="form-group">
					<label>CEP</label> <input type="text" name="cep"
						class="form-control" placeholder="Digite CEP" value="<%= cliente.getEndereco().getCep() %>" >
				</div>

				<button type="submit" class="btn btn-default">Enviar</button>

			</div>

		</form>

	</div>

</div>

<t:bottom>
</t:bottom>