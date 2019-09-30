package com.metacube.eadsession12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Main class for spring boot application
 */
@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
@EnableJpaRepositories("com.metacube.EADsession12.repository")
public class Eadsession12Application {

	public static void main(String[] args) {
		SpringApplication.run(Eadsession12Application.class, args);
	}

}
