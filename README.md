# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.alcideswenner.app-with-graalvm' is invalid and this project uses 'com.alcideswenner.appwithgraalvm' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.0/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.0/maven-plugin/reference/html/#build-image)
* [GraalVM Native Image Support](https://docs.spring.io/spring-boot/docs/3.1.0/reference/html/native-image.html#native-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.0/reference/htmlsingle/#web)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.1.0/reference/htmlsingle/#using.devtools)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Additional Links
These additional references should also help you:

* [Configure AOT settings in Build Plugin](https://docs.spring.io/spring-boot/docs/3.1.0/maven-plugin/reference/htmlsingle/#aot)

## GraalVM Native Support

This project has been configured to let you generate either a lightweight container or a native executable.
It is also possible to run your tests in a native image.

### Lightweight Container with Cloud Native Buildpacks
If you're already familiar with Spring Boot container images support, this is the easiest way to get started.
Docker should be installed and configured on your machine prior to creating the image.

To create the image, run the following goal:

```
$ ./mvnw spring-boot:build-image -Pnative
```

Then, you can run the app like any other container:

```
$ docker run --rm -p 8080:8080 app-with-graalvm:0.0.1-SNAPSHOT
```

### Executable with Native Build Tools
Use this option if you want to explore more options such as running your tests in a native image.
The GraalVM `native-image` compiler should be installed and configured on your machine.

NOTE: GraalVM 22.3+ is required.

To create the executable, run the following goal:

```
$ ./mvnw native:compile -Pnative
```

Then, you can run the app as follows:
```
$ target/app-with-graalvm
```

You can also run your existing tests suite in a native image.
This is an efficient way to validate the compatibility of your application.

To run your existing tests in a native image, run the following goal:

```
$ ./mvnw test -PnativeTest
```

## Testing the `/api/hello` Route

To test the `/api/hello` route, please follow the instructions below:

1. Make sure you have the API running locally on port 8080. If your API is running on a different port or domain, adjust the URL accordingly.

2. Open an API testing tool, such as Postman or cURL, or use a web browser.

3. Make a GET request to the following URL:

```
http://localhost:8080/api/hello
```

4. Wait for the API response.

5. If everything is correct, you will receive a response with the content:

```
Hello!
```

This indicates that the `/api/hello` route is functioning correctly, and it returns the "Hello!" message.

6. In case of any error or a different response, please ensure that the API is properly configured and running, or consult the API's documentation or the developer responsible for the API for further assistance.

Now you can test the `/api/hello` route and verify if it returns the expected "Hello!" response.
