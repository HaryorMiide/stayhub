# Use Maven with JDK 21
FROM maven:3.9.6-eclipse-temurin-21 AS build

WORKDIR /app

# Copy all files
COPY . .

# Package the application, skip tests
RUN ./mvnw clean install -DskipTests

# Optional: use a smaller JDK 21 image for running the app
FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY --from=build /app/target/Stayhub-0.0.1-SNAPSHOT.jar app.jar

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
