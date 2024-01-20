FROM tomcat

USER root

expose 9001

WORKDIR application

COPY target/docker-playground.jar .

ENTRYPOINT ["java","-jar","-Dspring.profiles.active=local","docker-playground.jar"]

