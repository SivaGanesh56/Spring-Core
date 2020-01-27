package com.phenom.org.javabase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductMain
{
    public static void main(String[] args)
    {
        ApplicationContext api = new AnnotationConfigApplicationContext(ProductConfig.class);
        System.out.println(api.getBean("product"));
        System.out.println(api.getBean("address"));
    }
}
