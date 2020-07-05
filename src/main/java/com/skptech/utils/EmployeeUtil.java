package com.skptech.utils;

import com.skptech.model.Employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeUtil {

    public static List<Employee> getAll() {
        Employee employee1 = new Employee(1L, "Name1", 1000L, "DEP1");
        Employee employee2 = new Employee(2L, "Name2", 1500L, "DEP1");
        Employee employee3 = new Employee(3L, "Name3", 1300L, "DEP1");
        Employee employee4 = new Employee(4L, "Name4", 3400L, "DEP2");
        Employee employee5 = new Employee(5L, "Name5", 4500L, "DEP2");
        Employee employee6 = new Employee(6L, "Name6", 1700L, "DEP3");
        return Arrays.asList(employee1, employee2, employee2, employee3, employee4, employee5, employee6);
    }
}
