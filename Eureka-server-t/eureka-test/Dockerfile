FROM openjdk:11
ADD target/eureka-test-0.0.1-SNAPSHOT.jar  eureka-t.jar
EXPOSE 8761
ENTRYPOINT [ "java", "-jar", "eureka-t.jar"] 