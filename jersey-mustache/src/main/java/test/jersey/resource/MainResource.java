package test.jersey.resource;

import org.glassfish.jersey.server.mvc.Template;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/")
@Produces(MediaType.TEXT_HTML)
public class MainResource {
  @GET
  @Template(name = "/main")
  public Map<String, Object> data() {
    Map<String, Object> context = new HashMap<>();
    context.put("name", "Test name");
    context.put("comment", "Test comment");

    return context;
  }
}
