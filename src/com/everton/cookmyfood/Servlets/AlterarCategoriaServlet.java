package com.everton.cookmyfood.Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everton.cookmyfood.Aplicacao.CategoriaAplicacao;
import com.everton.cookmyfood.Models.Categoria;

@WebServlet("/alterar-categoria.do")
public class AlterarCategoriaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AlterarCategoriaServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Long id = Long.parseLong(request.getParameter("id"));

		CategoriaAplicacao app = new CategoriaAplicacao();

		Categoria categoria = app.consultarPorID(id);

		if (categoria != null) {

			request.setAttribute("categoria", categoria);
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("/alterar-categoria.jsp");
			dispatcher.forward(request, response);

		} else {
			response.sendRedirect("lista-categoria.do");
		}

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Long id = Long.parseLong(request.getParameter("id"));

		String nome = request.getParameter("nome");

		if (nome.length() > 0) {

			CategoriaAplicacao app = new CategoriaAplicacao();

			Categoria categoria = app.consultarPorID(id);

			if (categoria != null) {
				categoria.setNome(nome);
				app.salvar(categoria);
			}
		}

		response.sendRedirect("lista-categoria.do");
	}

}
