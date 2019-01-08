package com.myroom.task6;

import com.myroom.task5.Car;
import com.myroom.task5.Driver;

public class DriverFactory {
    public Driver createDriver() {
        Car lada = new Car() {
            public void drive() {
                System.out.println("Lada.drive");
            }
        };
        Driver trucker = new Driver();
        trucker.setCar(lada);
        trucker.setPrice("1");
        return trucker;
    }
}
