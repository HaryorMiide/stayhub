# Use Maven with JDK 21
FROM maven:3.9.6-eclipse-temurin-21 AS build

WORKDIR /app

COPY . .

# Fix permission issue for mvnw
RUN chmod +x ./mvnw

# Run Maven build
RUN ./mvnw clean install -DskipTests

# Use a minimal base image for running the JAR
FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY --from=build /app/target/Stayhub-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
