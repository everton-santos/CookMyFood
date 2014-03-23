package com.everton.cookmyfood.Aplicacao;

import com.everton.cookmyfood.DAO.PedidoDAO;
import com.everton.cookmyfood.Models.Pedido;

public class PedidoAplicacao extends GenericAplicacao<Pedido, PedidoDAO> {

	@Override
	public PedidoDAO getDaoInstance() {
		return new PedidoDAO();
	}

}
