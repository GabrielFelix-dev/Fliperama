package com.unifacisa.fliperama.services;

import com.unifacisa.fliperama.entities.GameEntity;
import com.unifacisa.fliperama.repositories.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    private final GameRepository repository;

    public GameService(GameRepository repository) {
        this.repository = repository;
    }

    public GameEntity saveGame(GameEntity game) {
        return repository.save(game);
    }

    public List<GameEntity> getAllGames() {
        return repository.findAll();
    }
}