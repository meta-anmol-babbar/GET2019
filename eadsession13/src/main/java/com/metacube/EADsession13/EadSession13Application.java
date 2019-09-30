package com.metacube.EADsession13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Main class for spring boot application
 *
 */
@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
@EnableJpaRepositories("com.metacube.EADsession13.repository")
public class EadSession13Application {

	public static void main(String[] args) {
		SpringApplication.run(EadSession13Application.class, args);
	}

}
