package com.skptech.streammapfilterreduce;

import com.skptech.Instructor;
import com.skptech.Instructors;

public class StreamMapFilterReduceExample {

    public static void main(String[] args) {
        int result = Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourses)
                .map(Instructor::getYearsOfExperience)
                .reduce(0, Integer::sum);
        System.out.println(result);
    }

}
