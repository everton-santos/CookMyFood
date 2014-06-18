package com.everton.cookmyfood.Servlets;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everton.cookmyfood.Aplicacao.DeliveryAplicacao;
import com.everton.cookmyfood.Models.Delivery;
import com.everton.cookmyfood.Util.LeitorParatetrosParaServlet;

/**
 * Servlet implementation class ListaPedidoDelivery
 */
@WebServlet("/lista-pedido-delivery.do")
public class ListaPedidoDelivery extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListaPedidoDelivery() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		DeliveryAplicacao app = new DeliveryAplicacao();

		Map<String, Object> atributos = new HashMap<String, Object>();

		try {
			atributos.put("id", Integer.parseInt(LeitorParatetrosParaServlet
					.ler("id", request)));
		} catch (Exception e) {
			e.printStackTrace();
		}

//		try {
//			Long userId = Long.parseLong(request.getSession()
//					.getAttribute("user-id").toString());
//
//			if (userId > 0) {
//				atributos.put("id_cliente", userId);
//			}
//		} catch (Exception e) {
//		}

		List<Delivery> lista;
		if (atributos.size() <= 0) {
			lista = app.listar(new Delivery());
		} else {
			lista = app.listarPorLike(atributos);
		}

		request.setAttribute("model", lista);
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("/lista-pedido-delivery.jsp");
		dispatcher.forward(request, response);

	}

}
