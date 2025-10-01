package com.unifacisa.fliperama.services;

import com.unifacisa.fliperama.entities.ConfigEntity;
import com.unifacisa.fliperama.repositories.ConfigRepository;
import org.springframework.stereotype.Service;

@Service
public class ConfigService {

    private final ConfigRepository repository;

    public ConfigService(ConfigRepository repository) {
        this.repository = repository;
    }

    public ConfigEntity saveConfig(ConfigEntity config) {
        return repository.save(config);
    }
}