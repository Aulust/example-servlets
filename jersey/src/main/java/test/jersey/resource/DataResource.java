package test.jersey.resource;

import test.jersey.model.Model;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/data")
@Named
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public class DataResource {

  @Context
  private HttpHeaders httpHeaders;

  @GET
  public Response data(@QueryParam("service") String service) {
    Model model = new Model();
    model.setName(service);
    model.setValue(100);

    return Response.ok(model).build();
  }

  @GET
  @Path("/param/{test}")
  @Produces(MediaType.TEXT_PLAIN)
  public String data(@PathParam("test") Integer test) {
    return String.valueOf(test) + "\n" + httpHeaders.getRequestHeaders().toString();
  }
}
