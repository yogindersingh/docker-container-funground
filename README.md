# docker-container-funground

A Spring Boot REST application demonstrating how to containerize a Maven project with Docker. The repository also includes a curated collection of reference Dockerfiles, docker-compose files, and Docker command examples.

## Application

- **Endpoint:** `GET http://localhost:9001/` → `"Dockerizing Spring Boot Application"`
- **Stack:** Java 17, Spring Boot 3.2.1, Maven

## Build Commands

```bash
# Build and create Docker image
mvn clean install -DskipTests -Dprofile=containerizeapp

# Build locally without creating Docker image
mvn clean install -DskipTests -Dprofile=local

# Run tests
mvn test
```

## Run

```bash
# Run the JAR directly
java -jar target/docker-playground.jar

# Build and run as a Docker container
docker build -t docker-playground:latest .
docker run -p 9001:9001 docker-playground:latest
```

## Reference Resources

| Directory | Contents |
|-----------|----------|
| `src/main/resources/commands/` | Docker CLI command reference |
| `src/main/resources/dockerFiles/` | Example Dockerfiles (Nginx, Node.js, Java) |
| `src/main/resources/docker-compose-files/` | Example docker-compose configurations |
| `src/main/resources/stackDeployCompost/` | Docker Swarm stack deployment examples |
| `src/main/resources/docker-stack-compose-file-with-secret-example/` | Secret management examples |

## Links

- **Git Repository:** https://github.com/yogindersingh/docker-container-funground
- **Docker Hub:** https://hub.docker.com/repository/docker/yogindersingh/docker-playground/general
- **Docker Documentation:** https://docs.docker.com/
