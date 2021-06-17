package kodlamaio.hr.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hr.entities.concretes.SystemPersonal;

public interface SystemPersonalDao extends JpaRepository<SystemPersonal, Integer> {

}
