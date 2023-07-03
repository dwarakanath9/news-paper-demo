FROM openjdk:11-jre-slim
ADD target/news-paper-demo-*.jar  news-paper-demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", " news-paper-demo.jar"]
