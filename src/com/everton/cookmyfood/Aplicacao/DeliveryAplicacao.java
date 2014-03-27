package com.everton.cookmyfood.Aplicacao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.everton.cookmyfood.DAO.DeliveryDAO;
import com.everton.cookmyfood.Models.Delivery;

public class DeliveryAplicacao extends GenericAplicacao<Delivery, DeliveryDAO> {

	@Override
	public DeliveryDAO getDaoInstance() {
		return new DeliveryDAO();
	}
	
	public List<Delivery> getFluxoCaixa(Date dtInicio, Date dtFinal){
		return dao.getFluxoCaixa(dtInicio, dtFinal);
	}

	@Override
	public Delivery consultarPorID(Serializable id) {
		Delivery d = new Delivery();
		d.setId((Long) id);
		return dao.consultarPorID(d);
	}

}
