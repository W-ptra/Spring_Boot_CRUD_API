# Use an official Maven image with JDK 21
FROM maven:3.9.4-eclipse-temurin-21 AS build

# Set the working directory in the container
WORKDIR /app

# Copy the pom.xml and maven wrapper files to the container
COPY pom.xml ./
COPY mvnw ./
COPY .mvn .mvn

# Download Maven dependencies (this step is cached unless pom.xml changes)
RUN ./mvnw dependency:go-offline

# Copy the rest of the application source code to the container
COPY src ./src

# Build the application (skipping tests for faster build times)
RUN ./mvnw package -DskipTests

# Use the JDK 21 base image for running the application
FROM eclipse-temurin:21-jdk

# Set the working directory in the container
WORKDIR /app

# Copy the built application from the build stage
COPY --from=build /app ./

# Command to run the application
CMD ["./mvnw", "spring-boot:run"]
