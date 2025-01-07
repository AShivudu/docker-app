FROM openjdk:17

COPY target/dockerfile /usr/app/

WORKDIR /usr/app/

ENTRYPOINT [ "java","-jar","dockerfile" ]