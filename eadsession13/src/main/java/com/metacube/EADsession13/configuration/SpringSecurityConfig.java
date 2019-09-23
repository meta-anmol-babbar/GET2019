package com.metacube.EADsession13.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Configuration file for spring security
 */
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(final AuthenticationManagerBuilder auth)
			throws Exception {
		auth.inMemoryAuthentication().withUser("user")
				.password(passwordEncoder().encode("user")).roles("USER").and()
				.withUser("admin").password(passwordEncoder().encode("admin"))
				.roles("ADMIN");
	}

	@Override
	protected void configure(final HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().antMatchers("/studentForm")
				.hasRole("ADMIN").antMatchers("/showStudents")
				.hasAnyRole("USER", "ADMIN").antMatchers("/login").permitAll()
				.anyRequest().authenticated().and().formLogin()
				.loginPage("/login").loginProcessingUrl("/perform_login")
				.defaultSuccessUrl("/index?logged=1", true)
				.failureUrl("/login?error=1")
				// .failureHandler(authenticationManager())
				.and().logout().and().exceptionHandling()
				.accessDeniedPage("/index?denied=1");
		// .logoutSuccessHandler(logoutSuccessHandler());
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}