package com.skptech.map;

import com.skptech.Instructor;
import com.skptech.Instructors;

import java.util.Set;
import java.util.stream.Collectors;

public class MapExample {

    public static void main(String[] args) {
        Set<String> instructorNames = Instructors.getAll().stream()
                .map(Instructor::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        System.out.println(instructorNames);
    }

}
