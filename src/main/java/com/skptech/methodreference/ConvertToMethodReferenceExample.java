package com.skptech.methodreference;

import com.skptech.Instructor;
import com.skptech.Instructors;

import java.util.function.Predicate;

public class ConvertToMethodReferenceExample {

    public static void main(String[] args) {
        Predicate<Instructor> instructorPredicate = ConvertToMethodReferenceExample::greaterThanTenYearsOfExperience;
        Instructors.getAll().forEach(instructor -> {
            if (instructorPredicate.test(instructor)) {
                System.out.println(instructor);
            }
        });
    }

    private static boolean greaterThanTenYearsOfExperience(Instructor instructor) {
        if (instructor.getYearsOfExperience() > 10)
            return true;
        return false;
    }
}
