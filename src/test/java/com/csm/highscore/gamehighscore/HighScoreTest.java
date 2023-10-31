package com.csm.highscore.gamehighscore;

import com.csm.highscore.gamehighscore.model.HighScore;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HighScoreTest {

    @Test
    void testHighScoreEntity() {
        HighScore highScore = new HighScore();
        highScore.setId(1L);
        highScore.setPlayerName("Player 1");
        highScore.setScore(1000);

        assertEquals(1L, highScore.getId());
        assertEquals("Player 1", highScore.getPlayerName());
        assertEquals(1000, highScore.getScore());
    }
}
