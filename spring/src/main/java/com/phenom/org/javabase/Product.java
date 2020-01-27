package com.phenom.org.javabase;

public class Product
{
    private String id;
    private String name;

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
