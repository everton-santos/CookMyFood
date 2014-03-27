package com.everton.cookmyfood.Aplicacao;

import java.io.Serializable;

import com.everton.cookmyfood.DAO.MesaDAO;
import com.everton.cookmyfood.Models.Mesa;

public class MesaAplicacao extends GenericAplicacao<Mesa, MesaDAO> {

	@Override
	public MesaDAO getDaoInstance() {
		return new MesaDAO();
	}

	@Override
	public Mesa consultarPorID(Serializable id) {
		Mesa m =  new Mesa();
		m.setId((Long) id);
		return dao.consultarPorID(m);
	}
	
}
