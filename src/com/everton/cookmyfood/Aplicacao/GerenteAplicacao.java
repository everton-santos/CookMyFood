package com.everton.cookmyfood.Aplicacao;

import java.io.Serializable;

import com.everton.cookmyfood.DAO.GerenteDAO;
import com.everton.cookmyfood.Models.Gerente;

public class GerenteAplicacao extends GenericAplicacao<Gerente,GerenteDAO> {

	@Override
	public GerenteDAO getDaoInstance() {
		return new GerenteDAO();
	}

	@Override
	public Gerente consultarPorID(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

}
