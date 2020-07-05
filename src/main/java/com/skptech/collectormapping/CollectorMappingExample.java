package com.skptech.collectormapping;

import com.skptech.Instructor;
import com.skptech.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorMappingExample {

    public static void main(String[] args) {

        List<String> names;

        //Using Map
        names = Instructors.getAll().stream().map(Instructor::getName).collect(Collectors.toList());
        names.forEach(System.out::println);

        //Using Mapping
        names = Instructors.getAll().stream().collect(Collectors.mapping(Instructor::getName, Collectors.toList()));
        names.forEach(System.out::println);

        Map<Integer, List<String>> mapYearsOfExperienceAndNames = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::getYearsOfExperience,
                        Collectors.mapping(Instructor::getName, Collectors.toList())));

        mapYearsOfExperienceAndNames.forEach((k, v)->{
            System.out.println("Key :"+k+ " Value :"+v);
        });
    }
}
