package kodlamaio.hr.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="Employees")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	
	//lombok kullandığımız için constructor kullanmıyoruz.
	
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

}
