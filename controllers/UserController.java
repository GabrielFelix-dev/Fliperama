package com.unifacisa.fliperama.controllers;

import com.unifacisa.fliperama.entities.UserEntity;
import com.unifacisa.fliperama.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity user) {
        return ResponseEntity.ok(service.saveUser(user));
    }

    @GetMapping
    public List<UserEntity> getUsers() {
        return service.getAllUsers();
    }

}
