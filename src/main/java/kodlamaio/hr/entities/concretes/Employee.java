package kodlamaio.hr.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employees")
public class Employee {
	
	@Id
	@GeneratedValue
	@Column(name="EmployeeID")
	private int EmployeeID;
	
	@Column(name="CompanyName")
	private String CompanyName;
	
	@Column(name="Website")
	private String Website;
	
	@Column(name="WebsiteDomainEmail")
	private String WebsiteDomainEmail;
	
	@Column(name="Phone")
	private String Phone;
	
	@Column(name="Password")
	private String Password;
	
	@Column(name="Password2")
	private String Password2;
	
	public Employee() {
		super();
	}
	
	public Employee(int employeeID, String companyName, String website, String websiteDomainEmail,
			String phone, String password, String password2) {
		super();
		EmployeeID = employeeID;
		CompanyName = companyName;
		Website = website;
		WebsiteDomainEmail = websiteDomainEmail;
		Phone = phone;
		Password = password;
		Password2 = password2;
	}
	public int getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getWebsite() {
		return Website;
	}
	public void setWebsite(String website) {
		Website = website;
	}
	public String getWebsiteDomainEmail() {
		return WebsiteDomainEmail;
	}
	public void setWebsiteDomainEmail(String websiteDomainEmail) {
		WebsiteDomainEmail = websiteDomainEmail;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
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
