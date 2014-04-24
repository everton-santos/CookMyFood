package com.everton.cookmyfood.DAO;

import com.everton.cookmyfood.Models.Gerente;

public class GerenteDAO extends GenericDAO<Gerente> {

	@Override
	public Class getEntityClass() {
		return Gerente.class;
	}

}
