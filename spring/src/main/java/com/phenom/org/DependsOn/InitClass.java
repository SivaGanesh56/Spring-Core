package com.phenom.org.DependsOn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InitClass
{
    public static void main(String[] args) {

        ApplicationContext api = new AnnotationConfigApplicationContext(InitConfig.class);
        api.getBean("initilization",Initilization.class);
    }
}
