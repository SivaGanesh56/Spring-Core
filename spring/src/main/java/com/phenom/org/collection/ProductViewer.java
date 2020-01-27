package com.phenom.org.collection;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class ProductViewer
{
//    @Autowired
//    List<Product> products;


    @Autowired
    Map<String,Product>products;

    public void getProducts()
    {
        for(Map.Entry<String,Product> product : products.entrySet())
        {
            System.out.println(product.getKey()+"===>"+product.getValue());
        }
    }
}
