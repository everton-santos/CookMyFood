package com.everton.cookmyfood.DAO;

import com.everton.cookmyfood.Models.Mesa;

public class MesaDAO extends GenericDAO<Mesa> {

	@Override
	public Class getEntityClass() {
		return Mesa.class;
	}

}
