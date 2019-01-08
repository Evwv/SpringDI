package com.myroom.task1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("task1-config.xml");
        laptop macbook = (laptop)context.getBean("macbook");
        laptop acer = (laptop)context.getBean("acer");

        System.out.println(macbook.getPrice());
        System.out.println(macbook.getVidioCard());
        System.out.println();
        System.out.println(acer.getPrice());
        System.out.println(acer.getVidioCard());

        System.out.println("-------------------------");

        laptop2 macbookC = (laptop2)context.getBean("macbookC");
        laptop2 acerC = (laptop2)context.getBean("acerC");

        System.out.println(macbookC.getPrice());
        System.out.println(macbookC.getVidioCard());
        System.out.println();
        System.out.println(acerC.getPrice());
        System.out.println(acerC.getVidioCard());
    }
}
