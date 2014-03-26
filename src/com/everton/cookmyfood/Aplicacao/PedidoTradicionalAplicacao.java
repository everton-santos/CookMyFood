package com.everton.cookmyfood.Aplicacao;

import java.util.List;

import com.everton.cookmyfood.DAO.PedidoTradicionalDAO;
import com.everton.cookmyfood.Models.ItemCardapio;
import com.everton.cookmyfood.Models.PedidoTradicional;
import com.everton.cookmyfood.Models.StatusPedido;

public class PedidoTradicionalAplicacao extends
		GenericAplicacao<PedidoTradicional, PedidoTradicionalDAO> {

	@Override
	public PedidoTradicionalDAO getDaoInstance() {
		return new PedidoTradicionalDAO();
	}

	public void setStatusPedido(Long id, StatusPedido status) {
		PedidoTradicional p = new PedidoTradicional();
		p.setId(id);
		p = dao.consultarPorID(p);
		p.setStatus(status);
		dao.salvar(p);
	}

	public void salvar(PedidoTradicional p, List<ItemCardapio> itens) {
		dao.salvar(p);
		ItemCardapioAplicacao app = new ItemCardapioAplicacao();
		app.salvar(itens, p);
	}

}
