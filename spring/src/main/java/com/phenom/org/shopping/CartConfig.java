package com.phenom.org.shopping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.phenom.org.shopping.s")
public class CartConfig
{
    @Bean
    public Product product1()
    {
        return  new Product("Bike");
    }

    @Bean
    public Product product2()
    {
        return  new Product("car");
    }

    //@Bean
    public Cart cart()
    {
        return new Cart();
    }
}
