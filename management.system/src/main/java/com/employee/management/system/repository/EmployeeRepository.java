package com.employee.management.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.management.system.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}


