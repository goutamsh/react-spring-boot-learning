package com.gshepur.reactspringbootlearning.dao;

import com.gshepur.reactspringbootlearning.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}