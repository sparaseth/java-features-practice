package com.skptech.predicateandbiconsumer;

import com.skptech.Instructor;
import com.skptech.Instructors;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndBiConsumerExample {

    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        Predicate<Instructor> instructorPredicate1 = Instructor::isOnlineCourses;

        Predicate<Instructor> instructorPredicate2 = (instructor) -> instructor.getYearsOfExperience() > 10;

        BiConsumer<String, List<String>> biConsumer = (name, courses) -> System.out.println("Name :" + name + " Courses :" + courses);

        instructors.forEach(instructor -> {
            if (instructorPredicate1.and(instructorPredicate2).test(instructor))
                biConsumer.accept(instructor.getName(), instructor.getCourses());
        });
    }
}
