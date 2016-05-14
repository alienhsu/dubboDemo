package com.alienhsu.demo;

import java.io.IOException;
import java.net.URL;

import org.mortbay.jetty.Connector;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.nio.SelectChannelConnector;
import org.mortbay.jetty.webapp.WebAppContext;


class JettyServer {

	int port = 8080; // 端口号
	String webContext = "/dubbodemo"; // 上下文路径
	String resourceBase = "./src/main/webapp"; // web工程目录

	public JettyServer(String configFile) throws IOException {
//		if (configFile == null) {
//		}
	}

	public void startServer() {
		try {
			Server server = new Server();
			Connector connector = new SelectChannelConnector();
			connector.setPort(port);
			server.setConnectors(new Connector[] { connector });
			WebAppContext webapp = new WebAppContext();
			webapp.setContextPath(webContext);
			webapp.setClassLoader(StartApplication.class.getClassLoader());
			webapp.setResourceBase(resourceBase);
			URL resource = StartApplication.class.getResource("webdefault.xml");
			webapp.setDefaultsDescriptor(resource.getFile());
			server.setHandler(webapp);
			server.start();
			server.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class StartApplication {
	public static void main(String[] args) throws Exception {
		JettyServer server = new JettyServer(null);
		server.startServer();
	}
}
