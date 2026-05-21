package com.davih.tst.test.springboot.boot.server;

//import org.eclipse.jetty.server.Server;
//import org.eclipse.jetty.server.ServerConnector;
//import org.eclipse.jetty.servlet.ServletContextHandler;
//import org.eclipse.jetty.servlet.ServletHolder;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class JettyWebServer implements WebServer{

    private WebApplicationContext applicationContext;

    public JettyWebServer(WebApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public void start() {
        System.out.println("jetty start ... ");
        startJetty(applicationContext);
    }

    public void startJetty(WebApplicationContext applicationContext) {
//        // 1. 初始化 Server
//        Server server = new Server();
//
//        // 2. 配置连接器 (设置端口)
//        ServerConnector connector = new ServerConnector(server);
//        connector.setPort(8081);
//        server.addConnector(connector);
//
//        // 3. 创建 ServletContextHandler
//        // 注意：ServletContextHandler.SESSIONS 常量在 9.4 中依然适用
//        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
//        context.setContextPath("/");
//
//        // 4. 配置 Spring DispatcherServlet
//        // 在 Jetty 9.x 中，DispatcherServlet 会使用传入的 applicationContext 作为上下文
//        DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);
//        ServletHolder servletHolder = new ServletHolder("dispatcher", dispatcherServlet);
//
//        // 5. 注册 Servlet
//        // 对应 Tomcat 代码中的 context.addServletMappingDecoded("/*", "dispatcher")
//        context.addServlet(servletHolder, "/*");
//
//        // 6. 绑定 Handler 并启动
//        server.setHandler(context);
//
//        try {
//            server.start();
//            System.out.println("Jetty Server started on port 8081");
//            // server.join(); // 如果是独立启动类，建议取消注释
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
