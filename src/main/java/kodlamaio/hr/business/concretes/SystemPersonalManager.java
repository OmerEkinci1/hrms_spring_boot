package kodlamaio.hr.business.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hr.business.abstracts.SystemPersonalService;
import kodlamaio.hr.dataAccess.abstracts.SystemPersonalDao;

@Service
public class SystemPersonalManager implements SystemPersonalService {
	
	private SystemPersonalDao systemPersonalDao;

	public SystemPersonalManager(SystemPersonalDao systemPersonalDao) {
		super();
		this.systemPersonalDao = systemPersonalDao;
	}
}
