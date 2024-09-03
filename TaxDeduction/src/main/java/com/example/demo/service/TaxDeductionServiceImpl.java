package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public class TaxDeductionServiceImpl implements TaxDeductionService {

    @Override
    public Employee calculateTaxDeductions(String employeeId) {
        double yearlySalary = 600000;
        double taxAmount = calculateTax(yearlySalary);
        double cessAmount = calculateCess(yearlySalary);

        Employee employee = new Employee();
        employee.setEmployeeId(employeeId);
        employee.setFirstName("John");
        employee.setLastName("Doe");
        employee.setYearlySalary(yearlySalary);
        employee.setTaxAmount(taxAmount);
        employee.setCessAmount(cessAmount);

        return employee;
    }

    private double calculateTax(double salary) {
        double tax = 0;
        if (salary > 250000) {
            if (salary <= 500000) {
                tax = (salary - 250000) * 0.05;
            } else if (salary <= 1000000) {
                tax = 250000 * 0.05 + (salary - 500000) * 0.10;
            } else {
                tax = 250000 * 0.05 + 500000 * 0.10 + (salary - 1000000) * 0.20;
            }
        }
        return tax;
    }

    private double calculateCess(double salary) {
        if (salary > 2500000) {
            return (salary - 2500000) * 0.02;
        }
        return 0;
    }
}

