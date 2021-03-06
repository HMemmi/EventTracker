package com.tieto.springtraining;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppIniatilizer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		 	WebApplicationContext context = getContext();
	        servletContext.addListener(new ContextLoaderListener(context));
	        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("DispatcherServlet", new DispatcherServlet(context));
	        dispatcher.setLoadOnStartup(1);
	        dispatcher.addMapping("/*");
	        dispatcher.addMapping("*.html");
	        dispatcher.addMapping("*.pdf");
	        dispatcher.addMapping("*.json");
	        dispatcher.addMapping("*.xml");

	
	}

	private AnnotationConfigWebApplicationContext getContext() {	
		AnnotationConfigWebApplicationContext anno=new AnnotationConfigWebApplicationContext();
		anno.setConfigLocation("com.tieto.springtraining.WebConfig");
		anno.register(com.tieto.springtraining.WebConfig.class);
		
		return anno;
	}
	

}
