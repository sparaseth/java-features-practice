package com.skptech.streamfindanyandfirst;

import com.skptech.Instructor;
import com.skptech.Instructors;

import java.util.Optional;

public class StreamFindAnyAndFirstExample {

    public static void main(String[] args) {
        Optional<Instructor> instructorOptional1 = Instructors.getAll().stream().findAny();
        if (instructorOptional1.isPresent())
            System.out.println(instructorOptional1.get());

        Optional<Instructor> instructorOptional2 = Instructors.getAll().stream().findFirst();
        if (instructorOptional2.isPresent())
            System.out.println(instructorOptional2.get());
    }

}
