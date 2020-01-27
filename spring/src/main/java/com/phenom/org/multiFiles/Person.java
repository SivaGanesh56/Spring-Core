package com.phenom.org.multiFiles;

public class Person
{
    private Instrument instrument;

    public Person(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return "Person{" +
                "instrument=" + instrument +
                '}';
    }
}
