package com.myroom.task7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("task7-config.xml");
        IBeer friendsApartment = (IBeer)context.getBean("apartment");
        IBeer pub = (IBeer)context.getBean("pub");
        veritification(friendsApartment);
        veritification(pub);
    }

    public static void veritification(IBeer beer) {
        Beer beer1 = beer.getBeer();
        Beer beer2 = beer.getBeer();
        System.out.println("Are Beer instances the same? " + (beer1 == beer2));
    }
}
