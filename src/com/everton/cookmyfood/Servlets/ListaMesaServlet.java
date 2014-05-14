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
import com.everton.cookmyfood.Aplicacao.MesaAplicacao;
import com.everton.cookmyfood.Models.Categoria;
import com.everton.cookmyfood.Models.Mesa;

/**
 * Servlet implementation class ListaMesaServlet
 */
@WebServlet("/lista-mesa.do")
public class ListaMesaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaMesaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String pesquisa = "";

		try {
			pesquisa = request.getParameter("p");
		} catch (Exception e) {
			
		}

		MesaAplicacao app = new MesaAplicacao();
		List<Mesa> categorias = Collections.EMPTY_LIST;

		if (pesquisa == null || pesquisa.equals("")) {
			categorias = app.listar(new Mesa());
		}
		else
		{
			Map<String, Object> atributos = new HashMap<String, Object>();
			atributos.put("numero", pesquisa);
			atributos.put("capacidade", pesquisa);
			
			categorias = app.listarPorLike(atributos);
		}

		request.setAttribute("lista", categorias);
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("/lista-mesa.jsp");
		dispatcher.forward(request, response);
		
		
	}

	

}
