package com.phenom.org.multiFiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args) {

        ApplicationContext api = new AnnotationConfigApplicationContext(PersonConfig.class);
        System.out.println(api.getBean(Person.class));
    }
}
