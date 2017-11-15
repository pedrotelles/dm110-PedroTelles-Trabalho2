package br.inatel.dm110.usuario.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.inatel.dm110.usuario.entities.Usuario;

@Stateless
public class UsuarioDAO {
	

		@PersistenceContext(unitName = "usuario")
		private EntityManager em;

		public List<Usuario> listAll() {
			return em.createQuery("from Usuario p", Usuario.class).getResultList();
		}

		public void insert(Usuario usuario) {
			em.persist(usuario);
		}

	
}
