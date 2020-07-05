package com.skptech.joining;

import com.skptech.Instructor;
import com.skptech.Instructors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {

    public static void main(String[] args) {
        String result = Stream.of("E", "F", "G", "H").collect(Collectors.joining());
        System.out.println(result);

        result = Stream.of("E", "F", "G", "H").collect(Collectors.joining(","));
        System.out.println(result);

        result = Stream.of("E", "F", "G", "H").collect(Collectors.joining(",", "{", "}"));
        System.out.println(result);

        String instructorNames = Instructors.getAll().stream().map(Instructor::getName)
                .collect(Collectors.joining(",", "{", "}"));
        System.out.println(instructorNames);
    }
}
