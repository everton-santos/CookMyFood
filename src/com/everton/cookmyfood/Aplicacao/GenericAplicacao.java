package com.everton.cookmyfood.Aplicacao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.everton.cookmyfood.DAO.GenericDAO;
import com.everton.cookmyfood.Models.AbstractModel;

public abstract class GenericAplicacao<T extends AbstractModel, D extends GenericDAO<T>> {

	protected D dao = getDaoInstance();

	public abstract D getDaoInstance();

	public void salvar(T obj) {
		dao.salvar(obj);
	}

	public void remover(T obj) {
		dao.remover(obj);
	}

	public List<T> listar(T obj) {
		return dao.listar(obj);
	}
	
	public abstract T consultarPorID(Serializable id);
	
	public List<T> listarPorLike(Map<String, Object> atributos){
		return dao.listarPorLike(atributos);
	}
	

}
