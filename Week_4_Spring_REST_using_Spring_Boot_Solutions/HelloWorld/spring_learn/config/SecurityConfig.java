package com.cognizant.spring_learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable() // Disable CSRF for curl/testing
            .authorizeHttpRequests(authz -> authz
                .requestMatchers("/authenticate").permitAll()  // Allow /authenticate without login
                .anyRequest().authenticated()
            )
            .httpBasic(); // Use Basic Auth
        
        return http.build();
    }
}
