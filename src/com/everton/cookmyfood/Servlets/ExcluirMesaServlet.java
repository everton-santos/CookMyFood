package com.everton.cookmyfood.Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everton.cookmyfood.Aplicacao.MesaAplicacao;
import com.everton.cookmyfood.Models.Mesa;

/**
 * Servlet implementation class ExcluirMesaServlet
 */
@WebServlet("/excluir-mesa.do")
public class ExcluirMesaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ExcluirMesaServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Long id = Long.parseLong(request.getParameter("id"));

		MesaAplicacao app = new MesaAplicacao();

		Mesa c = new Mesa();

		c.setId(id);

		app.remover(c);

		response.sendRedirect("lista-mesa.do");

	}

}
