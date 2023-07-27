package com.employee.demo.service;

import java.util.List;
import java.util.Optional;

import com.employee.demo.model.Employee;
import com.employee.demo.web.dto.EmployeeDto;

public interface EmployeeService {
	
	public List<Employee> findAllEmployee();

	public Employee save(EmployeeDto dto);

	public Optional<Employee> findById(Integer id);

	public boolean updateEmployee(Employee dto);

	public Boolean deleteEmployee(Integer id);

}
