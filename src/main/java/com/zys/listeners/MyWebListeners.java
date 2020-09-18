package com.zys.listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @program: SSM-xml
 * @description: WebInitListener
 * @author: xiaozhang6666
 * @create: 2020-09-17 22:23
 **/
@WebListener
public class MyWebListeners implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //初始化 项目路径
        ServletContext servletContext = sce.getServletContext();
        String contextPath = servletContext.getContextPath();
        servletContext.setAttribute("cxp", contextPath);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
