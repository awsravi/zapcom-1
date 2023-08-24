package com.zapcom;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EployeeTest {
	public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = Arrays.asList(
            new Employee("John", 50000.0),
            new Employee("Alice", 60000.0),
            new Employee("Bob", 50000.0),
            new Employee("Eve", 70000.0)
        );

        // Group employees by salary and count the number of employees in each group
        Map<Double, Long> salaryCountMap = employees.stream()
            .collect(Collectors.groupingBy(Employee::getSalary, Collectors.counting()));

        // Print the count of employees for each salary
        salaryCountMap.forEach((salary, count) -> {
            System.out.println("Salary: " + salary + ", Employees: " + count);
        });
    }
}
