# Student Management System

A simple Spring Boot REST API for managing students.

## Prerequisites
- Java 17 or higher
- Maven (or use the provided Maven Wrapper if generated, but standard Maven is assumed here)

## How to Run
1.  Navigate to the project directory:
    ```bash
    cd C:\JAVA\StudentManagement
    ```
2.  Run the application using Maven:
    ```bash
    mvn spring-boot:run
    ```
    Or package and run the jar:
    ```bash
    mvn clean package
    java -jar target/student-management-0.0.1-SNAPSHOT.jar
    ```

## H2 Database Console
- **URL**: `http://localhost:9090/h2-console`
- **JDBC URL**: `jdbc:h2:mem:studentdb`
- **User Name**: `sa`
- **Password**: `password`

## API Endpoints & Testing

### 1. Create a Student
**POST** `/students`
```bash
curl -X POST http://localhost:9090/students \
-H "Content-Type: application/json" \
-d "{\"name\": \"John Doe\", \"course\": \"Computer Science\"}"
```

### 2. Get All Students
**GET** `/students`
```bash
curl -X GET http://localhost:9090/students
```

### 3. Get Student by ID
**GET** `/students/{id}`
```bash
curl -X GET http://localhost:9090/students/1
```

### 4. Update Student
**PUT** `/students/{id}`
```bash
curl -X PUT http://localhost:9090/students/1 \
-H "Content-Type: application/json" \
-d "{\"name\": \"John Doe Updated\", \"course\": \"Software Engineering\"}"
```

### 5. Delete Student
**DELETE** `/students/{id}`
```bash
curl -X DELETE http://localhost:9090/students/1
```

## Error Handling
The application handles:
- **StudentNotFoundException**: Returns 404 Not Found.
- **Validation Errors**: Returns 400 Bad Request with field error details.
