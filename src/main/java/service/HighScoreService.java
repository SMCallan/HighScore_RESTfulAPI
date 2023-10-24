package service;

import model.HighScore;

import java.util.List;

public interface HighScoreService {
    List<HighScore> getAllHighScores();
    HighScore getHighScoreById(Long id);
    HighScore saveHighScore(HighScore highScore);
    void deleteHighScore(Long id);
}
