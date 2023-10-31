package com.csm.highscore.gamehighscore.service;

import com.csm.highscore.gamehighscore.model.HighScore;
import com.csm.highscore.gamehighscore.repository.HighScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HighScoreServiceImpl implements HighScoreService {

    @Autowired
    private HighScoreRepository highScoreRepository;

    @Override
    public List<HighScore> getAllHighScores() {
        return highScoreRepository.findAll();
    }

    @Override
    public HighScore getHighScoreById(Long id) {
        Optional<HighScore> highScore = highScoreRepository.findById(id);
        return highScore.orElse(null);
    }

    @Override
    public HighScore saveHighScore(HighScore highScore) {
        return highScoreRepository.save(highScore);
    }

    @Override
    public void deleteHighScore(Long id) {
        highScoreRepository.deleteById(id);
    }

    @Override
    public HighScore save(HighScore highScore) {
        return null;
    }
}
