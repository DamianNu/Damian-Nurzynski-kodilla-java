package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyFacade {
    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    public CompanyFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> searchCompany(String partText) {
        String text = "%" + partText + "%";
        return companyDao.searchByPartName(text);
    }

    public List<Employee> searchEmployee(String partText) {
        String text = "%" + partText + "%";
        return employeeDao.searchByPartLastname(text);
    }
}
