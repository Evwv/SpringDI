package com.myroom.task2.constructorI;

import java.util.Set;

public class BeerSet {
    Set<Beer> set;

    public BeerSet(Set<Beer> set) {
        this.set = set;
    }

    public Set<Beer> getSet() {
        return set;
    }

    public int size() {
        return set.size();
    }
}
