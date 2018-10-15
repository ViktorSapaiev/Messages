package io.borlandfcsd.template.service.impl;

import io.borlandfcsd.template.entity.Company;
import io.borlandfcsd.template.repository.CompanyRepository;
import io.borlandfcsd.template.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public Company findById(int id) {
        return companyRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("couldn't found id:" + id));
    }

    @Override
    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    @Override
    public Company findByName(String name) {
        return companyRepository.findCompanyByName(name);
    }
}
