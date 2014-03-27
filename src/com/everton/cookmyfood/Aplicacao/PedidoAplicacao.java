package com.everton.cookmyfood.Aplicacao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.everton.cookmyfood.DAO.PedidoDAO;
import com.everton.cookmyfood.Models.Pedido;

public class PedidoAplicacao extends GenericAplicacao<Pedido, PedidoDAO> {

	@Override
	public PedidoDAO getDaoInstance() {
		return new PedidoDAO();
	}
	
	public List<Pedido> getFluxoCaixa(Date dtInicio, Date dtFinal){
		return dao.getFluxoCaixa(dtInicio, dtFinal);
	}

	@Override
	public Pedido consultarPorID(Serializable id) {
		Pedido p = new Pedido();
		p.setId((Long) id);
		return dao.consultarPorID(p);
	}

}
