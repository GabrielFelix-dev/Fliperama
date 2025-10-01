package com.unifacisa.fliperama.repositories;

import com.unifacisa.fliperama.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {}
