package com.everton.cookmyfood.Aplicacao;

import java.io.Serializable;

import com.everton.cookmyfood.DAO.CardapioDAO;
import com.everton.cookmyfood.Models.Cardapio;

public class CardapioAplicacao extends GenericAplicacao<Cardapio, CardapioDAO> {

	@Override
	public CardapioDAO getDaoInstance() {
		return new CardapioDAO();
	}

	@Override
	public Cardapio consultarPorID(Serializable id) {
		Cardapio c = new Cardapio();
		c.setId((Long) id);
		return dao.consultarPorID(c);
	}

}
