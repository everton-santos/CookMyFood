package com.everton.cookmyfood.Aplicacao;

import com.everton.cookmyfood.DAO.PedidoTradicionalDAO;
import com.everton.cookmyfood.Models.PedidoTradicional;

public class PedidoTradicionalAplicacao extends GenericAplicacao<PedidoTradicional, PedidoTradicionalDAO> {

	@Override
	public PedidoTradicionalDAO getDaoInstance() {
		return new PedidoTradicionalDAO();
	}

}
