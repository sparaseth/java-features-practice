package com.skptech.summingaveraging;

import com.skptech.Instructor;
import com.skptech.Instructors;

import java.util.stream.Collectors;

public class CollectorSummingAveragingExample {

    public static void main(String[] args) {
        //sum of year of experience of all instructor
        int sumOfYearsOfExperience = Instructors.getAll().stream().collect(Collectors.summingInt(Instructor::getYearsOfExperience));
        System.out.println("sumOfYearsOfExperience :"+sumOfYearsOfExperience);

        //sum of year of experience of all instructor
        double avgOfYearsOfExperience = Instructors.getAll().stream().collect(Collectors.averagingInt(Instructor::getYearsOfExperience));
        System.out.println("avgOfYearsOfExperience :"+avgOfYearsOfExperience);
    }
}
