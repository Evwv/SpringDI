package com.myroom.task2.constructorI;

import java.util.Map;

public class BeerMap {
    Map<String,Integer> map;

    public BeerMap(Map<String, Integer> map) {
        this.map = map;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public int size() {
        return map.size();
    }
}
