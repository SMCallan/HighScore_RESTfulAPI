package controller;

import org.springframework.stereotype.Service;
import repository.HighScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.HighScoreService;


@Service
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

    // TODO: Implement endpoints
}
