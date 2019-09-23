package com.metacube.eadsession14.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Configuration file for spring security
 */
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource dataSource;

	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth)
			throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource);
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**");
	}

	// @Override
	// protected void configure(final AuthenticationManagerBuilder auth)
	// throws Exception {
	// auth.inMemoryAuthentication().withUser("user")
	// .password(passwordEncoder().encode("user")).roles("USER").and()
	// .withUser("admin").password(passwordEncoder().encode("admin"))
	// .roles("ADMIN");
	// }

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

	@SuppressWarnings("deprecation")
	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {
		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}

}