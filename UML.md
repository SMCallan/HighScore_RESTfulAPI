```mermaid
classDiagram
    class HighScore {
        -Long id
        -String playerName
        -int score
        -String game
        -LocalDate date
    }
    
    class HighScoreRepository {
        <<interface>>
        +save(HighScore) HighScore
        +findById(Long) Optional~HighScore~
        +findAll() List~HighScore~
        +delete(HighScore) void
    }
    
    class HighScoreService {
        <<interface>>
        +createHighScore(HighScore) HighScore
        +getHighScoreById(Long) HighScore
        +getAllHighScores() List~HighScore~
        +updateHighScore(Long, HighScore) HighScore
        +deleteHighScore(Long) void
    }
    
    class HighScoreServiceImpl {
        -HighScoreRepository highScoreRepository
        +createHighScore(HighScore) HighScore
        +getHighScoreById(Long) HighScore
        +getAllHighScores() List~HighScore~
        +updateHighScore(Long, HighScore) HighScore
        +deleteHighScore(Long) void
    }
    
    class HighScoreController {
        -HighScoreService highScoreService
        +postHighScore(HighScore) HighScore
        +getHighScore(Long) HighScore
        +getAllHighScores() List~HighScore~
        +putHighScore(Long, HighScore) HighScore
        +deleteHighScore(Long) void
    }
    
    HighScore "1" *-- "1" HighScoreRepository : data
    HighScoreRepository "1" <.. HighScoreService : uses
    HighScoreService "1" <|-- "1" HighScoreServiceImpl : implements
    HighScoreService "1" *-- "1" HighScoreController : uses


When rendered, this would produce a UML class diagram showing the classes `HighScore`, `HighScoreRepository`, `HighScoreService`, `HighScoreServiceImpl`, and `HighScoreController` along with their relationships.

Remember that not all Markdown renderers support Mermaid, so you would need to ensure that your Markdown environment (like a specific documentation website, GitHub repository, etc.) supports this syntax. If it doesn't, you would have to revert to the image embedding method mentioned earlier.
