package com.skptech.collectorsminmax;

import com.skptech.Instructor;
import com.skptech.Instructors;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsMinMaxExample {

    public static void main(String[] args) {
        //instructor with minimum years of experience
        Optional<Instructor> instructor = Instructors.getAll().stream()
                .collect(
                        Collectors.minBy(
                                Comparator.comparing(Instructor::getYearsOfExperience)
                        )
                );
        System.out.println("min experience instructor = " + instructor);
        System.out.println("---------------");

        instructor = Instructors.getAll().stream().min(Comparator.comparing(Instructor::getYearsOfExperience));
        System.out.println("min experience instructor = " + instructor);
        System.out.println("---------------");

        instructor = Instructors.getAll().stream().collect(Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience)));
        System.out.println("max experience instructor = " + instructor);
        System.out.println("---------------");

        instructor = Instructors.getAll().stream().max(Comparator.comparing(Instructor::getYearsOfExperience));
        System.out.println("max experience instructor = " + instructor);
        System.out.println("---------------");
    }
}
