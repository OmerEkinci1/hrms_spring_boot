package kodlamaio.hr.business.abstracts;

import java.util.List;

import kodlamaio.hr.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
}
