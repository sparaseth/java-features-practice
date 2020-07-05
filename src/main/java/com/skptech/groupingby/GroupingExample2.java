package com.skptech.groupingby;

import com.skptech.Instructor;
import com.skptech.Instructors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingExample2 {

    public static void main(String[] args) {
        //grouping by length of string and also checking that the names contains e
        //and only return those name which has e in it
        List<String> names = Arrays.asList("Sid", "Mike", "Jenny", "Gene", "Rajeev");
        Map<Integer, List<String>> result = names.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.toList()));
        System.out.println("result = " + result);
        System.out.println("-------------------------------------------------------------");

        Map<Integer, List<String>> result1 = names.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.filtering(s -> s.contains("e"), Collectors.toList())));
        System.out.println("result1 = " + result1);
        System.out.println("-------------------------------------------------------------");

        //instructor grouping them by Senior(>10) and Junior(<10) and filter them
        //on online courses
        Map<String, List<Instructor>> instructorByExpAndOnline = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(
                        instructor -> instructor.getYearsOfExperience() > 10 ? "SENIOR" : "JUNIOR",
                        Collectors.filtering(s -> s.isOnlineCourses(),
                                Collectors.toList()))
                );
        instructorByExpAndOnline.forEach((key, value) -> {
            System.out.println("key  = " + key + " value = " + value);
        });
    }
}
