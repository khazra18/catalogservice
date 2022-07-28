FROM openjdk:11
ADD target/catalogservice.jar catalogservice.jar
ENTRYPOINT ["java","-jar","/catalogservice.jar"]