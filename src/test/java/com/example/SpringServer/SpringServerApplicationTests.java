package com.example.SpringServer;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.SpringServer.model.employee.Employee;
import com.example.SpringServer.model.employee.EmployeeDao;

@SpringBootTest
class SpringServerApplicationTests {
	@Autowired
	private EmployeeDao employeeDao;

	@Test
	void addEmployeeTest() {
		Employee employee = new Employee();
		employee.setName("Demilade");
		employee.setBranch("Frontend");
		employee.setLocation("Building 5");

		employeeDao.save(employee);
	}

	// @Test
	void getAllEmployees() {
		List<Employee> employees = employeeDao.getAllEmployees();

		employees.forEach(employee -> {
			System.out.println(employee.getName());
		});
	}

	// @Test
	void getAllEmployeesAndDeleteThem() {
		List<Employee> employees = employeeDao.getAllEmployees();

		for (Employee employee : employees) {
			employeeDao.delete(employee);
		}
	}

}
