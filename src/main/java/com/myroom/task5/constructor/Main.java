package com.myroom.task5.constructor;

import com.myroom.task5.Driver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("task5.constructor-config.xml");
        DriverConstructor driverConstructor = (DriverConstructor)context.getBean("toreto");
        driverConstructor.steer();
    }
}
