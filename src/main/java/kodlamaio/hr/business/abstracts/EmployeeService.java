package kodlamaio.hr.business.abstracts;

import kodlamaio.hr.core.utilities.results.Result;
import kodlamaio.hr.entities.concretes.Employee;

public interface EmployeeService {
	Result add(Employee employee);
}
