<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.everton.cookmyfood.Models.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>


<t:top>
	<jsp:attribute name="titulo">
      Cadastrar novo cliente
    </jsp:attribute>

</t:top>

<div class="col-md-12">
	
	<div class="panel panel-default">
                        <div class="panel-heading">
                            Basic Form Elements
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <form role="form">
                                        
                                        <div class="form-group">
                                            <label>Login</label>
                                            <input class="form-control" placeholder="Digite Login">
                                        </div>
                                          <button type="submit" class="btn btn-default">Enviar</button>
                                        <button type="reset" class="btn btn-default">Limpar formulario</button>
                                    </form>
                                </div>
                                
                            </div>
                            
                        </div>
                        
                    </div>
	
	
</div>

<t:bottom>
</t:bottom>