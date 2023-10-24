## Step 1: Project Setup and Initial Commit

- We initiated a new Spring Boot project via IntelliJ's Spring Initializr.
- The project was configured with dependencies for Spring Web, Spring Data JPA, and H2 Database.
- Initialized a Git repository and made an initial commit.

## Step 2: Data Model Creation

Created a `HighScore` entity in the `model` package. It has the following fields:

- `id`: Primary Key, auto-generated.
- `playerName`: Stores the name of the player.
- `score`: Stores the high score.

Added JPA annotations for entity definition and primary key. Also generated getters and setters for these fields.


### Step 3: Creating the Repository Layer
- [x] Created a new package named `repository` under `com.csm.highscore.gamehighscore`.
- [x] Created a new Java interface named `HighScoreRepository`.
- [x] Extended `JpaRepository` to enable CRUD operations for `HighScore` entities.

### Step 4: Creating the Controller Layer

- [x] Created a new package named `controller` under `com.csm.highscore.gamehighscore`.
- [x] Created a new Java class named `HighScoreController` within the `controller` package.
- [x] Annotated the class with `@RestController` and `@RequestMapping`.
- [x] Implemented dependency injection for `HighScoreRepository`.

#### Code Sample for HighScoreController
```java
import com.csm.highscore.gamehighscore.repository.HighScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

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
