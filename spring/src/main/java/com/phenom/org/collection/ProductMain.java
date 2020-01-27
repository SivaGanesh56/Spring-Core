package com.phenom.org.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductMain
{
    public static void main(String[] args) {
        ApplicationContext api = new AnnotationConfigApplicationContext(ProductConfig.class);
        api.getBean(ProductViewer.class).getProducts();
    }
}
