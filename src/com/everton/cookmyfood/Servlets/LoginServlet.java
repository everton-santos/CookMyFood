package com.everton.cookmyfood.Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everton.cookmyfood.Aplicacao.UsuarioAplicacao;
import com.everton.cookmyfood.Models.Usuario;
import com.everton.cookmyfood.Util.LeitorParatetrosParaServlet;


@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		UsuarioAplicacao app = new UsuarioAplicacao();
		
		Usuario u =  app.getUsuarioAutorizado(LeitorParatetrosParaServlet.ler("loginName", request), LeitorParatetrosParaServlet.ler("loginPass", request) );
	
		request.getSession().setAttribute("user-id", u.getId());
		request.getSession().setAttribute("user-name", u.getLoginName());
		
		response.sendRedirect("lista-categoria.do");
		
	}

}
