package com.everton.cookmyfood.Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everton.cookmyfood.Aplicacao.CategoriaAplicacao;
import com.everton.cookmyfood.Aplicacao.MesaAplicacao;
import com.everton.cookmyfood.Models.Categoria;
import com.everton.cookmyfood.Models.Mesa;

/**
 * Servlet implementation class CadastroMesaServlet
 */
@WebServlet("/cadastro-mesa.do")
public class CadastroMesaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CadastroMesaServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Mesa c = new Mesa();

		int numero = Integer.parseInt(request.getParameter("numero"));

		c.setNumero(numero);
		
		int capacidade = Integer.parseInt(request.getParameter("capacidade"));
		
		c.setCapacidade(capacidade);

		MesaAplicacao app = new MesaAplicacao();
		app.salvar(c);

		response.sendRedirect("lista-mesa.do");

	}

}
