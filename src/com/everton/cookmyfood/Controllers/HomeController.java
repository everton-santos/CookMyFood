package com.everton.cookmyfood.Controllers;

import java.util.List;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;

import com.everton.cookmyfood.Aplicacao.ClienteAplicacao;
import com.everton.cookmyfood.Models.Cliente;

@Resource
public class HomeController {



	@Path("/")
	public List<Cliente> index() {
		
		ClienteAplicacao app = new ClienteAplicacao();
		
		return app.listar(new Cliente());
		
	}

}
