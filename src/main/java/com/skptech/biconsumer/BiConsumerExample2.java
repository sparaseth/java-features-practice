package com.skptech.biconsumer;

import com.skptech.Instructor;
import com.skptech.Instructors;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {

    public static void main(String[] args) {

        List<Instructor> instructors = Instructors.getAll();

        //Print out the name and gender of instructors
        BiConsumer<String, String> biConsumer1 = (name, gender) -> System.out.println("Name :" + name + " Gender :" + gender);
        instructors.forEach(instructor -> biConsumer1.accept(instructor.getName(), instructor.getGender()));

        System.out.println("------------------------------------------------");

        //Print out the name and list of courses
        BiConsumer<String, List<String>> biConsumer2 = (name, courses) -> System.out.println("Name :" + name + " Courses" + courses);
        instructors.forEach(instructor -> biConsumer2.accept(instructor.getName(), instructor.getCourses()));

        System.out.println("------------------------------------------------");

        //Print out name and gender of all instructor who teaches online courses
        instructors.forEach(instructor -> {
            if (instructor.isOnlineCourses()) {
                biConsumer1.accept(instructor.getName(), instructor.getGender());
            }
        });
    }
}
