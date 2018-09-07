# Overview

The project shows how to make spring cloud clustering sample. 

* Spring Cloud
* Docker
* Docker Compose


## Case

* Nginx as front load balancing.
* Two Zuul instance.
* Two Eureka instance.
* Two Hello World micro service.
* Two RabbitMQ instance.
* Two MQ Provider.
* Two MQ Consumer.


The ports are listed below:

<TODO>

## Quick Start

First, Let's start the whole clustering servers.

```
gradle clean build
docker-compose build
docker-compose up
```

Now let's validate the case step by step