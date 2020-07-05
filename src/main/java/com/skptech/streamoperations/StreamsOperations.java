package com.skptech.streamoperations;

import com.skptech.Instructor;
import com.skptech.Instructors;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsOperations {

    public static void main(String[] args) {
        //count distinct
        Long count = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .count();
        System.out.println("Count :" + count);

        List<String> courses = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(courses);

        boolean match = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .noneMatch(s -> s.startsWith("J"));
        System.out.println(match);
    }
}
