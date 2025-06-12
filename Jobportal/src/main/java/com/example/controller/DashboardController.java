package com.example.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DashboardController {

    @GetMapping("/dashboard-data")
    public ResponseEntity<?> getDashboardData(Authentication auth) {
        String username = auth.getName();
        return ResponseEntity.ok(Map.of("message", "Welcome, " + username));
    }
}