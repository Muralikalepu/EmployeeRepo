package com.example.demo.service;

import com.example.demo.model.Employee;

public interface TaxDeductionService {
    Employee calculateTaxDeductions(String employeeId);
}
