package com.techgeeknext.services;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.List;
import java.util.stream.Collectors;

import com.techgeeknext.entities.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceTest {

  @Autowired
  private EmployeeService employeeService;

  @Test
  public void getEmployeeDataFromDatabase() throws Exception {
    List<Employee> employees = employeeService.getAllEmployees().collect(Collectors.toList());
    assertFalse(employees.isEmpty());
    assertEquals(5, employees.size());

    employees.forEach(System.out::println);
  }
}