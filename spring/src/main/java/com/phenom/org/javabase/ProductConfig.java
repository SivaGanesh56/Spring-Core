package com.phenom.org.javabase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig
{
    @Bean
    public Product product()
    {
        return new Product("A-131","Lapiee");
    }

    @Bean
    public Address address()
    {
        Address add = new Address();
        add.setPin(131);
        add.setArea("Hyd");
        return add;
    }
}
