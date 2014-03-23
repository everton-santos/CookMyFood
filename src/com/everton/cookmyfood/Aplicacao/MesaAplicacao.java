package com.everton.cookmyfood.Aplicacao;

import com.everton.cookmyfood.DAO.MesaDAO;
import com.everton.cookmyfood.Models.Mesa;

public class MesaAplicacao extends GenericAplicacao<Mesa, MesaDAO> {

	@Override
	public MesaDAO getDaoInstance() {
		return new MesaDAO();
	}

}
