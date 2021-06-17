package kodlamaio.hr.business.abstracts;

import java.util.List;

import kodlamaio.hr.core.utilities.results.DataResult;
import kodlamaio.hr.entities.concretes.JobPosition;

public interface JobPositionService {
	DataResult<List<JobPosition>> getAll();
}
