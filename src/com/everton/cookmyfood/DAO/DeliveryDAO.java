package com.everton.cookmyfood.DAO;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import com.everton.cookmyfood.Models.Delivery;

public class DeliveryDAO extends GenericDAO<Delivery> {

	public List<Delivery> getFluxoCaixa(Date dtInicio, Date dtFinal){
		manager = entityManagerFactory.createEntityManager();
		Query query = manager.createQuery(
				String.format("select p from %s p where p.data >= %s and p.data <= %s ", Delivery.class.getName(), dtInicio, dtFinal),
				Delivery.class);
		return query.getResultList();
	}
	
}
