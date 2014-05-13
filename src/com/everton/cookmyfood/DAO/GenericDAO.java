package com.everton.cookmyfood.DAO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.everton.cookmyfood.Models.AbstractModel;
import com.everton.cookmyfood.Util.StringUtil;

public abstract class GenericDAO<T extends AbstractModel> {

	protected static EntityManagerFactory entityManagerFactory;
	protected EntityManager manager;

	public GenericDAO() {
		if (entityManagerFactory == null) {
			entityManagerFactory = Persistence
					.createEntityManagerFactory("cookmyfood");
		}
	}

	protected abstract Class<T> getEntityClass();

	public void salvar(T obj) {

		T retorno = null;
		try {
			retorno = consultarPorID(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (retorno != null) {
			alterar(obj);
		} else {
			incluir(obj);
		}
	}

	protected void incluir(T obj) {
		manager = entityManagerFactory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(obj);
		manager.getTransaction().commit();
		// manager.close();
	}

	public void remover(T obj) {
		manager = entityManagerFactory.createEntityManager();
		@SuppressWarnings("unchecked")
		T pObj = (T) manager.find(obj.getClass(), obj.GetId());
		manager.getTransaction().begin();
		manager.remove(pObj);
		manager.getTransaction().commit();
		// manager.close();
	}

	@SuppressWarnings("unchecked")
	public T consultarPorID(T obj) {

		T result = null;

		manager = entityManagerFactory.createEntityManager();

		Serializable id = obj.GetId();

		try {
			if (id != null) {
				result = (T) manager.find(obj.getClass(), id);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// manager.close();
		return result;
	}

	@SuppressWarnings("unchecked")
	public List<T> listar(T obj) {
		manager = entityManagerFactory.createEntityManager();
		Query query = manager.createQuery(String.format("select c from %s c",
				obj.getClass().getSimpleName()), obj.getClass());
		return query.getResultList();
	}

	protected void alterar(T obj) {
		manager = entityManagerFactory.createEntityManager();
		manager.getTransaction().begin();
		manager.merge(obj);
		manager.getTransaction().commit();
		// manager.close();
	}

	public List<T> listarPorLike(Map<String, Object> atributos) {
		manager = entityManagerFactory.createEntityManager();

		List<String> atts = new ArrayList<String>();

		for (Entry<String, Object> entry : atributos.entrySet()) {
			
			if (entry.getValue() instanceof String) {
				atts.add(String.format("UPPER(%s) like UPPER(:%s)", entry.getKey(),
						entry.getKey().toString()));
			} else {
				atts.add(String.format("%s = :%s", entry.getKey(),
						entry.getKey().toString()));		
			}
		}

		String sql = String.format("select c from %s c where %s ",
				getEntityClass().getSimpleName(),
				StringUtil.join(atts, " and "));

		Query query = manager.createQuery(sql, getEntityClass());

		for (Entry<String, Object> entry : atributos.entrySet()) {

			if (entry.getValue() instanceof String) {
				query.setParameter(entry.getKey(), "%" + entry.getValue() + "%");
			} else {
				query.setParameter(entry.getKey(), entry.getValue());				
			}

		}

		return query.getResultList();
	}

}
