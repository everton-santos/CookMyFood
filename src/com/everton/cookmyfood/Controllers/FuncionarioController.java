package com.everton.cookmyfood.Controllers;

import java.util.List;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

import com.everton.cookmyfood.Aplicacao.FuncionarioAplicacao;
import com.everton.cookmyfood.Models.Funcionario;

@Resource
public class FuncionarioController {

	private final Result result;

	public FuncionarioController(Result result) {
		this.result = result;
	}

	@Path("/funcionarios")
	public List<Funcionario> index() {
		FuncionarioAplicacao app = new FuncionarioAplicacao();

		return app.listar(new Funcionario());
	}

	@Path("/funcionarios/cadastrar")
	public void formulario() {

	}

	public void cadastrar(Funcionario funcionario) {
		FuncionarioAplicacao app = new FuncionarioAplicacao();

		app.salvar(funcionario);

		result.redirectTo(this).index();
	}

	@Path("/funcionarios/{id}")
	public Funcionario alterar(Long id) {
		FuncionarioAplicacao app = new FuncionarioAplicacao();
		return app.consultarPorID(id);
	}

	public void excluir(Long id) {
		FuncionarioAplicacao app = new FuncionarioAplicacao();
		Funcionario c = app.consultarPorID(id);
		app.remover(c);
		result.redirectTo(this).index();
	}
	
}

