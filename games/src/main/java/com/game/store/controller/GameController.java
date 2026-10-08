package com.game.store.controller;

import com.game.store.model.entity.Game;
import com.game.store.service.GameService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/games")
    public List<Game> getAll() {
        return gameService.getAllGames();
    }

    @PostMapping("/games")
    public Game getAll(@RequestBody Game game) {
        return gameService.createGame(game);
    }

    @DeleteMapping("/games/delete/{id}")
    public void delete(@PathVariable Long id) {
        gameService.deleteById(id);
    }
}
