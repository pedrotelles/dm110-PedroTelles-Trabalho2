package br.inatel.dm110.usuario.interfaces;

import java.util.List;
public interface Usuario {
	
	List<String> listUserNames();
	
	void createNewUser(String name,String email);
}
