FROM openjdk:8-jdk-alpine
ARG JAR_FILE=/var/lib/jenkins/news-paper-demo/build/libs/news-paper-demo.jar

COPY ${JAR_FILE} app.jar

CMD java -jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
