FROM openjdk:17-alpine
WORKDIR /opt
COPY target/*.jar /opt/app.jar
EXPOSE  8088
ENV PORT 8088
ENTRYPOINT ["java", "-jar", "app.jar"]