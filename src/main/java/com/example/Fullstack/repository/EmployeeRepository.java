package com.example.Fullstack.repository;

import com.example.Fullstack.entity.EmployeeEntity;
import com.example.Fullstack.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
}
