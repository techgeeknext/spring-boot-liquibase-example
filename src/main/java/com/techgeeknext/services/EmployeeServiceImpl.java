package com.techgeeknext.services;

import com.techgeeknext.entities.Employee;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import com.techgeeknext.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeServiceImpl implements EmployeeService {

  private EmployeeRepository employeesRepository;

  @Autowired
  public EmployeeServiceImpl(EmployeeRepository employeesRepository) {
    this.employeesRepository = employeesRepository;
  }

  @Override
  public Stream<Employee> getAllEmployees() {
    return StreamSupport.stream(employeesRepository.findAll().spliterator(), true);
  }
}
