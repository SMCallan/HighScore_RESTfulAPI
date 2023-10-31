package com.csm.highscore.gamehighscore.service;

import com.csm.highscore.gamehighscore.model.HighScore;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface HighScoreService {
    List<HighScore> getAllHighScores();
    HighScore getHighScoreById(Long id);
    HighScore saveHighScore(HighScore highScore);
    void deleteHighScore(Long id);

    HighScore save(HighScore highScore);
}
