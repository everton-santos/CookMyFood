package com.everton.cookmyfood.DAO;

import javax.persistence.Query;

import com.everton.cookmyfood.Models.Usuario;

public class UsuarioDAO extends GenericDAO<Usuario> {

	public Usuario getUsuarioAutorizado(Usuario usuario) {
		manager = entityManagerFactory.createEntityManager();
		Query query = manager.createQuery(String.format(
				"select c from %s c where c.loginname = %s and c.loginpass %s",
				Usuario.class.getName(), usuario.getLoginName(),
				usuario.getLoginPass()), Usuario.class);
		
		Usuario user = (Usuario) query.getSingleResult();
		return user;
	}

	@Override
	public Class getEntityClass() {
		return Usuario.class;
	}

}
