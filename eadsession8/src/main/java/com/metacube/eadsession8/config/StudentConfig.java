package com.metacube.eadsession8.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.metacube.eadsession8.model.Students;

//@Configuration
public class StudentConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/StudentDetails").setViewName(
				"StudentDetails");
	}

	@Bean
	public Students studentGetter() {
		return new Students();
	}

}
