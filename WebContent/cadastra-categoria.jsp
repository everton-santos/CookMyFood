<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout>
    <jsp:attribute name="titulo">
      Cadastrar categoria
    </jsp:attribute>
    
    <jsp:body>
        <div class="col-md-12">
        	<form action="cadastro-categoria.do" method="post">
    			<input type="text" placeholder="Nome da cateria" name="nome" />
			
			<input type="submit" value="Cadastrar" />
        	</form>
        </div> 
    </jsp:body>
    
</t:layout>