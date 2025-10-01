package com.unifacisa.fliperama.services;

import com.unifacisa.fliperama.entities.ScoreEntity;
import com.unifacisa.fliperama.repositories.ScoreRepository;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {

    private final ScoreRepository repository;

    public ScoreService(ScoreRepository repository) {
        this.repository = repository;
    }

    public ScoreEntity saveScore(ScoreEntity score) {
        return repository.save(score);
    }
}