package test.jsp.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Listener implements ServletContextListener {
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Context initialized");
	}

	public void contextDestroyed(ServletContextEvent sce) { }
}
