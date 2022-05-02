FROM openjdk:17
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} weather-api.jar
ENTRYPOINT ["java","-jar","/weather-api.jar"]
CMD ["./gradlew", "spring-boot:run", "-Dspring-boot.run.profiles=mysql"]