package com.techgeeknext.services;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import com.techgeeknext.entities.Company;

import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyServiceTest {

  @Autowired
  private CompnayService compnayService;

  @Test
  public void getCompanyDataFromDatabase() throws Exception {
    List<Company> companies = compnayService.getCompanies().collect(Collectors.toList());
    assertFalse(companies.isEmpty());
    assertEquals(1, companies.size());

  }
}