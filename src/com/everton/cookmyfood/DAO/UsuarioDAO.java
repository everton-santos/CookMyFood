package com.everton.cookmyfood.DAO;

import javax.persistence.Query;

import com.everton.cookmyfood.Models.Usuario;

public class UsuarioDAO extends GenericDAO<Usuario> {

	public Usuario getUsuarioAutorizado(Usuario usuario) {
		manager = entityManagerFactory.createEntityManager();
		Query query = manager.createQuery(String.format(
				"select c from %s c where c.loginName = ? and c.loginPass = ?",
				Usuario.class.getSimpleName()), Usuario.class);
		
		query.setParameter(1, usuario.getLoginName());
		query.setParameter(2, usuario.getLoginPass());
		
		Usuario user = (Usuario) query.getSingleResult();
		return user;
	}

	@Override
	public Class getEntityClass() {
		return Usuario.class;
	}

}
