package com.skptech.groupingminmaxavg;

import com.skptech.model.Department;
import com.skptech.model.Employee;
import com.skptech.utils.EmployeeUtil;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindTopSalaryEmployee {

    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtil.getAll();

        Map<String, List<Employee>> departmentListMap = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getDepartment(), Collectors.toList()));


        Optional<Employee> maxSalaryEmployee = employees.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));

        Map<String, Employee> topDeptEmployee = employees.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment(),
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)), Optional::get)));

        topDeptEmployee.forEach((k, v)->{
            System.out.println("Key :"+k+ " Value :"+v);
        });

    }
}
