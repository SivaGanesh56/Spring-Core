package com.phenom.org.javabase;

public class Address {
    private int pin;
    private String area;

    @Override
    public String toString() {
        return "Address{" +
                "pin=" + pin +
                ", area='" + area + '\'' +
                '}';
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
