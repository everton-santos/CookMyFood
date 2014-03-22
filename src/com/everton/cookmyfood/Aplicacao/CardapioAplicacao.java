package com.everton.cookmyfood.Aplicacao;

import com.everton.cookmyfood.DAO.CardapioDAO;
import com.everton.cookmyfood.Models.Cardapio;

public class CardapioAplicacao extends GenericAplicacao<Cardapio, CardapioDAO> {

	@Override
	public CardapioDAO getDaoInstance() {
		return new CardapioDAO();
	}

}
