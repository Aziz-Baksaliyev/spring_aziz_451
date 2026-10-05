package com.game.store.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
@Entity(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String title;
    private String genre;
    private Double price;
    private Studio studio;

    public Game(Long id, String title, String genre, Double price, Studio studio) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.studio = studio;
    }
}
