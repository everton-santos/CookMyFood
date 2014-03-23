package com.everton.cookmyfood.Aplicacao;

import com.everton.cookmyfood.DAO.CategoriaDAO;
import com.everton.cookmyfood.Models.Categoria;

public class CategoriaAplicacao extends GenericAplicacao<Categoria, CategoriaDAO> {

	@Override
	public CategoriaDAO getDaoInstance() {
		return new CategoriaDAO();
	}

}
