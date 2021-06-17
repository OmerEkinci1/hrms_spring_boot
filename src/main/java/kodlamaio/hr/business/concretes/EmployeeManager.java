package kodlamaio.hr.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hr.business.abstracts.EmployeeService;
import kodlamaio.hr.dataAccess.abstracts.EmployeeDao;

@Service
public class EmployeeManager implements EmployeeService {
	
	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}
}
