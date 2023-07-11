package bidirection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Person1 {
	@Id
	private String email_Id;
	private String name;
	private Long aadhar_Id;
	@OneToOne
	Pancard1 pancard1;
	public String getEmail_Id() {
		return email_Id;
	}
	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAadhar_Id() {
		return aadhar_Id;
	}
	public void setAadhar_Id(Long aadhar_Id) {
		this.aadhar_Id = aadhar_Id;
	}
	public Pancard1 getPancard1() {
		return pancard1;
	}
	public void setPancard1(Pancard1 pancard1) {
		this.pancard1 = pancard1;
	}
	
	
}
