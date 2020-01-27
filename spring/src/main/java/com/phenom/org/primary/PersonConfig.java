package com.phenom.org.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PersonConfig
{
    @Bean
    public Bike bike()
    {
        return new Bike();
    }
    @Bean
    public Car car()
    {
        return new Car();
    }
    @Bean
    public Person person()
    {
        return new Person();
    }
}
