package com.skptech.predicate;

import com.skptech.Instructor;
import com.skptech.Instructors;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {

    public static void main(String[] args) {
        //all instructor who teaches online
        Predicate<Instructor> instructorPredicate1 = (instructor) -> instructor.isOnlineCourses() == true;

        //instructor experience is >10 years
        Predicate<Instructor> instructorPredicate2 = (instructor) -> instructor.getYearsOfExperience() > 10;

        List<Instructor> instructors = Instructors.getAll();
        instructors.forEach(instructor -> {
            if (instructorPredicate1.test(instructor)) {
                System.out.println(instructor);
            }
        });

        System.out.println("--------------------------------------------------------");

        instructors.forEach(instructor -> {
            if (instructorPredicate1.and(instructorPredicate2).test(instructor)) {
                System.out.println(instructor);
            }
        });
    }
}
