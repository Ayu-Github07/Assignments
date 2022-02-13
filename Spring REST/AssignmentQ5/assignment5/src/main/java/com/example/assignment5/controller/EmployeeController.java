package com.example.assignment5.controller;

import java.util.List;

import com.example.assignment5.entities.Employee;
import com.example.assignment5.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public String AddEmployee(@RequestBody Employee employee) {
        System.out.println(employee);
        employeeService.setEmployee(employee);
        return "Employee Added Successfully";
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmployees() {
        return employeeService.findAllEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable("id") int id) {
        return employeeService.findEmployeeById(id);
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployeeString(@PathVariable("id") int id) {
        employeeService.deleteEmployee(id);
        return "Employee Deleted Successfully";
    }

    @PutMapping("/employee/{id}")
    public String updateEmployee(@RequestBody Employee e, @PathVariable("id") int id) {

        employeeService.updateEmployee(e, id);
        return "Employee Updated Successfully";
    }
}
