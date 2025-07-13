package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@SpringBootApplication(exclude = { UserDetailsServiceAutoConfiguration.class })
public class DemoApplication {
    public static void main(String[] args) {
        System.out.println("🚀 Starting App");
        SpringApplication.run(DemoApplication.class, args);
    }
}
