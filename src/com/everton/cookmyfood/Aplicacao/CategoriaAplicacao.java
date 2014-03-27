package com.everton.cookmyfood.Aplicacao;

import java.io.Serializable;

import com.everton.cookmyfood.DAO.CategoriaDAO;
import com.everton.cookmyfood.Models.Categoria;

public class CategoriaAplicacao extends GenericAplicacao<Categoria, CategoriaDAO> {

	@Override
	public CategoriaDAO getDaoInstance() {
		return new CategoriaDAO();
	}

	@Override
	public Categoria consultarPorID(Serializable id) {
		Categoria c = new Categoria();
		c.setId((Long) id);
		return dao.consultarPorID(c);
	}

}
