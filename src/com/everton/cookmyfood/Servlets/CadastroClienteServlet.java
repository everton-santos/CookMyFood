package com.everton.cookmyfood.Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everton.cookmyfood.Aplicacao.ClienteAplicacao;
import com.everton.cookmyfood.Models.Cliente;
import com.everton.cookmyfood.Models.Endereco;
import com.everton.cookmyfood.Util.LeitorParatetrosParaServlet;

/**
 * Servlet implementation class CadastroClienteServlet
 */
@WebServlet("/cadastro-cliente.do")
public class CadastroClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CadastroClienteServlet() {
		super();

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Cliente cliente = new Cliente();
		
		cliente.setCelular(LeitorParatetrosParaServlet.ler("celular", request));
		cliente.setEmail(LeitorParatetrosParaServlet.ler("email", request));
		cliente.setLoginName(LeitorParatetrosParaServlet.ler("loginName", request));
		cliente.setLoginPass(LeitorParatetrosParaServlet.ler("loginPass", request));
		cliente.setNome(LeitorParatetrosParaServlet.ler("nome", request));
		
		Endereco endereco = new Endereco();
		
		endereco.setBairro(LeitorParatetrosParaServlet.ler("bairro", request));
		endereco.setCep(Integer.parseInt( LeitorParatetrosParaServlet.ler("cep", request)));
		endereco.setComplemento(LeitorParatetrosParaServlet.ler("complemento", request));
		endereco.setLogradouro(LeitorParatetrosParaServlet.ler("logradouro", request));
		endereco.setNumero(LeitorParatetrosParaServlet.ler("numero", request));
		endereco.setTelefone(LeitorParatetrosParaServlet.ler("celular", request));
		
		cliente.setEndereco(endereco);
		
		ClienteAplicacao app = new ClienteAplicacao();
		app.salvar(cliente);
		
		response.sendRedirect("index.html");
	}

}
