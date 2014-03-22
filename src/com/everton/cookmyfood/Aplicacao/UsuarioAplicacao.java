package com.everton.cookmyfood.Aplicacao;

import com.everton.cookmyfood.DAO.UsuarioDAO;
import com.everton.cookmyfood.Models.Usuario;

public class UsuarioAplicacao extends GenericAplicacao<Usuario, UsuarioDAO> {

	@Override
	public UsuarioDAO getDaoInstance() {
		return new UsuarioDAO();
	}

}
