package com.game.store.controller;

import com.game.store.model.entity.Studio;
import com.game.store.service.StudioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudioController {

    private final StudioService studioService;

    public StudioController(StudioService studioService) {
        this.studioService = studioService;
    }

    @GetMapping("/studios")
    public List<Studio> getAll() {
        return studioService.getAllStudios();
    }

    @PostMapping("/studios")
    public Studio getAll(@RequestBody Studio studio) {
        return studioService.createStudio(studio);
    }

    @DeleteMapping("/studios/delete/{id}")
    public void delete(@PathVariable Long id) {
        studioService.deleteById(id);
    }
}
