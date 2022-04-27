FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} weather-api.jar
ENTRYPOINT ["java","-jar","/weather-api.jar"]