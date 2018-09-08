# Overview

The project shows how to make spring cloud clustering sample. 

* Spring Cloud
* Docker
* Docker Compose


## Case

* Nginx as front load balancing.
* Two Zuul instances.
* Two Eureka instances.
* Two Hello World MicroServices.
* Two RabbitMQ instances.
* Two MQ Providers.
* Two MQ Consumers.


The ports are listed below:


container | inner port | outer port
---|---|---
nginx | 80 | 80 
gateway 1 | 80 | 8080
gateway 2 | 80 | 8081
eureka 1 | 80 | 8761
eureka 2 | 80 | 8762
openapi 1 | 80 | 8082
openapi 2 | 80 | 8083

<TODO>


## Quick Start

First, Let's start the whole clustering servers.

```
gradle clean build
docker-compose -f docker-compose.prd.yml build
docker-compose -f docker-compose.prd.yml up
```

Now let's verify the case step by step