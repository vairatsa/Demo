# Use official OpenJDK 11 image as base image
FROM openjdk:11

# Set the working directory in the container
WORKDIR /app

# Copy the packaged jar file into the container at the defined working directory
COPY target/DockerTest.jar /app/DockerTest.jar

# Expose the port the application runs on
EXPOSE 8085

# Define the command to run your application
CMD ["java", "-jar", "DockerTest.jar"]
