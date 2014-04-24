package com.everton.cookmyfood.DAO;

import com.everton.cookmyfood.Models.Cardapio;

public class CardapioDAO extends GenericDAO<Cardapio> {

	@Override
	public Class getEntityClass() {
		return Cardapio.class;
	}

}
