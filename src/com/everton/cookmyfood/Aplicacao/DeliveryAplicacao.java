package com.everton.cookmyfood.Aplicacao;

import com.everton.cookmyfood.DAO.DeliveryDAO;
import com.everton.cookmyfood.Models.Delivery;

public class DeliveryAplicacao extends GenericAplicacao<Delivery, DeliveryDAO> {

	@Override
	public DeliveryDAO getDaoInstance() {
		return new DeliveryDAO();
	}

}
