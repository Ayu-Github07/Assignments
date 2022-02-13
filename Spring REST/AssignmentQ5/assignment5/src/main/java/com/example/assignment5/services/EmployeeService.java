package com.example.assignment5.services;

import java.util.List;

import com.example.assignment5.dao.EmployeeRepo;
import com.example.assignment5.entities.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public void setEmployee(Employee employee) {
        employeeRepo.save(employee);
        System.out.println("Employee added successfully");
    }

    public void setAllEmployee(List<Employee> employees) {
        employeeRepo.saveAll(employees);
        System.out.println("Added all the employees");
    }

    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee findEmployeeById(int id) {
        return employeeRepo.findById(id);
    }

    public void updateEmployee(Employee e, int id) {

        Employee employee = employeeRepo.findById(id);

        employee.setName(e.getName());
        employee.setDepartment(e.getDepartment());
        employee.setDesignation(e.getDesignation());
        employee.setSalary(e.getSalary());

        employeeRepo.save(employee);
        System.out.println("Employee Updated Successfully");
    }

    public void deleteEmployee(int id) {
        employeeRepo.deleteById(id);
        System.out.println("Employee Deleted Successfully");
    }
}
