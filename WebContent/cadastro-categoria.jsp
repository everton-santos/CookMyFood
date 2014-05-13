<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.everton.cookmyfood.Models.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>


<t:top>
	<jsp:attribute name="titulo">
      Cadastrar nova categoria
    </jsp:attribute>

</t:top>

<div class="col-md-12">
	<form action="cadastro-categoria.do" method="post">
		<input type="text" placeholder="Nome da categoria" name="nome" /> 
		<input type="submit" value="Cadastrar" />
	</form>
</div>

<t:bottom>
</t:bottom>