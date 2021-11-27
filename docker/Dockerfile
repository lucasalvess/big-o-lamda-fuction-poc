FROM maven:3.6.3-openjdk-14 AS build
MAINTAINER "github/lucasalvess"

COPY src src
COPY pom.xml .

ARG EXECUTABLE_CLASS
ENV MAIN_CLASS=$EXECUTABLE_CLASS

RUN mvn clean compile assembly:single

FROM openjdk:14-alpine AS run

COPY --from=build /target/*jar /app/app.jar

ENTRYPOINT ["java","-jar","/app/app.jar"]