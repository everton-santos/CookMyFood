package com.everton.cookmyfood.Aplicacao;

import java.io.Serializable;

import com.everton.cookmyfood.DAO.UsuarioDAO;
import com.everton.cookmyfood.Models.Usuario;

public class UsuarioAplicacao extends GenericAplicacao<Usuario, UsuarioDAO> {

	@Override
	public UsuarioDAO getDaoInstance() {
		return new UsuarioDAO();
	}

	public Usuario getUsuarioAutorizado(String loginName, String loginPass) {
		Usuario usuario = new Usuario();
		usuario.setLoginName(loginName);
		usuario.setLoginPass(loginPass);
		return dao.getUsuarioAutorizado(usuario);
	}

	@Override
	public Usuario consultarPorID(Serializable id) {
		Usuario u = new Usuario();
		u.setId((Long) id);
		return dao.consultarPorID(u);
	}

}
