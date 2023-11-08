# Test Cases for `HighScoreController`

## Normal Cases

### 1. Create High Score (POST `/highscores`)

- **Description**: Add a new high score entry.
- **Preconditions**: The database is accessible.
- **Input**: A valid `HighScore` JSON object.
- **Expected Output**: The `HighScore` object is saved, and its JSON representation is returned with a 201 status code.
- **Postconditions**: The `HighScore` entry is present in the database.

**Java Test Setup**:
Use `MockMvc` to perform a `post` request to `/highscores` with a valid `HighScore` JSON.

### 2. Get High Score (GET `/highscores/{id}`)

- **Description**: Retrieve an existing high score entry by ID.
- **Preconditions**: A `HighScore` with the specified ID exists.
- **Input**: A valid ID.
- **Expected Output**: The `HighScore` object's JSON representation is returned with a 200 status code.
- **Postconditions**: The state of the database is unchanged.

**Java Test Setup**:
Use `MockMvc` to perform a `get` request to `/highscores/{id}` with a valid ID.

## Invalid Cases

### 1. Create High Score With Invalid Data (POST `/highscores`)

- **Description**: Attempt to add a new high score with invalid data.
- **Preconditions**: The database is accessible.
- **Input**: An invalid `HighScore` JSON object (e.g., missing required fields, invalid data types).
- **Expected Output**: An error message with details about the validation failure and a 400 status code.
- **Postconditions**: No new `HighScore` entry is created in the database.

**Java Test Setup**:
Use `MockMvc` to perform a `post` request to `/highscores` with invalid `HighScore` JSON.

### 2. Get High Score With Non-Existent ID (GET `/highscores/{id}`)

- **Description**: Attempt to retrieve a high score with an ID that does not exist.
- **Preconditions**: The database is accessible.
- **Input**: A non-existent ID.
- **Expected Output**: An error message indicating the high score was not found and a 404 status code.
- **Postconditions**: The state of the database is unchanged.

**Java Test Setup**:
Use `MockMvc` to perform a `get` request to `/highscores/{id}` with a non-existent ID.

## Boundary Cases

### 1. Get High Score At Boundary ID (GET `/highscores/{id}`)

- **Description**: Retrieve a high score entry at the boundary of the valid ID range (e.g., the highest or lowest possible ID).
- **Preconditions**: A `HighScore` with the specified boundary ID exists.
- **Input**: A boundary ID value.
- **Expected Output**: The `HighScore` object's JSON representation is returned with a 200 status code.
- **Postconditions**: The state of the database is unchanged.

**Java Test Setup**:
Use `MockMvc` to perform a `get` request to `/highscores/{id}` with a boundary ID.

## Special Cases

### 1. Create High Score With Max Int Score (POST `/highscores`)

- **Description**: Add a new high score with the maximum integer value for the score.
- **Preconditions**: The database is accessible.
- **Input**: A `HighScore` JSON object with a score set to `Integer.MAX_VALUE`.
- **Expected Output**: The `HighScore` object is saved, and its JSON representation is returned with a 201 status code.
- **Postconditions**: The `HighScore` entry with maximum score is present in the database.

**Java Test Setup**:
Use `MockMvc` to perform a `post` request to `/highscores` with a `HighScore` JSON having a score of `Integer.MAX_VALUE`.

### 2. Get High Score With Special Characters in Name (GET `/highscores/{id}`)

- **Description**: Retrieve a high score entry with special characters in the player's name.
- **Preconditions**: A `HighScore` with the specified ID and special characters in the name exists.
- **Input**: A valid ID.
- **Expected Output**: The `HighScore` object's JSON representation is returned with a 200 status code.
- **Postconditions**: The state of the database is unchanged.

**Java Test Setup**:
Use `MockMvc` to perform a `get` request to `/highscores/{id}` with an ID corresponding to a `HighScore` with special characters in the name.

Creating Test Cases in Java
For each test case, you would create a new test method in a test class annotated with @WebMvcTest(YourControllerClass.class). You would use MockMvc to perform HTTP requests and Mockito to mock the service layer dependencies, ensuring that each test is independent of the others and of the actual database.

Here's an example of how a test case might look in Java:

@WebMvcTest(HighScoreController.class)
class HighScoreControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private HighScoreService service;

    // ... other tests ...

    @Test
    void createHighScore_ValidInput_ReturnsSavedHighScore() throws Exception {
        HighScore highScore = new HighScore(/* ... set properties ... */);
        Mockito.when(service.createHighScore(any(HighScore.class))).thenReturn(highScore);

        mockMvc.perform(post("/highscores")
                .contentType(MediaType.APPLICATION_JSON)
                .content(/* ... highScore JSON ... */))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(highScore.getId()));
    }
}

repeat a similar structure for each test case, adjusting the HTTP method, endpoint, input, and expectations accordingly. The @MockBean annotation allows you to provide mock implementations of your service layer, ensuring that your controller tests are not dependent on the actual database or business logic implementations.
