# OpenAPI Generator Spring Server Stub Tutorial
This project sets up a Spring server stub with the OpenAPI Generator. Different branches represent different steps.

### **Stack**
* Java 17
* Spring Boot 3.0.2
* OpenAPI Generator Maven Plugin 6.5.0

## Set up the generator

### Configure the plugin
Go to [link](https://openapi-generator.tech/docs/plugins/) and copy or copy the snippet below to plugins section of the `pom.xml`:
```
    <plugin>
        <groupId>org.openapitools</groupId>
        <artifactId>openapi-generator-maven-plugin</artifactId>
        <!-- RELEASE_VERSION -->
        <version>6.5.0</version>
        <!-- /RELEASE_VERSION -->
        <executions>
            <execution>
                <goals>
                    <goal>generate</goal>
                </goals>
                <configuration>
                    <inputSpec>${project.basedir}/src/main/resources/api.yaml</inputSpec>
                    <generatorName>spring</generatorName>
                    <apiPackage>com.bookstore.demo</apiPackage>
                    <configOptions>
                        <sourceFolder>src/gen/java/main</sourceFolder>
                        <useSpringBoot3>true</useSpringBoot3>
                        <useTags>true</useTags>
                        <delegatePattern>true</delegatePattern>
                    </configOptions>
                </configuration>
            </execution>
        </executions>
    </plugin>
```

### Add missing dependencies
The dependencies missing may vary according to the framework and configurations. The ones below are specific to this project:
```
<dependency>
    <groupId>io.swagger.parser.v3</groupId>
    <artifactId>swagger-parser</artifactId>
    <version>2.1.12</version>
</dependency>

<dependency>
    <groupId>org.openapitools</groupId>
    <artifactId>jackson-databind-nullable</artifactId>
    <version>0.2.6</version>
</dependency>

<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.9.2</version>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <version>3.0.2</version>
</dependency>
```

### Run the generator
To run the generator, try the following command and check the `target` folder:
```
mvn compile
```

## Templating

* [OpenAPI Generator Templating docs](https://openapi-generator.tech/docs/templating)
* [Mustache Templates Repository](https://github.com/openapitools/openapi-generator/tree/master/modules/openapi-generator/src/main/resources)

## More resources

* [OpenAPI Generator Github](https://openapi-generator.tech/)
* [OpenAPI Generator Docs](https://openapi-generator.tech/)
* [OpenAPI Generator Docs - Spring Generator](https://openapi-generator.tech/docs/generators/spring/)
* [OpenAPI Generator Docs - Global Properties](https://openapi-generator.tech/docs/globals)