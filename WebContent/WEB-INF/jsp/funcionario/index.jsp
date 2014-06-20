<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>


<t:top>
	<jsp:attribute name="titulo">
      Listar Funcionarios
    </jsp:attribute>
</t:top>

<div class="col-md-12">


	<div class="panel panel-default">
		<div class="panel-heading">

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
							<th>Salario</th>
							<th>Cpf</th>
							<th>Acoes</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${funcionarioList}" var="funcionario">
							<tr>
								<td>${funcionario.id }</td>
								<td>${funcionario.nome }</td>
								<td>${funcionario.loginName }</td>
								<td>R$ ${funcionario.salario }</td>
								<td>${funcionario.cpf }</td>
								<td><a
									href="${linkTo[FuncionarioController].alterar}${funcionario.id }"
									class="btn btn-primary"><span
										class="glyphicon glyphicon-pencil"></span></a> <a
									href="${linkTo[FuncionarioController].excluir}?id=${funcionario.id }"
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

