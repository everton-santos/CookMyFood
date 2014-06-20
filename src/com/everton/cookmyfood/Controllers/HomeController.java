package com.everton.cookmyfood.Controllers;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

import com.everton.cookmyfood.Aplicacao.UsuarioAplicacao;
import com.everton.cookmyfood.Models.Usuario;

@Resource
public class HomeController {

	private final Result result;


	public HomeController(Result result) {
		this.result = result;
	}

	@Path("/")
	public void index() {

	}

	@Post
	public void login(String loginName, String loginPass) {
		UsuarioAplicacao app = new UsuarioAplicacao();

		Usuario u = app.getUsuarioAutorizado(loginName, loginPass);

		if (u != null) {
			result.redirectTo(DeliveryController.class).index();
		} else {
			result.redirectTo(this.getClass()).index();
		}
	}

}
