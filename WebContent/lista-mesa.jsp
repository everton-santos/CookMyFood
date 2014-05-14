<%@page import="com.everton.cookmyfood.Models.Mesa"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.everton.cookmyfood.Models.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>


<t:top>
	<jsp:attribute name="titulo">
      Listar categoria
      
    </jsp:attribute>

</t:top>

<div class="col-md-12">


	<div class="panel panel-default">
		<div class="panel-heading">Listar Categorias</div>
		<!-- /.panel-heading -->

		<form role="form" action="lista-categoria.do" method="get">

			<div class="col-lg-6">
				<div class="form-group">
					<label>Filtro</label> <input type="text" name="p"
						class="form-control" placeholder="Pesquisar">
				</div>

			</div>

			<input type="submit" value="Pesquisar" />

		</form>

		<div class="panel-body">
			<div class="table-responsive">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>#</th>
							<th>Descricao</th>
							<th>Capacidade</th>
							<th>Acoes</th>
						</tr>
					</thead>
					<tbody>
						<%
							List<Mesa> lista = (List<Mesa>) request
									.getAttribute("lista");

							for (Mesa categoria : lista) {
						%>



						<tr>
							<td><%=categoria.getId()%></td>
							<td><%=categoria.getNumero()%></td>
							<td><%=categoria.getCapacidade()%></td>
							<td><a href="excluir-mesa.do?id=<%=categoria.getId()%>">Excluir</a>
							</td>
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




