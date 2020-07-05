package com.skptech.bipredicate;

import com.skptech.Instructor;
import com.skptech.Instructors;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        BiPredicate<Boolean, Integer> biPredicate = (online, experience) -> online == true && experience > 10;
        BiConsumer<String, List<String>> biConsumer = (name, courses) -> System.out.println("Name :" + name + " Courses :" + courses);

        instructors.forEach(instructor -> {
            if (biPredicate.test(instructor.isOnlineCourses(), instructor.getYearsOfExperience())) {
                biConsumer.accept(instructor.getName(), instructor.getCourses());
            }
        });
    }
}
