package controller;

import model.HighScore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.HighScoreRepository;
import service.HighScoreService;

import java.util.List;

@RestController
@RequestMapping("/api/highscores")
public class HighScoreController {
    private final HighScoreRepository highScoreRepository;

    @Autowired
    public HighScoreController(HighScoreRepository highScoreRepository) {
        this.highScoreRepository = highScoreRepository;
    }

    @Autowired
    private HighScoreService highScoreService;

    @GetMapping
    public ResponseEntity<List<HighScore>> getAllHighScores() {
        List<HighScore> highScores = highScoreService.getAllHighScores();  // Updated
        return new ResponseEntity<>(highScores, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HighScore> getHighScoreById(@PathVariable Long id) {
        HighScore highScore = highScoreService.getHighScoreById(id);  // Updated
        return new ResponseEntity<>(highScore, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<HighScore> addHighScore(@RequestBody HighScore highScore) {
        HighScore newHighScore = highScoreService.saveHighScore(highScore);  // Updated
        return new ResponseEntity<>(newHighScore, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteHighScore(@PathVariable Long id) {
        highScoreService.deleteHighScore(id);  // Updated
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
