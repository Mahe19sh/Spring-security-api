package com.example.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Testcontroller {
    
    @PreAuthorize("hasRole('USER')")
    @GetMapping("/test")
    public String endPoint() {
        return "Jwt is working";
    }
    
}
