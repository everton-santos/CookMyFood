package com.everton.cookmyfood.Aplicacao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import com.everton.cookmyfood.DAO.PedidoTradicionalDAO;
import com.everton.cookmyfood.Models.Delivery;
import com.everton.cookmyfood.Models.Pedido;
import com.everton.cookmyfood.Models.PedidoTradicional;
import com.everton.cookmyfood.Models.StatusPedido;

public class PedidoTradicionalAplicacao extends
		GenericAplicacao<PedidoTradicional, PedidoTradicionalDAO> {

	@Override
	public PedidoTradicionalDAO getDaoInstance() {
		return new PedidoTradicionalDAO();
	}
	
	public void setStatusPedido(Long idPedido, StatusPedido status){
		PedidoTradicional p = new PedidoTradicional();
		p.setId(idPedido);
		p = dao.consultarPorID(p);
		p.setStatus(status);
		dao.salvar(p);
	}
	
	public List<PedidoTradicional> getFluxoCaixa(Date dtInicio, Date dtFinal){
		return dao.getFluxoCaixa(dtInicio, dtFinal);
	}

	@Override
	public PedidoTradicional consultarPorID(Serializable id) {
		PedidoTradicional p = new PedidoTradicional();
		p.setId((Long) id);
		return dao.consultarPorID(p);
	}


}
