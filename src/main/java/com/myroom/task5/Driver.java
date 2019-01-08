package com.myroom.task5;

public class Driver implements DriverCar {
    private String price;
    private Car car;


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
        System.out.println("Car price: " + price);
        car.drive();
    }
}
