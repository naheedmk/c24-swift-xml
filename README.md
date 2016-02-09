# Swift to XML Transformer

This is a simple Spring Boot project that parses an MT103 message and then writes the same message back to the Console. Firstly init's original format and then as XML.

## Building the project

Maven is used to control the build lifecycle.
To build the project execute the following maven command:

     mvn clean install 
    
## About the Project

Spring Boot is used to boot strap the application. The maven plugin is responsible for packaging the jar and setting the executable main class.

```
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <mainClass>biz.c24.io.Application</mainClass>
                </configuration>
            </plugin>
```
 
## Running the application

To run the application execute the following command:

```
	mvn spring-boot:run
```

## Links

* [C24 IO] (http://c24tech.com)
* [C24 Git Hub Repository] (https://github.com/C24-Technologies)
* [Spring Boot Reference Guide] (http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)