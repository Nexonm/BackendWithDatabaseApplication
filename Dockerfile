# Use an official Maven runtime as a parent image
FROM openjdk:17-ea-17-jdk-slim AS builder

# Set the working directory in the container
WORKDIR /app

# Copy everthing in my project inside the Docker's image
COPY . .

# Compile the application
RUN ./gradlew build -x test

# Optional. Specifies that the /temp direcotory will be uses as a volume to store temporaty files and cache data
VOLUME /tmp

# Copy the built application from the builder stage
COPY /build/libs/backend-with-database-0.0.1-SNAPSHOT.jar /app/beckapp.jar
# Wait gor postgres script run
RUN chmod +x /app/wait-for-postgres.sh

# Make port 8080 available outside the container
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "beckapp.jar"]




## from the other sources:
