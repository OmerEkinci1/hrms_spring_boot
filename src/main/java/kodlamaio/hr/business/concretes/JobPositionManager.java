package kodlamaio.hr.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hr.business.abstracts.JobPositionService;
import kodlamaio.hr.core.utilities.results.DataResult;
import kodlamaio.hr.core.utilities.results.SuccessDataResult;
import kodlamaio.hr.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hr.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {
	
	private JobPositionDao jobPositionDao;

	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(), "Job added") ;
	}
}
