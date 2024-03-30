package com.employee.center.Departments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentsController {

    @Autowired
    private DepartmentsService departmentsService;
    
    @GetMapping
    public List<Departments> getAllDepartments(){
        return departmentsService.getAllDepartments();
    }
    @GetMapping("/department/{department_id}")
    public Departments getDepartmentsById(@PathVariable Long department_id){
        return departmentsService.getDepartmentsbyId(department_id);
    }

    @PostMapping
    public void saveDepartments(@RequestBody Departments departments){
        departmentsService.saveDepartments(departments);
    }

    @DeleteMapping("/department/{department_id}")
    public void deleteDepartments(@PathVariable long department_id){
        departmentsService.deleteDepartments(department_id);
    }
}
