# myspringactuatorplanet
Spring Boot Actuator example project

The corresponding blog post can be found here: https://mydeveloperplanet.wordpress.com/2018/04/18/spring-boot-actuator-in-spring-boot-2-0/

In branch feature/jmxendpoints the configuration with Jolokia can be found.
The available endpoints can be retrieved with url: http://localhost:8080/actuator/jolokia/list

Locate the health mbean and invoke the health mbean with an url like the following: http://localhost:8080/actuator/jolokia/exec/org.springframework.boot:type=Endpoint,name=Health,identity=4200098/health
