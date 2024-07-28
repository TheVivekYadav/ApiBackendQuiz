FROM openjdk:17-jdk-alpine
ARG JAR_FILE=TARGET/*.jar
COPY ./target/Project01-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]