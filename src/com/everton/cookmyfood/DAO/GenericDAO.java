package com.everton.cookmyfood.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.everton.cookmyfood.Models.AbstractModel;

public abstract class GenericDAO<T extends AbstractModel> {

	protected static EntityManagerFactory entityManagerFactory;
	protected EntityManager manager;

	public GenericDAO() {
		if (entityManagerFactory == null) {
			entityManagerFactory = Persistence
					.createEntityManagerFactory("cookmyfood");
		}
	}

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
		manager.close();
	}

	public void remover(T obj) {
		manager = entityManagerFactory.createEntityManager();
		T pObj = (T) manager.find(obj.getClass(), obj.GetId());
		manager.getTransaction().begin();
		manager.remove(pObj);
		manager.getTransaction().commit();
		manager.close();
	}

	public T consultarPorID(T obj) {

		T result = null;

		manager = entityManagerFactory.createEntityManager();

		Serializable id = obj.GetId();

		try {
			if (id != null) {
				result =  (T) manager.find(obj.getClass(), id);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		manager.close();
		return result;
	}

	public List<T> listar(T obj) {
		manager = entityManagerFactory.createEntityManager();
		Query query = manager.createQuery(
				String.format("select c from %s c", obj.getClass().getName()),
				obj.getClass());
		return query.getResultList();
	}

	protected void alterar(T obj) {
		manager = entityManagerFactory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(obj);
		manager.getTransaction().commit();
		manager.close();
	}

}
