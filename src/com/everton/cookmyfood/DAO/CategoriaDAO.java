package com.everton.cookmyfood.DAO;

import com.everton.cookmyfood.Models.Categoria;

public class CategoriaDAO extends GenericDAO<Categoria> {

	@Override
	public Class getEntityClass() {
		return Categoria.class;
	}

}
