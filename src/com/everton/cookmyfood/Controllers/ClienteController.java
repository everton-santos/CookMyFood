package com.everton.cookmyfood.Controllers;

import java.util.List;

import com.everton.cookmyfood.Aplicacao.ClienteAplicacao;
import com.everton.cookmyfood.Models.Cliente;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class ClienteController {

	private final Result result;

	public ClienteController(Result result) {
		this.result = result;
	}

	@Path("/clientes")
	public List<Cliente> index() {
		ClienteAplicacao app = new ClienteAplicacao();

		return app.listar(new Cliente());
	}

	@Path("/clientes/cadastrar")
	public void formulario() {

	}

	public void cadastrar(Cliente cliente) {
		ClienteAplicacao app = new ClienteAplicacao();

		app.salvar(cliente);

		result.redirectTo(this).index();
	}

	@Path("/clientes/{id}")
	public Cliente alterar(Long id) {
		ClienteAplicacao app = new ClienteAplicacao();
		return app.consultarPorID(id);
	}

	public void excluir(Long id) {
		ClienteAplicacao app = new ClienteAplicacao();
		Cliente c = app.consultarPorID(id);
		app.remover(c);
		result.redirectTo(this).index();
	}
}
