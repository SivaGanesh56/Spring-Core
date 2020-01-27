package com.phenom.org.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserMain
{
    public static void main(String[] args)
    {
        ApplicationContext api = new AnnotationConfigApplicationContext(UserConfig.class);
        api.getBean(UserService.class).save();
    }
}
