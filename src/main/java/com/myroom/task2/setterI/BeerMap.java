package com.myroom.task2.setterI;

import java.util.Map;

public class BeerMap {
    Map<String,Integer> map;

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public int size() {
        return map.size();
    }
}
