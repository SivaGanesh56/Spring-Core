package com.phenom.org.collection;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig
{
    @Bean(name = "Smart Device")
    public Product product1()
    {
        return new Product(1,"Laptop");
    }

    @Bean(name="Vehicle1")
    public Product product2()
    {
        return new Product(2,"Bike");
    }

    @Bean(name="Vehicle2")
    public Product product3()
    {
        return new Product(3,"Car");
    }

    @Bean
    public ProductViewer productViewer()
    {
        return new ProductViewer();
    }

}
