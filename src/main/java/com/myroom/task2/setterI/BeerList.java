package com.myroom.task2.setterI;

import com.myroom.task2.constructorI.Beer;

import java.util.List;

public class BeerList {
    List<Beer> list;

    public void setList(List<Beer> list) {
        this.list = list;
    }

    public List<Beer> getList() {
        return list;
    }

    public int size() {
        return list.size();
    }
}
