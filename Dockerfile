
# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the executable jar file from the host to the working directory in the container
COPY target/DockerDemo-SNAPSHOT.jar /app/dockerdemoappsnapshot.jar

ENV PORT 8089
# Expose the port that the application will run on
EXPOSE 8089

# Set the entry point to run the jar file
ENTRYPOINT ["java", "-jar", "dockerdemoappsnapshot.jar"]

