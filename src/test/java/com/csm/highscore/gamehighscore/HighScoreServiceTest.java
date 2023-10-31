package com.csm.highscore.gamehighscore;

import com.csm.highscore.gamehighscore.model.HighScore;
import com.csm.highscore.gamehighscore.repository.HighScoreRepository;
import com.csm.highscore.gamehighscore.service.HighScoreService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class HighScoreServiceTest {

    @Autowired
    private HighScoreService highScoreService;

    @MockBean
    private HighScoreRepository highScoreRepository;

    @Test
    public void testSaveHighScore() {
        HighScore highScore = new HighScore();
        highScore.setPlayerName("Player 1");
        highScore.setScore(1000);

        when(highScoreRepository.save(any(HighScore.class))).thenReturn(highScore);

        HighScore savedHighScore = highScoreService.save(highScore);

        assertNotNull(savedHighScore);
        assertEquals("Player 1", savedHighScore.getPlayerName());
        assertEquals(1000, savedHighScore.getScore());
    }

}
