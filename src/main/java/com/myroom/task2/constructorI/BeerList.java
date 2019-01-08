package com.myroom.task2.constructorI;

import java.util.List;

public class BeerList {
    List<Beer> list;

    public BeerList(List<Beer> list) {
        this.list = list;
    }

    public List<Beer> getList() {
        return list;
    }

    public int size() {
        return list.size();
    }
}
