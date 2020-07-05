package com.skptech.flatmap;

import com.skptech.Instructors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapExample {

    public static void main(String[] args) {
        Set<String> courses = Instructors.getAll()
                .stream().map(instructor -> instructor.getCourses()).flatMap(List::stream).collect(Collectors.toSet());
        courses.forEach(course -> System.out.println(course));
    }
}
