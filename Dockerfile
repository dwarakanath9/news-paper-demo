FROM lolhens/baseimage-openjre
ADD target/news-paper-demo.jar news-paper-demo.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "springbootApp.jar"]
