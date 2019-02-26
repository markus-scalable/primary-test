package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DemoApplication {

    static class Foo {

    }

    @Component
    static class Bar {

        @Autowired
        Foo foo;

    }

    @Configuration
    static class DemoConfig {

        @Bean
        @Primary
        Foo foo1() {
            return new Foo();
        }

        @Bean
        Foo foo2() {
            return new Foo();
        }

    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
