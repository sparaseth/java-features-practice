package com.skptech.groupingby;

import com.skptech.Instructor;
import com.skptech.Instructors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample1 {

    public static void main(String[] args) {
        //group list of name by their length
        List<String> names = Arrays.asList("Syed", "Mike", "Jenny", "Gene", "Rajeev");
        Map<Integer, List<String>> result = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("Result :" + result);

        System.out.println("-----------------------------------------------------------");
        //grouping by instructors by their gender
        Map<String, List<Instructor>> instructorByGender = Instructors.getAll().stream().collect(Collectors.groupingBy(Instructor::getGender));
        instructorByGender.forEach((k, v) -> {
            System.out.println("Key :" + k + " Value :" + v);
        });
        System.out.println("-----------------------------------------------------------");

        //grouping by experience where >10 years of experience is classified
        //as Senior and others are junior
        Map<String, List<Instructor>> instructorByExperience = Instructors.getAll().stream().collect(Collectors.groupingBy(instructor ->
                instructor.getYearsOfExperience() > 10 ? "SENIOR" : "JUNIOR"));
        instructorByExperience.forEach((k, v) -> {
            System.out.println("Key :" + k + " Value :" + v);
        });

    }
}
