package com.myroom.task5.constructor;

import com.myroom.task5.Car;
import com.myroom.task5.DriverCar;

public class DriverConstructor implements DriverCar {
    private String price;
    private Car car;

    public DriverConstructor(String price, Car car) {
        this.price = price;
        this.car = car;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void steer() {
        System.out.println("Car price: "+ price);
        car.drive();
    }
}
