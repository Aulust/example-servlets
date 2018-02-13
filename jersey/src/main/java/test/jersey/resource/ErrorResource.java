package test.jersey.resource;

import test.jersey.Application;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/error")
@Named
@Produces(MediaType.TEXT_PLAIN)
public class ErrorResource {
  @GET
  public String data() {
    throw new Application.TestException();
  }
}
