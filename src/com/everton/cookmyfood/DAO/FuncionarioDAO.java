package com.everton.cookmyfood.DAO;

import javax.persistence.Query;

import com.everton.cookmyfood.Models.Funcionario;

public class FuncionarioDAO extends GenericDAO<Funcionario> {

	public Funcionario getUsuarioAutorizado(Funcionario usuario) {

		manager = entityManagerFactory.createEntityManager();
		Query query = manager
				.createQuery(
						String.format(
								"select c from %s c where c.loginname = '%s' and c.loginpass '%s'",
								Funcionario.class.getName(),
								usuario.getLoginName(), usuario.getLoginPass()),
						Funcionario.class);

		Funcionario user = (Funcionario) query.getSingleResult();
		return user;

	}

	@Override
	public Class getEntityClass() {
		return Funcionario.class;
	}

}
