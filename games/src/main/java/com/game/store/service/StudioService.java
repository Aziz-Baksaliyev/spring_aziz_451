package com.game.store.service;

import com.game.store.model.Studio;
import com.game.store.model.dto.studio.StudioResponse;
import com.game.store.repository.StudioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudioService {

    private final StudioRepository studioRepository;

    public StudioService(StudioRepository studioRepository) {
        this.studioRepository = studioRepository;
    }

    public List<StudioResponse> getAllStudios() {
        return studioRepository.findAll();
    }

    public Studio getStudioById(Long id) {
        return studioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No studio with id: " + id));
    }

    public Studio createStudio(Studio studio) {
        return studioRepository.save(studio);
    }

    public void delete(Long id) {
        studioRepository.deleteById(id);
    }
}