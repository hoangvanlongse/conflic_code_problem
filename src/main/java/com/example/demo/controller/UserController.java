package com.example.demo.controller;

import com.example.demo.dto.UserCreationRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @PostMapping
    public ResponseEntity<String> createUser(@Valid @RequestBody UserCreationRequest request) {
        return ResponseEntity.ok("User created successfully!");
    }
    // create conflict code 
    // commit 2 to con flict code
}