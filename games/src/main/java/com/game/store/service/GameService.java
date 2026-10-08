package com.game.store.service;

import com.game.store.model.entity.Studio;
import com.game.store.model.entity.Game;
import com.game.store.repository.GameRepository;
import com.game.store.repository.StudioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    private final GameRepository gameRepository;
    private final StudioRepository studioRepository;

    public GameService(GameRepository gameRepository, StudioRepository studioRepository) {
        this.gameRepository = gameRepository;
        this.studioRepository = studioRepository;
    }

    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    public Game createGame(Game game) {

        Long studioId = game.getStudio().getId();

        Studio studio = studioRepository.findById(studioId)
                .orElseThrow(() -> new RuntimeException("No studio with id: " + studioId));

        game.setStudio(studio);
        game.setTitle(game.getTitle());
        game.setGenre(game.getGenre());
        game.setPrice(game.getPrice());

        return gameRepository.save(game);
    }
    public void deleteById(Long id) {
        gameRepository.deleteById(id);
    }
}
