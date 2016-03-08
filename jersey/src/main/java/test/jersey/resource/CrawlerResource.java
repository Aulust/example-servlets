package test.jersey.resource;

import test.jersey.model.Model;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/data")
@Named
@Produces(MediaType.APPLICATION_JSON)
public class CrawlerResource {
  @GET
  public Response data(@QueryParam("service") String service) {
    Model model = new Model();
    model.setName(service);
    model.setValue(100);

    return Response.ok(model).build();
  }
}
