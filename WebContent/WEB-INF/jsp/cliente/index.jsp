<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>


<t:top>
	<jsp:attribute name="titulo">
      Listar Clientes
    </jsp:attribute>
</t:top>

<div class="col-md-12">


	<div class="panel panel-default">
		<div class="panel-heading">
			<form role="form" action="${linkTo[DeliveryController].pesquisar}" method="get">

				<div class="col-lg-6">
					<div class="form-group">
						<input type="text" name="id" class="form-control"
							placeholder="Pesquisar numero do pedido">
					</div>
				</div>

				<input type="submit" class="btn btn-default" value="Pesquisar" />

			</form>

		</div>
		<!-- /.panel-heading -->
		<div class="panel-body">
			<div class="table-responsive">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>#</th>
							<th>Nome</th>
							<th>Login</th>
							<th>Email</th>
							<th>Celular</th>
							<th>Acoes</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${clienteList}" var="cliente">
							<tr>
								<td>${cliente.id }</td>
								<td>${cliente.nome }</td>
								<td>${cliente.loginName }</td>
								<td>${cliente.email }</td>
								<td>${cliente.celular }</td>
								<td><a
									href="${linkTo[ClienteController].alterar}${cliente.id }"
									class="btn btn-primary"><span
										class="glyphicon glyphicon-pencil"></span></a> <a
									href="${linkTo[ClienteController].excluir}?id=${cliente.id }"
									class="btn btn-danger"><span
										class="glyphicon glyphicon-remove"></span></a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

			</div>
			<!-- /.table-responsive -->
		</div>
		<!-- /.panel-body -->
	</div>

</div>


<t:bottom>
</t:bottom>

