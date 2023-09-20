package com.example.springbootkeycloakstarter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @GetMapping("/custommers")
    public ResponseEntity<?> list() {
        return  ResponseEntity.ok("liste des users");
    }
}
