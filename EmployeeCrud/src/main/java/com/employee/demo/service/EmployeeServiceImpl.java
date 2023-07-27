package com.employee.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.demo.Repository.EmployeeRepository;
import com.employee.demo.model.Employee;
import com.employee.demo.web.dto.EmployeeDto;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> findAllEmployee() {

		return employeeRepository.findAll();
	}

	@Override
	public Employee save(EmployeeDto dto) {
		Employee emp = new Employee();
		emp.setFirstName(dto.getFirstName());
		emp.setLastName(dto.getLastName());
		emp.setEmail(dto.getEmailId());

		employeeRepository.save(emp);

		return emp;
	}

	@Override
	public Optional<Employee> findById(Integer id) {
		return employeeRepository.findById(Long.valueOf(id));
	}

	@Override
	public boolean updateEmployee(Employee dto) {
		Optional<Employee> emp = employeeRepository.findById(Long.valueOf(dto.getId()));

		Employee e = emp.get();
		e.setEmail(dto.getEmail());
		e.setFirstName(dto.getFirstName());
		e.setLastName(dto.getLastName());

		employeeRepository.save(e);
		return true;
	}

	@Override
	public Boolean deleteEmployee(Integer id) {

		Optional<Employee> employee = employeeRepository.findById(Long.valueOf(id));
		if (employee != null) {

			// Employee emp=employeeRepository.deleteById(Long.valueOf(id));
			employeeRepository.deleteById(Long.valueOf(id));
			
			return true;
		}
		return false;
	}

}
