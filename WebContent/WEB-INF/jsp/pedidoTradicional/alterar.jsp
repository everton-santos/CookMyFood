<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>



<t:top>
	<jsp:attribute name="titulo">
      Pedido Tradicional
    </jsp:attribute>
</t:top>

<div class="col-md-12">

	<div class="panel panel-default">
		<div class="panel-heading">Pedido Tradicional</div>
		<div class="panel-body">
			<div class="row">

				<form role="form" method="post"
					action="${linkTo[PedidoTradicionalController].cadastrarItem}">

					<input type="hidden" name="id" value="${pedidoTradicional.id }" />

					<div class="col-lg-4">
						<div class="form-group">
							<select class="form-control" name="cardapio.id">
								<c:forEach items="${cardapios}" var="cardapio">
									<option value="${cardapio.id}">${cardapio.nome}|R$
										${cardapio.preco}</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="col-lg-3">
						<div class="form-group">
							<input name="item.quantidade" class="form-control" placeholder="Quantidade" />
						</div>
					</div>
					<div class="col-lg-3">
						<div class="form-group">
							<select class="form-control" name="mesa.id">
								<c:forEach items="${mesas}" var="mesa">
									<option value="${mesa.id}">Num: ${mesa.numero} | capacidade: ${mesa.capacidade }</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="col-lg-2">
						<input type="submit" value="Inserir" class="btn btn-default" />
					</div>
				</form>
			</div>

			<table class="table table-striped">
				<thead>
					<tr>
						<th>#</th>
						<th>Descricao</th>
						<th>Categoria</th>
						<th>Quantidade</th>
						<th>Preco uni</th>
						<th>Acoes</th>
					</tr>
				</thead>
				<tbody>

					<c:forEach items="${pedidoTradicional.itensCardapio}" var="item">
						<tr>
							<td>${item.id }</td>
							<td>${item.cardapio.nome }</td>
							<td>${item.cardapio.categoria.nome }</td>
							<td>${item.quantidade }</td>
							<td>${item.preco }</td>
							<td><a href="${linkTo[PedidoTradicionalController].excluirItem}?id=${item.id }"
								class="btn btn-danger"><span
									class="glyphicon glyphicon-remove"></span></a></td>

						</tr>
					</c:forEach>
				</tbody>
			</table>
			<label>${pedidoTradicional.total}</label>
		</div>

	</div>


</div>

<t:bottom>
</t:bottom>