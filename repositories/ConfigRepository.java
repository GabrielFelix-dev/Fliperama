package com.unifacisa.fliperama.repositories;

import com.unifacisa.fliperama.entities.ConfigEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfigRepository extends JpaRepository<ConfigEntity, Long> {}
