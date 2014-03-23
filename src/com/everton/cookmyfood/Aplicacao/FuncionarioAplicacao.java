package com.everton.cookmyfood.Aplicacao;

import com.everton.cookmyfood.DAO.FuncionarioDAO;
import com.everton.cookmyfood.Models.Funcionario;

public class FuncionarioAplicacao extends GenericAplicacao<Funcionario, FuncionarioDAO> {

	@Override
	public FuncionarioDAO getDaoInstance() {
		return new FuncionarioDAO();
	}

}
