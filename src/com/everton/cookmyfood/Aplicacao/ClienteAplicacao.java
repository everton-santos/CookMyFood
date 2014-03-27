package com.everton.cookmyfood.Aplicacao;

import java.io.Serializable;

import com.everton.cookmyfood.DAO.ClienteDAO;
import com.everton.cookmyfood.Models.Cliente;

public class ClienteAplicacao extends GenericAplicacao<Cliente, ClienteDAO> {

	@Override
	public ClienteDAO getDaoInstance() {
		return new ClienteDAO();
	}

	@Override
	public Cliente consultarPorID(Serializable id) {
		Cliente c = new Cliente();
		c.setId((Long) id);
		return dao.consultarPorID(c);
	}

}
