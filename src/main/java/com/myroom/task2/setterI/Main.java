package com.myroom.task2.setterI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("task2-config.xml");

        BeerList beerList = (BeerList)context.getBean("beerListS");
        System.out.println(beerList.size());
        System.out.println(beerList);

        System.out.println("------------------");

        BeerSet beerSet = (BeerSet)context.getBean("beerSetS");
        System.out.println(beerSet.size());
        System.out.println(beerSet);

        System.out.println("------------------");

        BeerMap beerMap = (BeerMap)context.getBean("beerMapS");
        System.out.println(beerList.size());
        System.out.println(beerList);


    }
}
