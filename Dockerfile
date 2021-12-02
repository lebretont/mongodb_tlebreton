FROM openjdk:15

COPY target/mongo_rest.jar .

EXPOSE 8080

CMD ["java", "-jar", "mongo_rest.jar"]