package com.everton.cookmyfood.Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everton.cookmyfood.Aplicacao.FuncionarioAplicacao;
import com.everton.cookmyfood.Models.Funcionario;
import com.everton.cookmyfood.Util.LeitorParatetrosParaServlet;

/**
 * Servlet implementation class CadastroFuncionarioServlet
 */
@WebServlet("/cadastro-funcionario.do")
public class CadastroFuncionarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CadastroFuncionarioServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Funcionario funcionario = new Funcionario();

		funcionario.setCelular(LeitorParatetrosParaServlet.ler("celular", request));
		funcionario.setEmail(LeitorParatetrosParaServlet.ler("email", request));
		funcionario.setLoginName(LeitorParatetrosParaServlet.ler("loginName",
				request));
		funcionario.setLoginPass(LeitorParatetrosParaServlet.ler("loginPass",
				request));
		funcionario.setNome(LeitorParatetrosParaServlet.ler("nome", request));

		funcionario.setCpf(LeitorParatetrosParaServlet.ler("cpf", request) );
		
		funcionario.setSalario(500D);		

		FuncionarioAplicacao app = new FuncionarioAplicacao();
		app.salvar(funcionario);

		response.sendRedirect("lista-funcionario.do");

	}

}
