# docker-container-funground
This repository serves as a comprehensive resource for Docker-related content, providing a curated collection of Dockerfiles, configuration files, and best practices for containerization.
A guide to create any maven project and contanerize it using docker.

# Docker commands
For reference some of the docker commands are present in the commands directory.

# Docker files
For reference some of the docker filed are present in the dockerFiles directory.

# docker-compose files
For reference some of the docker compose file are present in the docker-compose-files directory.

# docker swarm stack compose file
For reference some of the docker swarm stack compose files are present in the resources directory.

# Git Repository
https://github.com/yogindersingh/docker-container-funground

# Docker hub Repository
https://hub.docker.com/repository/docker/yoginder757/docker-funground

# Docker documentation
https://docs.docker.com/

# Build commands 

To build the project and create image also
mvn clean install -DskipTests -Dprofile=containerizeapp

To build the project without creating image
mvn clean install -DskipTests -Dprofile=local

