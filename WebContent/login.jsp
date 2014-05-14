<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:layout>
	<jsp:attribute name="titulo">
      Login
    </jsp:attribute>

	<jsp:body>
        <div class="col-md-12">
        	<form action="login.do" method="post">
    			<input type="text" placeholder="Usuario" name="loginName" />    	
			<input type="password" placeholder="Usuario" name="loginPass" />
			
			<input type="submit" value="Entrar" />
		
        	</form>
        </div> 
    </jsp:body>

</t:layout>