package io.borlandfcsd.template.service;

import io.borlandfcsd.template.entity.Company;

import java.util.List;

public interface CompanyService {
    Company save(Company company);
    Company findByName(String name);
    Company findById(int id);
    List<Company> findAll();
}
