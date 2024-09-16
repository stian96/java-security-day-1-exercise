package com.booleanuk.api.controller;

import com.booleanuk.api.model.Game;
import com.booleanuk.api.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("games")
public class GameController {
    private GameRepository gameRepository;

    @Autowired
    public GameController(GameRepository repository) {
        this.gameRepository = repository;
    }

    @GetMapping
    public ResponseEntity<List<Game>> getAll() {
        List<Game> games = this.gameRepository.findAll();
        return ResponseEntity.ok(games);
    }
}
