<%@page import="com.everton.cookmyfood.Models.ItemCardapio"%>
<%@page import="com.everton.cookmyfood.Models.Cardapio"%>
<%@page import="com.everton.cookmyfood.Models.Delivery"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.everton.cookmyfood.Models.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>


<%
	Delivery delivery = (Delivery) request.getAttribute("pedido");
	List<Cardapio> cardapios = (List<Cardapio>) request
			.getAttribute("cardapios");
%>

<t:top>
	<jsp:attribute name="titulo">
      Cadastrar Pedido Delivery
    </jsp:attribute>
</t:top>

<div class="col-md-12">

	<div class="panel panel-default">
		<div class="panel-heading">Cadastrar Pedido Delivery</div>
		<div class="panel-body">
			<div class="row">

				<form role="form" method="post" action="cadastro-pedido-delivery.do">

					<input type="hidden" name="id" value="<%=delivery.getId()%>" />

					<div class="col-lg-12">
						<div class="form-group">
							<label>Item</label> <select class="form-control"
								name="idCardapio">

								<%
									for (Cardapio c : cardapios) {
								%>
								<option value="<%=c.getId()%>"><%=c.getNome() + " | " + c.getPreco()%></option>
								<%
									}
								%>
							</select>
						</div>

						<div class="form-group">
							<label>Item</label> <input name="quantidade" class="form-control" />
						</div>

					</div>

					<input type="submit" value="Inserir" class="btn btn-default" />


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
					</tr>
				</thead>
				<tbody>
					<%
						for (ItemCardapio item : delivery.getItensCardapio()) {
					%>



					<tr>
						<td><%=item.getId()%></td>
						<td><%=item.getCardapio().getNome()%></td>
						<td><%=item.getCardapio().getCategoria()%></td>
						<td><%=item.getQuantidade()%></td>
						<td><%=item.getPreco()%></td>

					</tr>


					<%
						}
					%>
				</tbody>
			</table>


			<label><%=delivery.getTotal()%></label>

		</div>

	</div>


</div>

<t:bottom>
</t:bottom>