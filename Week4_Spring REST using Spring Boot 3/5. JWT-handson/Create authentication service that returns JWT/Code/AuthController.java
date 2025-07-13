package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public String login(@RequestBody UserDTO user) {
        System.out.println("🔐 Login API called with: " + user.getUsername());

        if ("admin".equals(user.getUsername()) && "password".equals(user.getPassword())) {
            return jwtUtil.generateToken(user.getUsername());
        } else {
            return "Invalid credentials";
        }
    }

    @GetMapping("/ping")
    public String ping() {
        System.out.println("🎯 /auth/ping hit");
        return "pong";
    }
}
