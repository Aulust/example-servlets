import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.util.thread.QueuedThreadPool;

public class Jetty2
{
    public static void main( String[] args ) throws Exception
    {
        QueuedThreadPool threadPool = new QueuedThreadPool(5, 1);

        Server server = new Server(threadPool);

        ServerConnector http = new ServerConnector(server, 1, 2);
        http.setPort(8080);
        http.setIdleTimeout(30000);

        server.setConnectors(new Connector[] { http });




        ResourceHandler resourceHandler = new ResourceHandler();

        resourceHandler.setDirectoriesListed(true);
        resourceHandler.setResourceBase(".");

        ContextHandler fileContext = new ContextHandler();
        fileContext.setContextPath("/files");
        fileContext.setHandler(resourceHandler);

        ContextHandler httpContext = new ContextHandler();
        httpContext.setContextPath("/data");
        httpContext.setHandler(new Jetty());

        ContextHandlerCollection contexts = new ContextHandlerCollection();
        contexts.setHandlers(new Handler[] { httpContext, fileContext });

        server.setHandler(contexts);

        server.start();
        server.join();
    }
}
