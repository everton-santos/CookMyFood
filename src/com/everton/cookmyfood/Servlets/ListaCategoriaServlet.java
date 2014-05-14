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
import com.everton.cookmyfood.Models.Categoria;

@WebServlet("/lista-categoria.do")
public class ListaCategoriaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListaCategoriaServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String pesquisa = "";

		try {
			pesquisa = request.getParameter("p");
		} catch (Exception e) {
			
		}

		CategoriaAplicacao app = new CategoriaAplicacao();
		List<Categoria> categorias = Collections.EMPTY_LIST;

		if (pesquisa == null || pesquisa.equals("")) {
			categorias = app.listar(new Categoria());
		}
		else
		{
			Map<String, Object> atributos = new HashMap<String, Object>();
			atributos.put("nome", pesquisa);
			
			categorias = app.listarPorLike(atributos);
		}

		request.setAttribute("categorias", categorias);
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("/lista-categoria.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
