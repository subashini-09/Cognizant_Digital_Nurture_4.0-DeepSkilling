package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        System.out.println("✅ SecurityConfig loaded!");

        return http
            .csrf(csrf -> csrf.disable()) // important for Postman
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/auth/**").permitAll() // ✅ Allow ALL under /auth/
                .anyRequest().authenticated() // protect all others
            )
            .build();
    }
}
