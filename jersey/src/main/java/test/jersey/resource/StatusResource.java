package test.jersey.resource;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/status")
@Named
public class StatusResource {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String status() {
    return "ok";
  }
}
