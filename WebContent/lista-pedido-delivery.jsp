<%@page import="com.everton.cookmyfood.Models.Delivery"%>
<%@page import="com.everton.cookmyfood.Models.Cliente"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.everton.cookmyfood.Models.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>


<%
	List<Delivery> model = (List<Delivery>) request
			.getAttribute("model");
%>


<t:top>
	<jsp:attribute name="titulo">
      Listar Pedido Delivery
    </jsp:attribute>

</t:top>

<div class="col-md-12">


	<div class="panel panel-default">
		<div class="panel-heading">Listar Clientes</div>
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
						<%
							for (Delivery item : model) {
						%>



						<tr>
							<td><%=item.getId()%></td>
							<td><%=item.getData()%></td>
							<td><%=item.getTotal()%></td>
							<td><%=item.getStatus()%></td>
							<td> Detalhar | Excluir </td>
						</tr>


						<%
							}
						%>
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




