# @Bean Annotation in Spring

## Overview

The `@Bean` annotation in Spring is used to define beans in a configuration class. It provides a way to explicitly declare a method that returns an object to be managed by the Spring container. This annotation is typically used in a `@Configuration` class to create and configure beans that are needed in your application.

## Table of Contents

- [Overview](#overview)
- [When to Use @Bean](#when-to-use-bean)
- [Basic Example](#basic-example)
- [Advanced Example](#advanced-example)
- [Benefits of Using @Bean](#benefits-of-using-bean)
- [Conclusion](#conclusion)
- [References](#references)

## When to Use @Bean

- **Third-Party Libraries**: When you need to configure and instantiate a bean for a third-party class that you do not control.
- **Complex Bean Creation**: When the bean creation involves complex logic or additional configuration that cannot be easily managed through component scanning.
- **Customization**: When you need to customize the initialization or destruction of a bean, such as setting specific properties or calling custom methods.

## Basic Example

Here’s a simple example of using the `@Bean` annotation in a Spring application:

```java
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MyService myService() {
        return new MyService();
    }
}

class MyService {
    public void serve() {
        System.out.println("Service is running...");
    }
}
```
### Benefits of Using @Bean
- **Explicit Configuration**: Provides a clear and explicit way to define how beans are created and configured.
- **Customization**: Allows for customization of bean properties and lifecycle methods.
- **Interoperability**: Useful when integrating with third-party libraries that cannot be annotated with Spring’s stereotype annotations.