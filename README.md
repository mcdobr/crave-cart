# Crave-cart
This is a playground representing a food delivery app.

# Purpose
This is only intended for the author's personal learning.

### Targeted learning topics
- Kotlin
- Microservices
- Better resilience techniques
- Kafka
- Vault
- React
- Micro-frontends

# Big picture architecture

## Services

- cart - manage the user's cart. REST API in FaaS
- catalog - manage restaurant offers. REST API in FaaS
- order - manage order state. REST API in FaaS
- delivery tracking - real time updates on delivery location. WebSockets API in container


# Folder structure

This is a rough outline of the structure of the projects, separating components. Since this is a repo for learning 
I opted for a monorepo approach to make easier to see changes just in one place and not manage multiple repos 
all the time.

```
project-root/
├── clients/
│   ├── client-1/
│   │   ├── src/
│   │   └── ...
│   ├── client-2/
│   │   ├── src/
│   │   └── ...
│   └── ...  # Other clients can be added here
├── services/
│   ├── service-1/
│   │   ├── src/
│   │   ├── Dockerfile
│   │   └── ...
│   ├── service-2/
│   │   ├── src/
│   │   ├── Dockerfile
│   │   └── ...
│   └── ...  # Other services can be added here
├── infrastructure/
│   ├── volumes/
│   │   ├── infrastructure-service-1-volume/
│   │   │   ├── volume-files/  # Volume-specific files for service-1
│   │   │   └── ...  # Additional volume files for infrastructure-service-1
│   │   ├── infrastructure-service-2-volume/
│   │   │   ├── volume-files/  # Volume-specific files for service-2
│   │   │   └── ...  # Additional volume files for infrastructure-service-2
│   │   └── ...
│   ├── services/
│   │   ├── infrastructure-service-1-service/
│   │   │   ├── docker-compose.yml
│   │   │   ├── init-scripts/
│   │   │   └── ...  # Service-specific files for infrastructure-service-1
│   │   ├── infrastructure-service-2-service/
│   │   │   ├── docker-compose.yml
│   │   │   ├── init-scripts/
│   │   │   └── ...  # Service-specific files for infrastructure-service-2
│   │   └── ...
│   └── README.md
└── README.md
```

# Resource links

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.3.1/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.3.1/gradle-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.3.1/reference/htmlsingle/index.html#using.devtools)
* [Docker Compose Support](https://docs.spring.io/spring-boot/docs/3.3.1/reference/htmlsingle/index.html#features.docker-compose)
* [Apache Kafka Streams Support](https://docs.spring.io/spring-kafka/docs/current/reference/html/#streams-kafka-streams)
* [Apache Kafka Streams Binding Capabilities of Spring Cloud Stream](https://docs.spring.io/spring-cloud-stream/docs/current/reference/htmlsingle/index.html#_kafka_streams_binding_capabilities_of_spring_cloud_stream)

### Guides
The following guides illustrate how to use some features concretely:

* [Samples for using Apache Kafka Streams with Spring Cloud stream](https://github.com/spring-cloud/spring-cloud-stream-samples/tree/master/kafka-streams-samples)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

### Docker Compose support
This project contains a Docker Compose file named `compose.yaml`.

