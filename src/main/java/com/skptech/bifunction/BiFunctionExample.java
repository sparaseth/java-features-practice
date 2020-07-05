package com.skptech.bifunction;

import com.skptech.Instructor;
import com.skptech.Instructors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    public static void main(String[] args) {

        // Two inputs: 1) list of instructors 2) predicate - which will filter the instructor who has online courses
        // Return map of name and years of experience
        Predicate<Instructor> predicate = (instructor) -> instructor.isOnlineCourses() == true;
        BiFunction<List<Instructor>, Predicate<Instructor>, Map<String, Integer>> mapBiFunction =
                ((instructors, instructorPredicate) -> {
                    Map<String, Integer> map = new HashMap<>();
                    instructors.forEach(instructor -> {
                        if (instructorPredicate.test(instructor)) {
                            map.put(instructor.getName(), instructor.getYearsOfExperience());
                        }
                    });
                    return map;
                });
        System.out.println(mapBiFunction.apply(Instructors.getAll(), predicate));

    }
}
