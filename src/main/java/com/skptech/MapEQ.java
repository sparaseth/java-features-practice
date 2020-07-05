package com.skptech;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class MapEQ {

    public static void main(String[] args) {
        Map<WorkDay, String> map = new HashMap<>();
        WorkDay t1= new WorkDay("Monday");
        WorkDay t2= new WorkDay("Monday");
        WorkDay t3= new WorkDay("Tuesday");

        map.put(t1, "Travel");
        map.put(t2, "Play");
        map.put(t3, "Work");

        System.out.println(map.size());

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("SKP");
        list.add("GP");
        list.add("HOLA");

        Iterator<String> it = list.iterator();
        list.remove("HOLA");
        while (it.hasNext()){
            list.remove("HOLA");
            System.out.println(it.next());
        }
    }
}

class WorkDay{
    String day;
     public WorkDay(String day){
        this.day = day;
     }
     public boolean equals(Object object){
         return ((WorkDay)object).day == this.day;
     }
}
