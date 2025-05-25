# Spring Boot Sample Project

This is a sample Spring Boot application demonstrating the basic structure and functionality of a Spring Boot project.

## Project Structure

```
spring-boot-sample
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── springbootsample
│   │   │               ├── SpringBootSampleApplication.java
│   │   │               └── controller
│   │   │                   └── SampleController.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── static
│   │       └── templates
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── springbootsample
│                       └── SpringBootSampleApplicationTests.java
├── pom.xml
└── README.md
```

## Setup Instructions

1. **Clone the repository:**
   ```
   git clone <repository-url>
   ```

2. **Navigate to the project directory:**
   ```
   cd spring-boot-sample
   ```

3. **Build the project using Maven:**
   ```
   mvn clean install
   ```

4. **Run the application:**
   ```
   mvn spring-boot:run
   ```

## Usage

Once the application is running, you can access the sample endpoint at:
```
http://localhost:8080/sample
```

This will return a sample response from the `SampleController`.

## Dependencies

This project uses the following dependencies:
- Spring Boot Starter Web
- Spring Boot Starter Test

## License

This project is licensed under the MIT License.