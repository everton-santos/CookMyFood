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

				<form role="form" method="post" action="cadastro-mesa.do">
					<div class="col-lg-6">
						<div class="form-group">
							<label>Numero</label> <input type="text" name="numero" class="form-control"
								placeholder="Digite Numero">
						</div>

						<div class="form-group">
							<label>Capacidade</label> <input type="text" name="capacidade" class="form-control"
								placeholder="Digite Capacidade">
						</div>

						<input type="submit" value="Cadastrar"/>
						
					</div>



				</form>


			</div>

		</div>

	</div>


</div>

<t:bottom>
</t:bottom>