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
In our Highscore application, we have used the Repository design pattern, specifically utilizing the Spring Data JPA's repository abstraction. The `HighScoreRepository` interface extends `JpaRepository`, which provides methods for common CRUD (Create, Read, Update, Delete) operations. This design pattern aims to separate the logic that retrieves data from the database from the business logic of the application.

The Repository pattern provides a clean separation of concerns and a neat abstraction over the data source, making the codebase more maintainable and testable. By doing so, it allows the application to be structured in a way that the data access logic can be reused and easily changed as needed.

In Spring Data JPA, the repository abstraction comes with a variety of pre-built methods for common data access operations, and it also allows for custom query methods to be defined for more complex operations. This makes it a powerful and flexible choice for implementing data access in a Spring Boot application like yours.

1. **Definition and Purpose**:
    - The Repository design pattern acts as a middleman between the application logic and data source, providing a clean API for data access to the rest of the application.
    - This abstraction allows changing the underlying data source or the implementation of the repository without affecting the rest of the application.

2. **Abstraction Over Data Source**:
    - The pattern hides the details of data storage and retrieval from the rest of the application, which can be beneficial in maintaining a separation of concerns.
    - This abstraction can be particularly useful in your "HighScore" project, ensuring that the service layer interacts with a clean, well-defined API for data access, irrespective of the underlying database operations.

3. **Methods Exposed**:
    - Common methods exposed by the repository include Add, Update, Remove, and various Find methods, aligning with the CRUD (Create, Read, Update, Delete) operations central to your project.
    - These methods reflect common operations on data storage, making the repository interface intuitive and consistent.

4. **Database Interaction**:
    - Typically, a repository is created for each table or view in the database, encapsulating the SQL or database operations necessary for data manipulation.
    - This setup aligns well with the layered architecture of your project, with repositories residing in the repository layer, providing data access services to the service layer.

5. **Custom Query Methods**:
    - The repository might have various versions of the Find method (e.g., `FindAll`, `FindById`, etc.) to cater to different querying needs.
    - These custom query methods can be tailored to meet the specific data retrieval requirements of your project, providing flexibility in data access.

6. **Further Reading**:
    - Delving deeper into the Repository design pattern can provide more insights on best practices and implementation nuances. The links provided in the lecture notes are great starting points, particularly the one from Microsoft which discusses Infrastructure and Persistence Layer Design in microservices, and the link to Martin Fowler's EAA Catalog on the Repository pattern.

7. **Implementation in Spring Boot**:
    - In the context of your Spring Boot project, Spring Data JPA can be used to implement the Repository pattern effortlessly. It provides sophisticated support to create repositories based on Spring and JPA, helping to reduce boilerplate code.
    - You would define an interface for each repository, extending one of the Spring Data JPA repository interfaces like `CrudRepository` or `JpaRepository`, and Spring would provide the implementation at runtime.

8. **Testing**:
    - For testing repositories in your project, you can utilize Spring Boot Test with an embedded database like H2. This setup allows for testing the repositories in isolation, ensuring they interact with the database as expected.
    - Mockito and JUnit can be used to mock other components and write unit tests to validate the behavior of your repositories.

This pattern can be instrumental in achieving clean separation and organization of code in your Spring Boot project, especially in handling data access in a clean, testable, and maintainable manner.


