package com.everton.cookmyfood.DAO;

import com.everton.cookmyfood.Models.ItemCardapio;

public class ItemCardapioDAO extends GenericDAO<ItemCardapio> {

	@Override
	public Class getEntityClass() {
		return ItemCardapio.class;
	}

}
