# Service RegisterEureka 
# Pré-requis
* spring boot
* spring-cloud-starter-netflix-eureka-server
# Configuration
on AgixisServiceRegistercloudApplication add this annotations 
* EnableEurekaServer
On bootstrap.properties add this 
* spring.application.name=eureka-service
* spring.cloud.config.uri=http://localhost:8888
