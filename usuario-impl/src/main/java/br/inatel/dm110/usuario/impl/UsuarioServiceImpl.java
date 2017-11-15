package br.inatel.dm110.usuario.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.inatel.dm110.usuario.api.UsuarioService;
import br.inatel.dm110.usuario.interfaces.UsuarioRemote;

@RequestScoped
public class UsuarioServiceImpl implements UsuarioService{

	@EJB(lookup = "java:app/usuario-ejb-0.1-SNAPSHOT/UsuarioBean!br.inatel.dm110.usuario.interfaces.UsuarioRemote")
	private UsuarioRemote usuarioBean;
	@Override
	public List<String> listAllUsers() {
		// TODO Auto-generated method stub
		return usuarioBean.listUserNames();
	}

	@Override
	public void createNewUser(String name, String email) {
		// TODO Auto-generated method stub
		usuarioBean.createNewUser(name, email);
	}

	@Override
	public String helloworld() {
		// TODO Auto-generated method stub
		return "Ta funcionando";
	}

}
