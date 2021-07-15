package com.techgeeknext.services;

import com.techgeeknext.entities.Company;

import java.util.stream.Stream;

public interface CompnayService {
    Stream<Company> getCompanies();
}
