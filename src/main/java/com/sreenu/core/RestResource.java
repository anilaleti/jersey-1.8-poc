package com.sreenu.core;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Anil Aleti
 *
 */
@Path("/hello")

public class RestResource {

	/**
	 * 
	 * @param msg
	 * @param content
	 * @return Response
	 */
	@GET
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	public Response getMsg(@QueryParam("param") String msg, @HeaderParam("Content-Type") String content) {

		String output = "Jersey say : " + msg + "header" + content;

		return Response.status(200).entity(output).build();

	}

}
