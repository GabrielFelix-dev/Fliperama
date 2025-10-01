package com.unifacisa.fliperama.repositories;

import com.unifacisa.fliperama.entities.GameEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<GameEntity, Long> {}

