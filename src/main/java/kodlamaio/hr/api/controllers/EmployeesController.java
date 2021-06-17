package kodlamaio.hr.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlamaio.hr.business.abstracts.EmployeeService;
import kodlamaio.hr.core.utilities.results.Result;
import kodlamaio.hr.entities.concretes.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {
	
	private EmployeeService employeeService;

	public EmployeesController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employee employee) {
		// add operasyonunda obje gönderdiğimiz için reactten gelen bodyi karşılamak için requestbody yazdık.
		return this.employeeService.add(employee);
	}
}
