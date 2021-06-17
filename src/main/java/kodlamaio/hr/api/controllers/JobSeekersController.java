package kodlamaio.hr.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hr.business.abstracts.JobSeekerService;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekersController {

	private JobSeekerService jobSeekerService;

	public JobSeekersController(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
}
