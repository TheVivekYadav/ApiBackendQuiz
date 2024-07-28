# Use a multi-stage build to keep the final image small
FROM maven:3.8.5-openjdk-17-slim AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml file and download dependencies
COPY pom.xml .

# Download dependencies
RUN mvn dependency:go-offline

# Copy the source code
COPY src ./src

# Package the application
RUN mvn package -DskipTests

# Use a minimal base image for the final stage
FROM openjdk:17-jdk-alpine

# Copy the built JAR file from the build stage
COPY --from=build /app/target/Project01-0.0.1-SNAPSHOT.jar app.jar

# Set the entry point
ENTRYPOINT ["java", "-jar", "/app.jar"]
