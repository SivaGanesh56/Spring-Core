package com.phenom.org.shopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Scope("prototype")
@Component
public class Cart
{
    private List<Product> productList = new ArrayList<Product>();
    public void addProduct(Product product)
    {
        productList.add(product);
    }


    public List<Product> list(){
        return productList;
    }
}
