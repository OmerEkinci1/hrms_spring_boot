package kodlamaio.hr.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hr.business.abstracts.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {
	
	private EmployeeService employeeService;

	public EmployeesController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
}
