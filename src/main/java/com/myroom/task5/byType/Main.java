package com.myroom.task5.byType;

import com.myroom.task5.Driver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("task5.byType-config.xml");
        Driver driver = (Driver)context.getBean("toreto");
        driver.steer();
    }
}
