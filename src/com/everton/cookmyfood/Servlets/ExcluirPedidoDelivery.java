package com.everton.cookmyfood.Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everton.cookmyfood.Aplicacao.ItemCardapioAplicacao;
import com.everton.cookmyfood.Aplicacao.PedidoAplicacao;
import com.everton.cookmyfood.Models.ItemCardapio;
import com.everton.cookmyfood.Models.Pedido;

/**
 * Servlet implementation class ExcluirPedidoDelivery
 */
@WebServlet("/excluir-pedido-delivery.do")
public class ExcluirPedidoDelivery extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ExcluirPedidoDelivery() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("id"));

		PedidoAplicacao app = new PedidoAplicacao();

		Pedido cliente = app.consultarPorID(id);
		
		if (cliente.getItensCardapio().size() > 0) {
			
			for (ItemCardapio cardapio : cliente.getItensCardapio()) {
				ItemCardapioAplicacao app2 = new ItemCardapioAplicacao();
				app2.remover(cardapio);	
			}
		}

		app.remover(cliente);

		response.sendRedirect("lista-pedido-delivery.do");
	}

}
