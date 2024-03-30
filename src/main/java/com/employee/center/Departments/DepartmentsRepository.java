package com.employee.center.Departments;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentsRepository extends JpaRepository<Departments, Long> {
    List<Departments> findAll();

    Optional<Departments> findById(Long department_id);

    @Query("SELECT DISTINCT d FROM Departments d JOIN d.employees e WHERE e.Employee_id = :Employee_id")
    List<Departments> findByEmployeesId(@Param("Employee_id") Long Employee_id);

}
