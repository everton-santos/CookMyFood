package com.everton.cookmyfood.Aplicacao;

import java.io.Serializable;
import java.util.List;

import com.everton.cookmyfood.DAO.ItemCardapioDAO;
import com.everton.cookmyfood.Models.ItemCardapio;
import com.everton.cookmyfood.Models.Pedido;

public class ItemCardapioAplicacao extends
		GenericAplicacao<ItemCardapio, ItemCardapioDAO> {

	@Override
	public ItemCardapioDAO getDaoInstance() {
		return new ItemCardapioDAO();
	}

	public void salvar(List<ItemCardapio> itens, Pedido p) {
		for (ItemCardapio item : itens) {
			item.setPedido(p);
			dao.salvar(item);
		}
	}

	@Override
	public ItemCardapio consultarPorID(Serializable id) {
		ItemCardapio i = new ItemCardapio();
		i.setId((Long) id);
		return dao.consultarPorID(i);
	}

}
