package io.borlandfcsd.template.service.impl;

import io.borlandfcsd.template.entity.Company;
import io.borlandfcsd.template.repository.CompanyRepository;
import io.borlandfcsd.template.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {
    private CompanyRepository companyRepository;

    @Autowired
    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public Company save(Company company) {
        return companyRepository.save(company);
    }
}
