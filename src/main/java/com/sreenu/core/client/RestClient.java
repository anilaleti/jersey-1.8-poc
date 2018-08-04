package com.sreenu.core.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * 
 * @author Anil Aleti
 *
 */

public class RestClient {

	
	public static void main(String[] args) {

		Client client = Client.create();
		WebResource webResource = client.resource("http://localhost:9090/jersey-1.8-poc/rest/hello/");

		/*
		 * MultivaluedMap<String, String> queryParams = new
		 * MultivaluedMapImpl(); queryParams.add("param", "hi"); //set parametes
		 * for request
		 */
		ClientResponse response = null;
		response = webResource.queryParam("param", "hi").header("Content-Type", "text").get(ClientResponse.class);

		System.out.println(response.getEntity(String.class));

	}

}
