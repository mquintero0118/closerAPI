package com.salesass.closer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salesass.closer.dto.UserRequest;
import com.salesass.closer.entity.User;
import com.salesass.closer.services.UserService;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = { "http://localhost:8080", "http://127.0.0.1:5173", "http://localhost:5173",
        "http://localhost:5173/" })
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/create_user")
    public ResponseEntity<User> createUser(@RequestBody @Valid UserRequest userRequest) {

        return new ResponseEntity<>(service.createUser(userRequest), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(service.getUsers());
    }

}
