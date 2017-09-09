package com.services.cfg.main;
import org.h2.server.web.WebServlet;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// This class is used for HSQL dynamic console
@Configuration
public class BeanConfig {
	@Bean
    org.springframework.boot.context.embedded.ServletRegistrationBean h2servletRegistration(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
        registrationBean.addUrlMappings("/console/*");
        System.out.println("Hello Config Test");
        return registrationBean;
    }
}
