FROM openjdk:11-jre-slim
EXPOSE 8080
ADD target/news-paper-demo-*.jar  news-paper-demo.jar
ENTRYPOINT ["java", "-jar", " /news-paper-demo.jar"]
