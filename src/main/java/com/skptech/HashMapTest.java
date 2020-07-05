package com.skptech;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(120, "Holo");
        map.put(11, "Hey");
        map.put(null, "Hii");
        map.put(null, null);
        System.out.println(map.size());
        System.out.println(map);

        Map<String, String> map1 = new HashMap<>();
        map1.put(null, "H");
    }
}
