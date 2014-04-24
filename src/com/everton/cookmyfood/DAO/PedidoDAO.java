package com.everton.cookmyfood.DAO;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import com.everton.cookmyfood.Models.Pedido;

public class PedidoDAO  extends GenericDAO<Pedido>{
	
	@SuppressWarnings("unchecked")
	public List<Pedido> getFluxoCaixa(Date dtInicio, Date dtFinal){
		manager = entityManagerFactory.createEntityManager();
		Query query = manager.createQuery(
				String.format("select p from %s p where p.data >= %s and p.data <= %s ", Pedido.class.getName(), dtInicio, dtFinal),
				Pedido.class);
		return query.getResultList();
	}

	@Override
	public Class getEntityClass() {
		return Pedido.class;
	}

}
