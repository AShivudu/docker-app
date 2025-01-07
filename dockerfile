FROM openjdk:17

COPY target/dockerfile.jar /usr/app/

WORKDIR /usr/app/

ENTRYPOINT [ "java","-jar","dockerfile.jar" ]
