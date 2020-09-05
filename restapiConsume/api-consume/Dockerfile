FROM openjdk:11
ADD target/api-consume-0.0.1-SNAPSHOT.jar  consume-t.jar
EXPOSE 9090
ENTRYPOINT [ "java", "-jar", "consume-t.jar"] 