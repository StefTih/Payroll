package com.example.payroll;

import org.springframework.data.jpa.repository.JpaRepository;


//  Spring makes accessing data easy. By simply declaring the following EmployeeRepository interface we automatically will be able to
//
//        Create new Employees
//
//        Update existing ones
//
//        Delete Employees
//
//        Find Employees (one, all, or search by simple or complex properties)

//  Inside JpaRepository we specify the domain type and the id type
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
