package com.skptech.consumer;

import com.skptech.Instructor;
import com.skptech.Instructors;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {

    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        //looping through all the instructor and printing out the values of instructor
        Consumer<Instructor> instructorConsumer1 = (instructor -> System.out.println(instructor));
        instructors.forEach(instructorConsumer1);

        System.out.println("-------------------------------------------------------------");
        //Loop through all the instructor and only print out their name
        Consumer<Instructor> instructorConsumer2 = (instructor -> System.out.println(instructor.getName()));
        instructors.forEach(instructorConsumer2);

        System.out.println("-------------------------------------------------------------");
        //Loop through all the instructors and print out their names and their courses
        Consumer<Instructor> instructorConsumer3 = (instructor -> System.out.println(instructor.getCourses()));
        instructors.forEach(instructorConsumer2.andThen(instructorConsumer3));

        //Loop through all the instructors and print out their name if the years of experience is >10
        instructors.forEach(instructor -> {
            if (instructor.getYearsOfExperience() > 10) {
                instructorConsumer2.accept(instructor);
            }
        });

        System.out.println("-------------------------------------------------------------");
        //Loop through all the instructors and print out their name and years of experience if years
        //of experience is >5 and teaches course online
        Consumer<Instructor> instructorConsumer4 = (instructor -> System.out.println(instructor.getYearsOfExperience()));
        instructors.forEach(instructor -> {
            if (instructor.getYearsOfExperience() > 5 && instructor.isOnlineCourses()) {
                instructorConsumer2.andThen(instructorConsumer4).accept(instructor);
            }
        });
    }

}
