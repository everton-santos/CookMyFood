package com.everton.cookmyfood.Aplicacao;

import com.everton.cookmyfood.DAO.ReservaDAO;
import com.everton.cookmyfood.Models.Reserva;

public class ReservaAplicacao extends GenericAplicacao<Reserva, ReservaDAO> {

	@Override
	public ReservaDAO getDaoInstance() {
		return new ReservaDAO();
	}
	
}
