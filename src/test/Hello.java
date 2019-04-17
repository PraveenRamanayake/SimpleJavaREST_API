package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Path("/hello")
public class Hello {

		@GET
		@Produces(MediaType.TEXT_XML)
		public String SayHello()
		{
			String resource="<?xml version='1.0' ?>" +
			"<hello>This is from XML</hello>";

			return resource;
			
		}


		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public String SayHelloJSON()
		{
			String resource=null;
			return resource;
			
		}
		

		@GET
		@Produces(MediaType.TEXT_HTML)
		public String SayHelloHTML()
		{
			String resource="<h1>This is from HTML</h1>";
			return resource;
			
		}
}
