FROM openjdk:8-jdk-alpine
ARG JAR_FILE=/var/lib/jenkins/news-paper-demo/build/libs/news-paper-demo.jar

COPY ${JAR_FILE} news-paper-demo.jar

CMD java -jar news-paper-demo.jar

ENTRYPOINT ["java","-jar","/news-paper-demo.jar"]
