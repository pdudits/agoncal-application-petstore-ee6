/*
 * Copyright (c) 2014 RWE IT Slovakia, s.r.o; RWE IT GmbH
 */

package org.agoncal.application.petstore.security;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 
 * @author Patrik Dudits
 */
@WebListener
public class ServletContextProducer implements ServletContextListener {
    private static ServletContext ctx;
    

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ctx = sce.getServletContext();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ctx = null;
    }

    @Produces
    public ServletContext getCtx() {
        return ctx;
    }
    
    

}
