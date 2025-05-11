# Interceptors Basic Exanple

## Description

Interceptors in Spring are components that intercept and modify requests/responses in the application, typically for HTTP requests (Spring MVC) or method calls (Spring AOP). They act as middleware to execute logic before, after, or around a process.
It includes the following key topics:

- @GetMapping, @RestController, @RequestMapping, @Controller
- Interceptors
- config with WebMvcConfigurer

## Quick Start

### Prerequisites

- Java 17+ (recommended for Spring Boot 3+)
- Spring Boot version: 3.1.3
- Maven (optional, since `mvnw` is included)
- IDE: IntelliJ, Eclipse, or VS Code

### Run the Application

1. Execute the application:
   - **Windows**:
     ```bash
     mvnw.cmd clean spring-boot:run
     ```
   - **Linux/macOS**:
     ```bash
     ./mvnw clean spring-boot:run
     ```
   - **Using global Maven installation**:
     ```bash
     mvn clean spring-boot:run
     ```

   - **Run with a specific profile**:
     ```bash
     mvnw spring-boot:run -Dspring-boot.run.profiles=dev
     ```

2. Access the application:
   - Default URL: `http://localhost:8080/app/foo`

3. Execute tests:
   ```bash
   mvnw test
   ```

4. Dependencies used:
   - thymeleaf
   - spring-boot-starter-web
   - spring-boot-devtools
   - spring-boot-starter-actuato
