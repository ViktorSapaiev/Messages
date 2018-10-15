package io.borlandfcsd.template.repository;

import io.borlandfcsd.template.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Integer> {
    Company findCompanyByName(String name);
}
