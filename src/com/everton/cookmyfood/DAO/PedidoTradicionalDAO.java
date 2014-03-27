package com.everton.cookmyfood.DAO;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import com.everton.cookmyfood.Models.PedidoTradicional;

public class PedidoTradicionalDAO extends GenericDAO<PedidoTradicional> {

	public List<PedidoTradicional> getFluxoCaixa(Date dtInicio, Date dtFinal){
		manager = entityManagerFactory.createEntityManager();
		Query query = manager.createQuery(
				String.format("select p from %s p where p.data >= %s and p.data <= %s ", PedidoTradicional.class.getName(), dtInicio, dtFinal),
				PedidoTradicional.class);
		return query.getResultList();
	}
	
}
