package com.unifacisa.fliperama.controllers;

import com.unifacisa.fliperama.entities.ScoreEntity;
import com.unifacisa.fliperama.services.ScoreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scores")
public class ScoreController {
    private final ScoreService service;

    public ScoreController(ScoreService service) { this.service = service; }

    @PostMapping
    public ResponseEntity<ScoreEntity> createScore(@RequestBody ScoreEntity score) {
        return ResponseEntity.ok(service.saveScore(score));
    }
}
