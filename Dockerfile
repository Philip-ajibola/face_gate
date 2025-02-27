FROM maven:3.8.7 as build
COPY . .
RUN mvn -B clean package -DskipsTests

FROM openjdk:17

COPY --from=build /target/*.jar devops.jar

ENTRYPOINT ["java","-jar","-Dserver.port=9100","devops.jar"]