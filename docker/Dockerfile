FROM maven:3.8.3-openjdk-17-slim AS build
MAINTAINER "github/lucasalvess"

COPY src .
COPY pom.xml .

ARG EXECUTABLE_CLASS
ENV MAIN_CLASS=$EXECUTABLE_CLASS

RUN mvn clean install

FROM openjdk:14-alpine AS run
COPY --from=build /target/*.jar /app.jar

ENTRYPOINT ["java","-jar","/app.jar"]