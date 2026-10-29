package com.game.store.model.dto.game;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class GameRequest {

    @NotBlank(message = "Title is required!")
    @Size(
            min = 2,
            max = 100,
            message = "Title must contain 2-100 characters"
    )
    private String title;

    @NotBlank
    @Size(
            min = 2,
            max = 100,
            message = "Genre must contain 2-100 characters"
    )
    private String genre;

    @NotNull(message = "Price is required")
    @Positive(message = "Price must be greater then 0")
    private Double price;

    @NotNull(message = "Studio id is required")
    @Positive(message = "Id must be positive")
    private Long studioId;

    public GameRequest(String title, String genre, Double price, Long studioId) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.studioId = studioId;
    }
}
