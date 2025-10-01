package com.unifacisa.fliperama.services;

import com.unifacisa.fliperama.entities.UserEntity;
import com.unifacisa.fliperama.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public UserEntity saveUser(UserEntity user) {
        return repository.save(user);
    }

    public List<UserEntity> getAllUsers() {
        return repository.findAll();
    }
}