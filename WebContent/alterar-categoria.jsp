<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.everton.cookmyfood.Models.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>


<%

Categoria categoria = (Categoria) request.getAttribute("categoria");

%>


<t:top>
	<jsp:attribute name="titulo">
      Aterar categoria
    </jsp:attribute>
</t:top>

<div class="col-md-12">
	<form action="alterar-categoria.do" method="post">
		<legend>Alterando a categoria "<%= categoria.getNome().toUpperCase()  %>"</legend>
	
		<input  type="hidden" name="id" value="<%= categoria.getId() %>" />
		<input type="text" placeholder="Nome da categoria" name="nome" /> 
		<input type="submit" class="btn btn-sucess" value="Atualizar" />
	</form>
</div>

<t:bottom>
</t:bottom>