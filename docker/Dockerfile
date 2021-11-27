FROM maven:3.6.3-openjdk-14 AS build
MAINTAINER "github/lucasalvess"

COPY src /home/app/src
COPY pom.xml /home/app

ARG EXECUTABLE_CLASS
ENV MAIN_CLASS=$EXECUTABLE_CLASS

RUN mvn -f /home/app/pom.xml clean compile assembly:single

FROM openjdk:14-alpine AS run

COPY --from=build /home/app/target /app

ENTRYPOINT ["java","-jar","/app/big-o-test-1.0-jar-with-dependencies.jar"]