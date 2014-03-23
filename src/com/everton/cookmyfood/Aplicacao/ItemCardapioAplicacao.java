package com.everton.cookmyfood.Aplicacao;

import com.everton.cookmyfood.DAO.ItemCardapioDAO;
import com.everton.cookmyfood.Models.ItemCardapio;

public class ItemCardapioAplicacao extends GenericAplicacao<ItemCardapio, ItemCardapioDAO> {

	@Override
	public ItemCardapioDAO getDaoInstance() {
		return new ItemCardapioDAO();
	}

}
