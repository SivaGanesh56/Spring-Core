package com.phenom.org.collection;

public class Product
{
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
