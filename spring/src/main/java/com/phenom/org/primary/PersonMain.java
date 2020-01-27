package com.phenom.org.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonMain
{
    public static void main(String[] args) {

        ApplicationContext api = new AnnotationConfigApplicationContext(PersonConfig.class);
        api.getBean(Person.class).drive();
    }
}
