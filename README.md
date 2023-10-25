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

### Step 5: Implementing the Service Layer

- [x] Created a new package named `service` under `com.csm.highscore.gamehighscore`.
- [x] Defined a new Java interface named `HighScoreService` within the `service` package.
- [x] Created a new Java class named `HighScoreServiceImpl` within the `service` package.
- [x] Implemented the `HighScoreService` interface in `HighScoreServiceImpl`.
- [x] Annotated the class with `@Service`.
- [x] Implemented dependency injection for `HighScoreRepository` within `HighScoreServiceImpl`.

### Step 6: Implementing RESTful Endpoints

- [x] Implemented RESTful endpoints for CRUD operations in `HighScoreController`.
- [x] Used `@GetMapping`, `@PostMapping`, `@PutMapping`, and `@DeleteMapping` annotations.
- [x] Tested endpoints with Postman.

### Step 7: Implementing the Service Layer

- [x] Implemented the `HighScoreService` interface in the `HighScoreServiceImpl` class.
- [x] Methods of `HighScoreService` are implemented by delegating the tasks to `HighScoreRepository`.

## Next Steps

Up to this point, you've set up a basic Spring Boot application with a layered architecture. This includes a model, repository, service, and controller, along with implementing CRUD operations.

### Additional Considerations

Here are some additional steps you might consider:

1. **Exception Handling**: Implement global exception handling for your REST API.
2. **Logging**: Add logging capabilities to keep track of what's happening during execution.
3. **Security**: Implement security features like authentication and authorization.
4. **Front-End**: If your application needs a user interface, this would be the time to start implementing it.
5. **Deployment**: Once everything is set, you may want to look into deploying your application.
6. **Testing**: Write unit and integration tests to make sure everything is working as expected.


---

## Next Development Phases Roadmap

### Phase 1: Safety Net and Resilience

#### 1.1 Testing
- [ ] Write unit tests for all existing functionalities.
- [ ] Implement integration tests to ensure complete flow of application.

#### 1.2 Exception Handling
- [ ] Implement global exception handling for application robustness.
- [ ] Provide meaningful error messages for debugging and client understanding.

### Phase 2: Operational Awareness

#### 2.1 Logging
- [ ] Implement logging mechanisms for debugging and tracking.
- [ ] Use logs to gather insights into application performance and user behavior.

### Phase 3: Security Measures

#### 3.1 Security
- [ ] Implement basic authentication and authorization mechanisms.
- [ ] Use OAuth or JWT for token-based authentication.

### Phase 4: User Interface

#### 4.1 Front-End
- [ ] Start implementing the front-end once back-end is stable.
- [ ] Use frameworks like React, Angular, or Vue for robustness and scalability.

### Phase 5: Preparing for Production

#### 5.1 Deployment
- [ ] Decide on a deployment strategy.
- [ ] Use containerization tools like Docker for easier deployment and scaling.

### Phase 6: Iterative Improvements

- [ ] Refine and expand upon all the above features.
- [ ] Consider more advanced security measures such as rate-limiting and data encryption.
- [ ] Optimize logging and monitoring based on real-world usage.

### Phase 7: Additional Testing

- [ ] Continuously update the test suite for new features and improvements.
- [ ] Implement E2E tests for full flow validation.

