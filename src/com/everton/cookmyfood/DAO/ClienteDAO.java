package com.everton.cookmyfood.DAO;

import com.everton.cookmyfood.Models.Cliente;

public class ClienteDAO  extends GenericDAO<Cliente>{

	@Override
	public Class getEntityClass() {
		return Cliente.class;
	}

}
