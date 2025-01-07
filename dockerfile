FROM openjdk:17

COPY target/docker-app.jar /usr/app/

WORKDIR /usr/app/

ENTRYPOINT [ "java","-jar","docker-app.jar" ]