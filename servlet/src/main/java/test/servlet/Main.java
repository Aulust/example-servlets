package test.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class Main {
  public static void main(String[] args) throws Exception {
    Server server = new Server(8080);

    ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);

    context.setContextPath("/hello");

    server.setHandler(context);

    context.addServlet(new ServletHolder(new HelloServlet()), "/tt");
    server.start();
  }

  public static class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html");
      response.setStatus(HttpServletResponse.SC_OK);
      response.getWriter().println("Hello World");
    }
  }
}
