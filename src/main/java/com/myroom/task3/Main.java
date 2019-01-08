package com.myroom.task3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("task3-config.xml");
        Junior junior = (Junior)context.getBean("jun");
        System.out.println("Info about Junior: ");
        System.out.println("Name company: " + junior.getNameCompany());
        System.out.println("Work status: " + junior.getStatusWork());

        System.out.println();

        Senior senior = (Senior)context.getBean("sen");
        System.out.println("Info about Senior: ");
        System.out.println("Name company: " + senior.getNameCompany());
        System.out.println("Work status: " + senior.getStatusWork());
        System.out.println("lvl in online games: "+senior.getLvlInOnlineGames());
        System.out.println("Count drinks beer in work place: "+senior.getCountBeerInWorkPlace());

    }
}
