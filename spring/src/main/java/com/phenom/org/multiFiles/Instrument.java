package com.phenom.org.multiFiles;

public class Instrument
{
    private String name;

    @Override
    public String toString() {
        return "Instrument{" +
                "name='" + name + '\'' +
                '}';
    }

    public Instrument(String name) {
        this.name = name;
    }
}
