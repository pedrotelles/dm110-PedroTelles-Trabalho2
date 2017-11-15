package br.inatel.dm110.usuario.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/usuario")
public interface UsuarioService {
	
	@GET
	@Path("/say")
	@Produces(MediaType.APPLICATION_JSON)
	String helloworld();
	
	
	@GET
	@Path("/names")
	@Produces(MediaType.APPLICATION_JSON)
	List<String> listAllUsers();
	
	@POST
	@Path("/")
	
	void createNewUser(@FormParam("name") String name, @FormParam("email") String email);
}
