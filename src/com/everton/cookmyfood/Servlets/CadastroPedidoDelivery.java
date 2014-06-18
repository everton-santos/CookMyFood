package com.everton.cookmyfood.Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everton.cookmyfood.Aplicacao.CardapioAplicacao;
import com.everton.cookmyfood.Aplicacao.ClienteAplicacao;
import com.everton.cookmyfood.Aplicacao.DeliveryAplicacao;
import com.everton.cookmyfood.Aplicacao.ItemCardapioAplicacao;
import com.everton.cookmyfood.Models.Cardapio;
import com.everton.cookmyfood.Models.Cliente;
import com.everton.cookmyfood.Models.Delivery;
import com.everton.cookmyfood.Models.ItemCardapio;
import com.everton.cookmyfood.Models.StatusPedido;

@WebServlet("/cadastro-pedido-delivery.do")
public class CadastroPedidoDelivery extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CadastroPedidoDelivery() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		DeliveryAplicacao app = new DeliveryAplicacao();

		Delivery delivery = null;

		try {
			Long id = Long.parseLong(request.getParameter("id"));

			delivery = app.consultarPorID(id);
		} catch (NumberFormatException e) {
		}

		if (delivery == null) {
			delivery = new Delivery();
			delivery.setStatus(StatusPedido.EmConsumo);

			Long idCliente = Long.parseLong(request.getSession()
					.getAttribute("user-id").toString());

			ClienteAplicacao clienteAplicacao = new ClienteAplicacao();

			Cliente cliente = clienteAplicacao.consultarPorID(idCliente);

			delivery.setCliente(cliente);

			app.salvar(delivery);

		}

		List<Cardapio> cardapios = new CardapioAplicacao()
				.listar(new Cardapio());

		if (cardapios == null) {
			cardapios = new ArrayList<Cardapio>();
		}

		request.setAttribute("pedido", delivery);
		request.setAttribute("cardapios", cardapios);

		RequestDispatcher dispatcher = request
				.getRequestDispatcher("/cadastro-pedido-delivery.jsp");

		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		
		Long id = Long.parseLong(request.getParameter("id"));

		DeliveryAplicacao app = new DeliveryAplicacao();
		
		Delivery delivery = app.consultarPorID(id);
		
		ItemCardapio item = new ItemCardapio();
		
		item.setPedido(delivery);
		
		int quantidade = Integer.parseInt(request.getParameter("quantidade"));
		
		item.setQuantidade(quantidade);
		
		Long idCardapio = Long.parseLong(request.getParameter("idCardapio"));
		
		Cardapio cardapio = new CardapioAplicacao().consultarPorID(idCardapio);
		
		item.setCardapio(cardapio);
		
		ItemCardapioAplicacao aplicacao = new  ItemCardapioAplicacao();
		
		app.salvar(delivery);
		
		aplicacao.salvar(item);
		
		response.sendRedirect("cadastro-pedido-delivery.do?id="+ delivery.getId());
		
	}

}
