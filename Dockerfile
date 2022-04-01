FROM java:8
COPY target/*.jar /var/www/java/app.jar
WORKDIR /var/www/java
EXPOSE 8100
ENTRYPOINT ["java","-jar","app.jar"]
