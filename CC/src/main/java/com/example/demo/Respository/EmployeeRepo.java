package com.example.demo.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.*;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}