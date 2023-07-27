package com.employee.demo.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.demo.model.Employee;
import com.employee.demo.service.EmployeeService;
import com.employee.demo.web.dto.EmployeeDto;


@CrossOrigin(origins = {"http://localhost:4200", "*"})
@RestController
@RequestMapping("/employee/")
public class EmployeeRestController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("list")
	public List<Employee> getAllEmployee(){
		
		return employeeService.findAllEmployee();	
	}
	
	@PostMapping("save")
	public Employee createEmployee(@RequestBody EmployeeDto dto) {
		return employeeService.save(dto);
	}

	@GetMapping("findById/{id}")
	public Optional<Employee> findById(@PathVariable Integer id) {
		return employeeService.findById(id);
	}

	@PostMapping("update")
	public boolean updateEmployee(@RequestBody Employee dto) {
		boolean b=employeeService.updateEmployee(dto);
		return b;
		
	}
	
	@GetMapping("delete/{id}")
	public boolean deleteEmployee(@PathVariable Integer id) {
		return employeeService.deleteEmployee(id);
	}
}
