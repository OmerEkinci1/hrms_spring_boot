package kodlamaio.hr.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hr.business.abstracts.EmployeeService;
import kodlamaio.hr.core.utilities.results.Result;
import kodlamaio.hr.core.utilities.results.SuccessResult;
import kodlamaio.hr.dataAccess.abstracts.EmployeeDao;
import kodlamaio.hr.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {
	
	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public Result add(Employee employee) {
		this.employeeDao.save(employee);
		return new SuccessResult("Employee added");
	}
}
