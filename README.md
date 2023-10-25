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


---

### **Next Steps**
Having established a basic Spring Boot application with a structured architecture encompassing model, repository, service, and controller layers, and implementing CRUD operations, the primary focus transitions towards setting up a solid testing foundation.

### **Testing Roadmap**

#### **Phase 1: Establishing a Testing Safety Net**

1. **Unit Testing:**
    - Test the HighScore entity, HighScoreRepository, and HighScoreService individually to ensure they function as expected.
    - Utilize Mockito for mocking dependencies and JUnit for writing and executing the tests.

2. **Integration Testing:**
    - Test the interaction between the HighScoreController, HighScoreService, and HighScoreRepository to ensure they work seamlessly together.
    - Employ Spring Boot Test features for integration testing.

3. **Database Testing:**
    - Use an in-memory database like H2 for testing database interactions and ensuring that CRUD operations work as expected.

#### **Phase 2: Exception Handling and Logging**

1. **Exception Handling:**
    - Implement global exception handling to manage errors gracefully and provide meaningful error messages.

2. **Logging:**
    - Set up basic logging to monitor the system behavior, which will aid in debugging and tracking issues.

#### **Additional Considerations for Future Phases**

- **Security:** Implement basic security features like authentication and authorization when the project progresses to a stage where security becomes a concern.
- **Deployment:** Look into deployment strategies and possibly containerization with Docker for easier deployment and scaling.
- **Continuous Improvement:** As the project evolves, continuously refine and expand upon the testing strategies, ensuring they align with the project’s growing needs.

---

This streamlined roadmap outlines a pragmatic approach to establishing a robust testing phase, keeping it succinct yet comprehensive. It lays down the immediate steps to be taken for solidifying the testing framework, while also hinting at future considerations as the project advances. The focus is on ensuring that each layer of your Spring Boot application is thoroughly tested, providing a reliable foundation as you move forward with the development.

---
Formal documentation outline that captures the status of the testing phase for the HighScore REST API project:

---

### HighScore REST API Testing Documentation

#### Project Overview

- **Name**: HighScore REST API
- **Purpose**: To manage game high scores through a RESTful API
- **Tech Stack**: Spring Boot, JUnit, Mockito, Maven, H2 database

---

#### Testing Objectives

1. To verify the functionality and reliability of all CRUD operations.
2. To ensure that the API returns the correct status codes under different conditions.
3. To assess performance under various loads.
4. To validate security measures.

---

#### Testing Tools

- **JUnit**: For writing and executing unit tests.
- **Mockito**: For mocking objects and dependencies.

---

#### Testing Phases

##### Preliminary Setup

- Set up a separate testing environment mimicking the production environment.
- Installed JUnit and Mockito for test execution and object mocking.

##### Step 1: Unit Tests for Model Layer

- **Status**: Completed
- **Issues**: None
- **Results**: All tests passed, confirming the validity of the model layer.

##### Step 2: Unit Tests for Repository Layer

- **Status**: Completed
- **Issues**: None
- **Results**: All tests passed, confirming the database CRUD operations.

##### Step 3: Unit Tests for Service Layer

- **Status**: In Progress
- **Issues**: Encountered errors during the test execution.
  
---

#### Next Steps

- Investigate and resolve the errors encountered in Step 3.
- Once resolved, continue with testing the Controller layer and overall system testing.

#### Additional Notes

- Due to the errors encountered in Step 3, the testing process is currently halted.
- Plans are to revisit and rectify these issues at the next available opportunity to ensure the Service layer functions as expected.

---



