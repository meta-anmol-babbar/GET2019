package com.metacube.EADsession11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
/**
 * Main class for spring boot application
 * 
 */
@SpringBootApplication(exclude=HibernateJpaAutoConfiguration.class)
public class EadSession11Application {

	public static void main(String[] args) {
		SpringApplication.run(EadSession11Application.class, args);
	}

}
