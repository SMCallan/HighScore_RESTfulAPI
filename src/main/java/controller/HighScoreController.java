package controller;

import com.csm.highscore.gamehighscore.repository.HighScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/highscores")
public class HighScoreController {
    private final HighScoreRepository highScoreRepository;

    @Autowired
    public HighScoreController(HighScoreRepository highScoreRepository) {
        this.highScoreRepository = highScoreRepository;
    }
    // TODO: Implement endpoints
}
