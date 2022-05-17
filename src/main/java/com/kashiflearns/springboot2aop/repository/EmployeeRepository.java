package com.kashiflearns.springboot2aop.repository;

import com.kashiflearns.springboot2aop.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
