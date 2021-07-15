package com.techgeeknext.services;

import com.techgeeknext.entities.Company;
import com.techgeeknext.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Component
public class CompanyServiceImpl implements CompnayService {

    private CompanyRepository companyRepository;

    @Autowired
    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public Stream<Company> getCompanies() {
        return StreamSupport.stream(companyRepository.findAll().spliterator(), true);
    }
}
