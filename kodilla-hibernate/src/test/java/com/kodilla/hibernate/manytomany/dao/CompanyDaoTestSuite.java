package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@Transactional
@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    void  testMethodsNamedQueryCompanyAndEmployee(){
        //Given
        Employee janeDoe = new Employee("Jane", "Doe");
        Employee peterBrown = new Employee("Peter", "Brown");
        Employee davidWilliams = new Employee("David", "Williams");

        Company softwareRainbow = new Company("Software Rainbow");
        Company dataTalisman = new Company("Data Talisman");
        Company xylophone = new Company("Xylophone");


        //When
        employeeDao.save(janeDoe);
        int janeDoeId = janeDoe.getId();
        employeeDao.save(peterBrown);
        int peterBrownId = peterBrown.getId();
        employeeDao.save(davidWilliams);
        int davidWilliamsId = davidWilliams.getId();

        companyDao.save(softwareRainbow);
        int softwareRainbowId = softwareRainbow.getId();
        companyDao.save(dataTalisman);
        int dataTalismanId = dataTalisman.getId();
        companyDao.save(xylophone);
        int xylophoneId = xylophone.getId();

        List<Employee> employees = employeeDao.searchBySurname("Doe");
        List<Company> companies = companyDao.searchForACompanyBy3Letters();

        //Then
        assertEquals(1,employees.size());
        assertEquals("Jane",employees.get(0).getFirstname());
        assertEquals(1,companies.size());
        assertEquals("Xylophone",companies.get(0).getName());


        //CleanUp
        try {
            companyDao.deleteById(softwareRainbowId);
            companyDao.deleteById(dataTalismanId);
            companyDao.deleteById(xylophoneId);
            employeeDao.deleteById(janeDoeId);
            employeeDao.deleteById(peterBrownId);
            employeeDao.deleteById(davidWilliamsId);
        } catch (Exception e) {
            //do nothing
        }
    }
}