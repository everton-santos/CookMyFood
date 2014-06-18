package com.everton.cookmyfood.Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everton.cookmyfood.Aplicacao.ItemCardapioAplicacao;
import com.everton.cookmyfood.Models.ItemCardapio;

@WebServlet("/excluir-item-cardapio.do")
public class ExcluirItemCardapio extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ExcluirItemCardapio() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Long id = Long.parseLong(request.getParameter("id"));

		ItemCardapioAplicacao app = new ItemCardapioAplicacao();

		ItemCardapio cliente = app.consultarPorID(id);

		id = cliente.getPedido().getId();

		app.remover(cliente);

		response.sendRedirect("cadastro-pedido-delivery.do?id=" + id);

	}

}
