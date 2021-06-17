package kodlamaio.hr.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hr.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	// crud operasyonları hazır jpa dan geliyor.
}
