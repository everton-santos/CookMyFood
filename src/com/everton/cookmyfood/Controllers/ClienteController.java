package com.everton.cookmyfood.Controllers;

import java.util.List;

import com.everton.cookmyfood.Aplicacao.ClienteAplicacao;
import com.everton.cookmyfood.Models.Cliente;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;

@Resource
public class ClienteController {

	@Path("/clientes")
	public List<Cliente> index(){
		ClienteAplicacao app = new ClienteAplicacao();
		
		return app.listar(new Cliente());
	}
	
	public void formulario(){
		
	}
	
	@Path("/clientes/{id}")
	public void alterar(Long id){
		
	}
	
	public void excluir(Long id){
		
	}
}
