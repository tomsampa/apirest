package br.com.apirest.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/service")
public class ServiceController {
	
	/**
	 * URL: http://localhost:8080/WebServiceRest/rest/service
	 * @return
	 */
	@GET
	@Produces("application/json; charset=UTF-8")
	public String teste(){
		return "OK";
	}
	
	/**
	 * URL: http://localhost:8080/WebServiceRest/rest/service/Marcel_Viado
	 * @param mensagem
	 * @return
	 */
	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/{mensagem}")
	public String getMensagem(@PathParam("mensagem") String mensagem){
		return mensagem;
	}
}
