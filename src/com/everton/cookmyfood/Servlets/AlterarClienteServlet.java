package com.everton.cookmyfood.Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everton.cookmyfood.Aplicacao.ClienteAplicacao;
import com.everton.cookmyfood.Models.Cliente;

@WebServlet("/alterar-cliente.do")
public class AlterarClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AlterarClienteServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("id"));

		ClienteAplicacao app = new ClienteAplicacao();

		Cliente cliente = app.consultarPorID(id);

		if (cliente != null) {

			request.setAttribute("cliente", cliente);
			
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("/alterar-cliente.jsp");
			
			dispatcher.forward(request, response);

		} else {
			response.sendRedirect("lista-cliente.do");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
