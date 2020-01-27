package com.phenom.org.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

public class Person
{
    private Vehicle vehicle;

    @Autowired
    @Qualifier("bike")
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void drive()
    {
        vehicle.Drive();
    }
}
