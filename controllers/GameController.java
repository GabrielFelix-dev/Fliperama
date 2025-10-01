package com.unifacisa.fliperama.controllers;

import com.unifacisa.fliperama.entities.GameEntity;
import com.unifacisa.fliperama.services.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    private final GameService service;

    public GameController(GameService service) { this.service = service; }

    @PostMapping(consumes = {"application/json"})
    public ResponseEntity<GameEntity> createGame(@RequestBody GameEntity game) {
        return ResponseEntity.ok(service.saveGame(game));
    }

    @GetMapping
    public List<GameEntity> getGames() {
        return service.getAllGames();
    }

}