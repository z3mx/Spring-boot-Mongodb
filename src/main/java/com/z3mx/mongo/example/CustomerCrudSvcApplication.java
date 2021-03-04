package com.z3mx.mongo.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Main Class.
 * 
 * @author lantonio
 *
 */
//@EnableEurekaClient
@SpringBootApplication
public class CustomerCrudSvcApplication {
	
	/**
	 * Instance of {@link DispatcherServlet}
	 */
	@Autowired
	private DispatcherServlet servlet;

	/**
	 * main Method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(CustomerCrudSvcApplication.class);
	}

}
