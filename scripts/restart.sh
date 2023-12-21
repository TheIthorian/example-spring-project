#!/bin/bash

# Run Maven build
./mvnw clean package -DskipTests

# Copy JAR to docker directory
cp target/spring-project-0.0.1-SNAPSHOT.jar src/docker

# Change to docker directory
cd src/docker

# Stop and remove existing containers
docker-compose down

# Remove existing Docker image
docker rmi spring-project:latest

# # Build and run Docker containers
docker-compose up
