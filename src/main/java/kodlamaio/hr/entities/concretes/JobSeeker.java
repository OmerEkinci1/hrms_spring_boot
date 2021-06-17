package kodlamaio.hr.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="JobSeekers")
public class JobSeeker {
	
	@Id
	@GeneratedValue
	@Column(name="JobSeekersID")
	private int JobSeekersID;
	
	@Column(name="Name")
	private String Name;
	
	@Column(name="Surname")
	private String Surname;
	
	@Column(name="NationalityNumber")
	private String NationalityNumber;
	
	@Column(name="BirthDate")
	private LocalDate BirthDate; 
	
	@Column(name="Email")
	private String Email;
	
	@Column(name="Password")
	private String Password;
	
	@Column(name="Password2")
	private String Password2;
		
	public JobSeeker() {
		super();
	}
	public JobSeeker(int jobSeekersID, String name, String surname, String nationalityNumber, LocalDate birthDate,
			String email, String password, String password2) {
		super();
		JobSeekersID = jobSeekersID;
		Name = name;
		Surname = surname;
		NationalityNumber = nationalityNumber;
		BirthDate = birthDate;
		Email = email;
		Password = password;
		Password2 = password2;
	}
	public int getJobSeekersID() {
		return JobSeekersID;
	}
	public void setJobSeekersID(int jobSeekersID) {
		JobSeekersID = jobSeekersID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getNationalityNumber() {
		return NationalityNumber;
	}
	public void setNationalityNumber(String nationalityNumber) {
		NationalityNumber = nationalityNumber;
	}
	public LocalDate getBirthDate() {
		return BirthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		BirthDate = birthDate;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getPassword2() {
		return Password2;
	}
	public void setPassword2(String password2) {
		Password2 = password2;
	}
}
