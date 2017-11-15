package br.inatel.dm110.usuario.beans;

import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.inatel.dm110.usuario.dao.UsuarioDAO;
import br.inatel.dm110.usuario.entities.Usuario;
import br.inatel.dm110.usuario.interfaces.UsuarioLocal;
import br.inatel.dm110.usuario.interfaces.UsuarioRemote;

@Stateless
@Remote(UsuarioRemote.class)
@Local(UsuarioLocal.class)
public class UsuarioBean implements UsuarioLocal, UsuarioRemote {
	@EJB
	private UsuarioDAO usuarioDAO;
	
	@Override
	public List<String> listUserNames() {
		// TODO Auto-generated method stub
		return usuarioDAO.listAll().stream().map(Usuario::getName).collect(Collectors.toList());
	}

	@Override
	public void createNewUser(String name, String email) {
		Usuario usuario = new Usuario();
		usuario.setName(name);
		usuario.setEmail(email);
		usuarioDAO.insert(usuario);
		
	}
	
}
