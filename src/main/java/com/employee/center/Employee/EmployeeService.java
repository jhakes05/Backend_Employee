package com.employee.center.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired

    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @SuppressWarnings("null")
    public Employee getEmployeeById(Long Employee_id) {
        return employeeRepository.findById(Employee_id).orElse(null);
    }

    @SuppressWarnings("null")
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
    
    @SuppressWarnings("null")
    public void deleteEmployee(Long Employee_id) {
        employeeRepository.deleteById(Employee_id);
    }
}
