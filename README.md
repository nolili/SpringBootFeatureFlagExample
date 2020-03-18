# SpringBootFeatureFlagExample

- Enable/Disable FeatureFlagController using property `"com.noritakakamiya.feature-flag"`
- Default value is written in [src/main/resources/application.yml](https://github.com/nolili/SpringBootFeatureFlagExample/blob/master/src/main/resources/application.yml)

## How to use

```shell script
# Use new feature
$ ./mvnw spring-boot:run -Dcom.noritakakamiya.feature-flag=true -Dspring-boot.run.fork=false
$ curl http://localhost:8080/new-feature
> This is new feature!

# Disable new feature
$ ./mvnw spring-boot:run -Dcom.noritakakamiya.feature-flag=false -Dspring-boot.run.fork=false
$ curl http://localhost:8080/new-feature
> {"timestamp":"2020-03-07T08:15:08.883+0000","status":404,"error":"Not Found","message":"No message available","path":"/new-feature"}
````

Using `-Dspring-boot.run.fork=false` for simplified README. 
Please see https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.2-Release-Notes#fork-enabled-by-default-in-maven-plugin   
