package com.skptech.groupingminmaxavg;

import com.skptech.Instructor;
import com.skptech.Instructors;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingMinMaxAvgExample {

    public static void main(String[] args) {
        //grouping the instructors in two sets of online course vs not online
        Map<Boolean, List<Instructor>> listMap = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(
                        Instructor::isOnlineCourses, Collectors.toList())
                );
        listMap.forEach((key, value) ->
                System.out.println("Key = " + key + " Value = " + value));
        System.out.println("-----------------------------------------------------");

        //and get the max years of experience of the instructors
        Map<Boolean, Optional<Instructor>> maxOptionalInstructor = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(
                            Instructor::isOnlineCourses,
                            Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience))
                        )
                );
        maxOptionalInstructor.forEach((key, value) ->
                System.out.println("Key = " + key + " Value = " + value));
        System.out.println("-----------------------------------------------------");

        //collectingAndThen
        Map<Boolean, Instructor> maxInstructor = Instructors.getAll().stream()
                .collect(
                        Collectors.groupingBy(
                                Instructor::isOnlineCourses,
                                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience)), Optional::get)
                        )
                );
        maxInstructor.forEach((key, value) ->
                System.out.println("key = " + key + " value = " + value));
        System.out.println("-----------------------------------------------------");

        //average years of experience of instructors who teaches online or not
        Map<Boolean, Double> avgInstructorExp = Instructors.getAll().stream()
                .collect(
                        Collectors.groupingBy(
                                Instructor::isOnlineCourses,
                                Collectors.averagingInt(Instructor::getYearsOfExperience)
                        )
                );
        avgInstructorExp.forEach((key, value) ->
                System.out.println("key = " + key + " value = " + value));
        System.out.println("-----------------------------------------------------");

        //drive a statistical summary from properties of grouped items
        Map<Boolean, IntSummaryStatistics> intSummaryInstructor = Instructors.getAll().stream()
                .collect(
                        Collectors.groupingBy(
                                Instructor::isOnlineCourses,
                                Collectors.summarizingInt(Instructor::getYearsOfExperience)
                        )
                );
        intSummaryInstructor.forEach((key, value) ->
                System.out.println("key = " + key + " value = " + value));
        System.out.println("-----------------------------------------------------");
    }
}
