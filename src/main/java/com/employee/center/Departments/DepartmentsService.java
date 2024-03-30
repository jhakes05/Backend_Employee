package com.employee.center.Departments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentsService {
    @Autowired
    private DepartmentsRepository departmentsRepository;

    public List<Departments> getAllDepartments() {
        return departmentsRepository.findAll();
    }

    @SuppressWarnings("null")
    public Departments getDepartmentsbyId(Long department_id) {
        return departmentsRepository.findById(department_id).orElse(null);
    }

    @SuppressWarnings("null")
    public void saveDepartments(Departments departments) {
        departmentsRepository.save(departments);
    }

    @SuppressWarnings("null")
    public void deleteDepartments(Long department_id) {
        departmentsRepository.deleteById(department_id);
    }

}
