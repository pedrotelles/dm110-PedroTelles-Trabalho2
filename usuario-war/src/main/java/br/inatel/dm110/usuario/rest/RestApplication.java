package br.inatel.dm110.usuario.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.inatel.dm110.usuario.impl.UsuarioServiceImpl;
@ApplicationPath("/api")
public class RestApplication extends Application{
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(UsuarioServiceImpl.class);

		return classes;
	}
}
