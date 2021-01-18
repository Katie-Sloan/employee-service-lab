package com.example.EmployeeService;

import com.example.EmployeeService.models.Employee;
import com.example.EmployeeService.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeServiceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void	createEmployee(){
		Employee stuart = new Employee("Stuart", 25, 12, "stuart@hotmail.com");
		Employee katie = new Employee("Katie", 28, 5, "katie@hotmail.com");
		employeeRepository.save(stuart);
		employeeRepository.save(katie);
	}

}
