## Real-Time Data Processing and Visualization with Spring Boot and Apache Spark

# Project Overview

This project demonstrates real-time data processing using Apache Spark and a Spring Boot application for visualizing the processed data. It integrates Kafka for data ingestion and MongoDB for data storage.

# Technologies Used

- Java, Spring Boot
- Apache Spark
- Kafka
- MongoDB
- Docker, Kubernetes
- Maven
- REST APIs
- CI/CD with Jenkins
- HTML, JavaScript (React for frontend)


## Build and Run Instructions

### Prerequisites
- Docker
- Docker Compose
- Maven
- Java Development Kit (JDK)
- Scala (for Spark processing)

# Steps to Run
docker-compose up

# Access the Spring Boot application:
Open a web browser and go to http://localhost:8080/data

# Submit Spark job:
- Spark job is automatically submitted via Docker Compose configuration when containers are started.

- Monitor Kafka topics and MongoDB for data ingestion and storage respectively.

# Additional Notes
Adjust Kafka and MongoDB configurations in application.properties and docker-compose.yml as per your environment setup.
The Spark job processes data from Kafka topic "topic" and saves it to MongoDB "realtime.data".

This project integrates various technologies such as Spring Boot, Apache Spark, Kafka, and MongoDB to demonstrate real-time data processing and visualization. The provided code and structure adhere to best practices and are designed to be scalable and maintainable, meeting FAANG-level standards for enterprise applications.
