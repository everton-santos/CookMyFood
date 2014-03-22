package com.everton.cookmyfood.Aplicacao;

import com.everton.cookmyfood.DAO.ClienteDAO;
import com.everton.cookmyfood.Models.Cliente;

public class ClienteAplicacao extends GenericAplicacao<Cliente, ClienteDAO> {

	@Override
	public ClienteDAO getDaoInstance() {
		return new ClienteDAO();
	}

}
