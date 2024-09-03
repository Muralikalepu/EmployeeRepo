package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.TaxDeductionService;

@RestController
@RequestMapping("/api/employees")
public class TaxDeductionController {

    @Autowired
    private TaxDeductionService taxDeductionService;

    @GetMapping("/{employeeId}/tax-deductions")
    public Employee getTaxDeductions(@PathVariable String employeeId) {
        return taxDeductionService.calculateTaxDeductions(employeeId);
    }
}
