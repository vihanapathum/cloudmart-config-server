# CloudMart — Config Server

## Project Description

Spring Cloud Config Server for the CloudMart platform. Centralizes and
externalizes shared, non-sensitive configuration for every microservice
(API Gateway, Product Service, Order Service, User Service) using the
"native" file-based profile — see `src/main/resources/config-repo/`.

Sensitive configuration (database credentials, connection strings) is
deliberately **not** stored here. It is injected directly as environment
variables on each VM at deploy time, so secrets never live in a config
repository. Each service still registers with Eureka and can be discovered
through the platform like any other component.

## Technology Stack

- Java 25
- Spring Boot 4.0.7
- Spring Cloud 2025.1 (Config Server, Eureka Client)
- PM2 (process management on the deployed VM)

## Setup / Getting Started

### Prerequisites

- Java 25 JDK
- Maven 3.9+

### Run locally

```bash
mvn clean package
java -jar target/config-server.jar
```

Verify a service's config is being served, e.g.:

```bash
curl http://localhost:8888/product-service/default
```

## Student Information

- **Student Name:** A.G.Vihana Pathum Piyasiri
- **Student Number:** 2301692038
- **Slack Handle:** vihana_piyasiri
- **GCP Project ID:** project-1023ef7b-f75c-4e17-ab5
