package com.phenom.org.shopping;

import com.phenom.org.primary.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CartMain
{
    public static void main(String[] args) {

        ApplicationContext api = new AnnotationConfigApplicationContext(CartConfig.class);

        Product product1 = api.getBean("product1",Product.class);
        Cart cart = api.getBean("cart",Cart.class);
        cart.addProduct(product1);
        System.out.println(cart.list());



        Product product2 = api.getBean("product2",Product.class);
        Cart cart2 = api.getBean("cart",Cart.class);
        cart2.addProduct(product2);
        System.out.println(cart2.list());
    }
}
