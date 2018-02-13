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

    ServletContextHandler context = new ServletContextHandler();

    context.setContextPath("/");

    server.setHandler(context);

    context.addServlet(new ServletHolder(HelloServlet.class), "/hello");
    context.addServlet(new ServletHolder("more", MoreServlets.class), "/more");
    server.start();
    server.join();
  }

  public static class HelloServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
      System.out.println("Hello servlet init");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html");
      response.setStatus(HttpServletResponse.SC_OK);
      response.getWriter().println("Hello World");

      getServletContext().getRequestDispatcher("/more").forward(request,response);
    }
  }

  public static class MoreServlets extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html");
      response.setStatus(HttpServletResponse.SC_OK);
      response.getWriter().println("MOOOAR!");
    }
  }
}
