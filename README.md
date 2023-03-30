# OpenAPI Generator Server Stub Demo
Bookstore API client generator demo


### Set up the generator

#### Configure the plugin
Go to [link](https://openapi-generator.tech/docs/plugins/) and copy or copy the snippet below to plugins section of the `pom.xml`:
```
    <plugin>
        <groupId>org.openapitools</groupId>
        <artifactId>openapi-generator-maven-plugin</artifactId>
        <!-- RELEASE_VERSION -->
        <version>6.3.0</version>
        <!-- /RELEASE_VERSION -->
        <executions>
            <execution>
                <goals>
                    <goal>generate</goal>
                </goals>
                <configuration>
                    <inputSpec>${project.basedir}/src/main/resources/api.yaml</inputSpec>
                    <generatorName>spring</generatorName>
                    <configOptions>
                        <sourceFolder>src/gen/java/main</sourceFolder>
                        <useTags>true</useTags>
                    </configOptions>
                </configuration>
            </execution>
        </executions>
    </plugin>
```

#### Add missing dependencies
The dependencies missing may vary according to the framework and configurations.
```
<dependency>
    <groupId>javax.annotation</groupId>
    <artifactId>javax.annotation-api</artifactId>
    <version>1.3.1</version>
</dependency>

<dependency>
    <groupId>org.openapitools</groupId>
    <artifactId>jackson-databind-nullable</artifactId>
    <version>0.2.6</version>
</dependency>

<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>javax.servlet-api</artifactId>
    <version>4.0.1</version>
</dependency>

<dependency>
    <groupId>io.swagger.parser.v3</groupId>
    <artifactId>swagger-parser</artifactId>
    <version>2.1.12</version>
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

#### Run the generator
To run the generator, try the following command and check the `target` folder:
```
mvn compile
```


## Templating

https://openapi-generator.tech/docs/templating

## More resources

* [OpenAPI Generator Github](https://openapi-generator.tech/)
* [OpenAPI Generator Docs](https://openapi-generator.tech/)
* [OpenAPI Generator Docs - Spring Generator](https://openapi-generator.tech/docs/generators/spring/)
* [OpenAPI Generator Docs - Global Properties](https://openapi-generator.tech/docs/globals)