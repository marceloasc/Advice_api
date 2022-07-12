FROM openjdk:17-alpine
ARG JAR_FILES=target/*.jar
COPY ${JAR_FILES} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]