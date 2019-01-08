package com.myroom.task4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("task4-config.xml");
        InfoPage infoPage = (InfoPage)context.getBean("info");
        System.out.println("Name: " + infoPage.getName());
        System.out.println("Age: " + infoPage.getAge());
        System.out.println("Dream country: "+ infoPage.getDreamCountry());
        System.out.println("Address: "+ infoPage.getAddress());
    }
}
