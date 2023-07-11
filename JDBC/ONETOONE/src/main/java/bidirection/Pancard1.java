package bidirection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import bidirection.Person1;
@Entity
public class Pancard1 {
	@Id
	private int id;
	private String name;
	private Long phone;
	@OneToOne
	Person1 person1;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public Person1 getPerson1() {
		return person1;
	}
	public void setPerson1(Person1 person1) {
		this.person1 = person1;
	}
}
