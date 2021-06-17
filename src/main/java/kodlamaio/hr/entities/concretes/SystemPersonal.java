package kodlamaio.hr.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SystemPersonals")
public class SystemPersonal {

	@Id
	@GeneratedValue
	@Column(name="ID")
	private int SystemPersonalID;
	
	@Column(name="Name")
	private String Name;
	
	@Column(name="Surname")
	private String Surname;
	
	@Column(name="Email")
	private int Email;
	
	@Column(name="Password")
	private int Password;
	
	@Column(name="Password2")
	private int Password2;

	public SystemPersonal() {
		super();
	}

	public SystemPersonal(int systemPersonalID, String name, String surname, int email, int password, int password2) {
		super();
		SystemPersonalID = systemPersonalID;
		Name = name;
		Surname = surname;
		Email = email;
		Password = password;
		Password2 = password2;
	}

	public int getSystemPersonalID() {
		return SystemPersonalID;
	}

	public void setSystemPersonalID(int systemPersonalID) {
		SystemPersonalID = systemPersonalID;
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

	public int getEmail() {
		return Email;
	}

	public void setEmail(int email) {
		Email = email;
	}

	public int getPassword() {
		return Password;
	}

	public void setPassword(int password) {
		Password = password;
	}

	public int getPassword2() {
		return Password2;
	}

	public void setPassword2(int password2) {
		Password2 = password2;
	}
	
}
