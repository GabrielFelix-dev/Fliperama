package com.unifacisa.fliperama.controllers;

import com.unifacisa.fliperama.entities.ConfigEntity;
import com.unifacisa.fliperama.services.ConfigService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {

    private final ConfigService service;

    public ConfigController(ConfigService service) {
        this.service = service;
    }

    @PostMapping(consumes = {"application/json"})
    public ResponseEntity<ConfigEntity> createConfig(@RequestBody ConfigEntity config) {
        return ResponseEntity.ok(service.saveConfig(config));
    }
}