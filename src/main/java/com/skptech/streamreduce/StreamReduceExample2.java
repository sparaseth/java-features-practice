package com.skptech.streamreduce;

import com.skptech.Instructor;
import com.skptech.Instructors;

import java.util.Optional;

public class StreamReduceExample2 {

    public static void main(String[] args) {
        Optional<Instructor> optionalInstructor = Instructors.getAll().stream()
                .reduce((s1, s2) -> s2.getYearsOfExperience() > s1.getYearsOfExperience() ? s2 : s1);
        if (optionalInstructor.isPresent())
            System.out.println(optionalInstructor.get());
    }

}
