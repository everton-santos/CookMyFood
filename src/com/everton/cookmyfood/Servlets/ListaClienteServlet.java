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

import com.everton.cookmyfood.Aplicacao.CategoriaAplicacao;
import com.everton.cookmyfood.Aplicacao.ClienteAplicacao;
import com.everton.cookmyfood.Models.Categoria;
import com.everton.cookmyfood.Models.Cliente;

@WebServlet("/lista-cliente.do")
public class ListaClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public ListaClienteServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClienteAplicacao app = new ClienteAplicacao();
		
		String pesquisa = "";

		try {
			pesquisa = request.getParameter("p");
		} catch (Exception e) {
			
		}

		List<Cliente> lista = Collections.EMPTY_LIST;

		if (pesquisa == null || pesquisa.equals("")) {
			lista = app.listar(new Cliente());
		}
		else
		{
			Map<String, Object> atributos = new HashMap<String, Object>();
			atributos.put("nome", pesquisa);
			
			lista = app.listarPorLike(atributos);
		}
		

		request.setAttribute("lista", lista);
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("/lista-cliente.jsp");
		dispatcher.forward(request, response);		
	}

}
