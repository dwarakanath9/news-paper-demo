FROM lolhens/baseimage-openjre
ADD target/news-paper-demo-0.0.1.jar  news-paper-demo-0.0.1.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", " news-paper-demo-0.0.1.jar"]
