FROM openjdk:21
ARG JAR_FILE=*.jar
EXPOSE 3000
COPY ${JAR_FILE} application.jar
ENTRYPOINT ["java", "-jar", "application.jar"]