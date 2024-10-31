package com.ac.tp7.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.ac.tp7.restapi.CompteRestJaxRSAPI;

@Configuration
public class MyConfig {
    public ResourceConfig resourceConfig() {
        ResourceConfig jersyServlet = new ResourceConfig();
        jersyServlet.register(CompteRestJaxRSAPI.class);
        return jersyServlet;
    }
}
