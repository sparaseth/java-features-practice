package com.skptech.stream;

import com.skptech.Instructor;
import com.skptech.Instructors;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        //creating a map of names and course of instructors who teaches
        //online have more than 10 years of experience
        Predicate<Instructor> predicate1 = (instructor) -> instructor.isOnlineCourses();
        Predicate<Instructor> predicate2 = (instructor) -> instructor.getYearsOfExperience() > 10;

        List<Instructor> instructors = Instructors.getAll().stream()
                .filter(predicate1)
                .filter(predicate2)
                .collect(Collectors.toList());

        Map<String, List<String>> map = Instructors.getAll().stream()
                .filter(predicate1)
                .filter(predicate2)
                .peek(s-> System.out.println(s))
                .collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));

    }
}
