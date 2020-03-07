# Service Discovery Server

Implementation of a Spring Boot microservice integrated with multiple open source tools

## Build and Deploy Localy

```
./gradlew build
docker build -t open-stack-service:latest .
docker network create open-stack
docker-compose up
```
