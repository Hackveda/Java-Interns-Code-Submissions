package com.spring.security.test.spring_security_test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Security_config {
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService userDetailsService(){
		UserDetails normalUser = User.withUsername("Parth")
				.password(passwordEncoder().encode("ParTh"))
				.roles("NORMAL")
				.build();
		UserDetails adminUser = User.withUsername("Parth125")
				.password(passwordEncoder().encode("ParTh"))
				.roles("ADMIN")
				.build();
		return new InMemoryUserDetailsManager(normalUser,adminUser) ;
	}
	
	
	@Bean
	public SecurityFilterChain filterchain(HttpSecurity httpsecurity) throws Exception {
		httpsecurity.csrf().disable()
		.authorizeHttpRequests()
		.requestMatchers("/home/admin")
		.hasRole("ADMIN")
		.requestMatchers("/home/normal")
		.hasRole("NORMAL")
		.requestMatchers("/home/public")
		.permitAll()
		.anyRequest()
		.authenticated()
		.and()
		.formLogin();
		return httpsecurity.build();
	}
}

