package com.everton.cookmyfood.Testes;

import com.everton.cookmyfood.Aplicacao.UsuarioAplicacao;
import com.everton.cookmyfood.Models.Usuario;



public class TesteClass {
	public static void main(String[] args) {

		Usuario user = new Usuario();
		user.setLoginName("everton");
		user.setLoginPass("123");
		user.setNome("Everton Pereira");
		
		UsuarioAplicacao app = new UsuarioAplicacao();
		app.salvar(user);
		
	}
}
