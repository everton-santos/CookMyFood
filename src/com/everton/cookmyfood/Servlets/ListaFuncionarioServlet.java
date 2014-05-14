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

import com.everton.cookmyfood.Aplicacao.FuncionarioAplicacao;
import com.everton.cookmyfood.Aplicacao.MesaAplicacao;
import com.everton.cookmyfood.Models.Funcionario;
import com.everton.cookmyfood.Models.Mesa;

/**
 * Servlet implementation class ListaFuncionarioServlet
 */
@WebServlet("/lista-funcionario.do")
public class ListaFuncionarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListaFuncionarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String pesquisa = "";

		try {
			pesquisa = request.getParameter("p");
		} catch (Exception e) {
			
		}

		FuncionarioAplicacao app = new FuncionarioAplicacao();
		List<Funcionario> lista = Collections.EMPTY_LIST;

		if (pesquisa == null || pesquisa.equals("")) {
			lista = app.listar(new Funcionario());
		}
		else
		{
			Map<String, Object> atributos = new HashMap<String, Object>();
			atributos.put("nome", pesquisa);
			
			lista = app.listarPorLike(atributos);
		}

		request.setAttribute("lista", lista);
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("/lista-funcionario.jsp");
		dispatcher.forward(request, response);

		
		
	}

	

}
