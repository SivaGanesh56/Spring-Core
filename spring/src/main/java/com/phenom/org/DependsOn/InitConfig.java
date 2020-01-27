package com.phenom.org.DependsOn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class InitConfig
{
    @Bean
    @DependsOn({"init"})
    public Initilization initilization()
    {
        return new Initilization();
    }


    @Bean
    public Init init()
    {
        return new Init();
    }
}
