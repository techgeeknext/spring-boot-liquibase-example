package com.techgeeknext.services;

import com.techgeeknext.entities.Employee;

import java.util.stream.Stream;

public interface EmployeeService {
    Stream<Employee> getAllEmployees();
}
