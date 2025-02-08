FROM openjdk:17-alpine
WORKDIR /opt
COPY target/*.jar /opt/product_demo_kube.jar
EXPOSE  8088
ENV PORT 8088
ENTRYPOINT ["java", "-jar", "product_demo_kube.jar"]