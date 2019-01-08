package com.myroom.task6;

import com.myroom.task5.Driver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("task6-config.xml");
        Driver driver = (Driver)context.getBean("trucker");
        driver.steer();
    }
}
