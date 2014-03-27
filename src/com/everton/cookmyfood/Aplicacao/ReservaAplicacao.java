package com.everton.cookmyfood.Aplicacao;

import java.io.Serializable;

import com.everton.cookmyfood.DAO.ReservaDAO;
import com.everton.cookmyfood.Models.Reserva;

public class ReservaAplicacao extends GenericAplicacao<Reserva, ReservaDAO> {

	@Override
	public ReservaDAO getDaoInstance() {
		return new ReservaDAO();
	}

	@Override
	public Reserva consultarPorID(Serializable id) {
		Reserva r = new Reserva();
		r.setId((Long) id);
		return dao.consultarPorID(r);
	}
	
}
