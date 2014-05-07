package com.everton.cookmyfood.Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everton.cookmyfood.Aplicacao.CategoriaAplicacao;
import com.everton.cookmyfood.Models.Categoria;

@WebServlet("/cadastro-categoria.do")
public class CadastroCategoriaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CadastroCategoriaServlet() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		Categoria c = new Categoria();
		
		String nome = request.getParameter("nome");
		
		c.setNome(nome);

		CategoriaAplicacao app = new CategoriaAplicacao();
		app.salvar(c);
		
	}

}
