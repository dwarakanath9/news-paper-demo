FROM openjdk:8-jdk-alpine
ARG JAR_FILE=/var/lib/jenkins/workspace/test-pipeline/target/news-paper-demo-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} news-paper-demo-0.0.1-SNAPSHOT.jar

CMD java -jar news-paper-demo-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/news-paper-demo.jar"]
