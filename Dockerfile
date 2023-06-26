FROM openjdk:11-jre-slim

WORKDIR /app

COPY target/my-app.jar app.jar

CMD ["java", "-jar", "app.jar"]
