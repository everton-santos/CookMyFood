package com.everton.cookmyfood.Aplicacao;

import java.io.Serializable;

import com.everton.cookmyfood.DAO.FuncionarioDAO;
import com.everton.cookmyfood.Models.Funcionario;

public class FuncionarioAplicacao extends GenericAplicacao<Funcionario, FuncionarioDAO> {

	@Override
	public FuncionarioDAO getDaoInstance() {
		return new FuncionarioDAO();
	}

	@Override
	public Funcionario consultarPorID(Serializable id) {
		Funcionario f = new Funcionario();
		f.setId((Long) id);
		return dao.consultarPorID(f);
	}
	
	public Funcionario getUsuarioAutorizado(String loginName, String loginPass) {
		Funcionario usuario = new Funcionario();
		usuario.setLoginName(loginName);
		usuario.setLoginPass(loginPass);
		return dao.getUsuarioAutorizado(usuario);
	
	}

}
