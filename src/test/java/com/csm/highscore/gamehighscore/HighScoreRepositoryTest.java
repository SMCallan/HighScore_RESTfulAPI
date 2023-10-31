package com.csm.highscore.gamehighscore;

import com.csm.highscore.gamehighscore.model.HighScore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import com.csm.highscore.gamehighscore.repository.HighScoreRepository;


import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class HighScoreRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private HighScoreRepository highScoreRepository;

    @Test
    void testSaveAndFindById() {
        HighScore highScore = new HighScore();
        highScore.setPlayerName("Player 1");
        highScore.setScore(1000);

        entityManager.persistAndFlush(highScore);

        HighScore foundHighScore = highScoreRepository.findById(highScore.getId()).orElse(null);
        assertThat(foundHighScore).isNotNull();
        assertThat(foundHighScore.getPlayerName()).isEqualTo("Player 1");
        assertThat(foundHighScore.getScore()).isEqualTo(1000);
    }
}
