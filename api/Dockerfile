# Build Container
FROM docker.io/maven:3-openjdk-17 as build
COPY . /app
WORKDIR /app
RUN mvn clean install -DskipTests

# Application Container
FROM docker.io/openjdk:20-ea-17-jdk
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]