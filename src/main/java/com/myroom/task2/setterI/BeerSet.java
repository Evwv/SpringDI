package com.myroom.task2.setterI;

import com.myroom.task2.constructorI.Beer;

import java.util.Set;

public class BeerSet {
    Set<Beer> set;

    public Set<Beer> getSet() {
        return set;
    }

    public void setSet(Set<Beer> set) {
        this.set = set;
    }

    public int size() {
        return set.size();
    }
}
