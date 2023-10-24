package com.csm.highscore.gamehighscore.repository;
import com.csm.highscore.gamehighscore.model.HighScore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HighScoreRepository extends JpaRepository <HighScore, Long> {
}
