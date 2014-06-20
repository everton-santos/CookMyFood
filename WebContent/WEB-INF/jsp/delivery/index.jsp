<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>




<t:top>
	<jsp:attribute name="titulo">
      Listar Pedido Delivery
    </jsp:attribute>
</t:top>

<div class="col-md-12">


	<div class="panel panel-default">
		<div class="panel-heading">
			<form role="form" action="lista-pedido-delivery.do" method="get">

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
							<th>Data</th>
							<th>Total</th>
							<th>Status</th>
							<th>Açoes</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${deliveryList}" var="pedido">

							<tr>
								<td>${pedido.id }</td>
								<td>${pedido.data }</td>
								<td>${pedido.total }</td>
								<td>${pedido.status }</td>
								<td><a href="cadastro-pedido-delivery.do?id=${pedido.id }"
									class="btn btn-primary"><span
										class="glyphicon glyphicon-pencil"></span></a> <a
									href="excluir-pedido-delivery.do?id=${pedido.id }"
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

