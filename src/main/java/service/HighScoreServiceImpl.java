package service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import model.HighScore;
import repository.HighScoreRepository;

import java.util.List;

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
        return highScoreRepository.findById(id).orElse(null);
    }

    @Override
    public HighScore saveHighScore(HighScore highScore) {
        return highScoreRepository.save(highScore);
    }

    @Override
    public void deleteHighScore(Long id) {
        highScoreRepository.deleteById(id);
    }
}
