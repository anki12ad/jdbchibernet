package bidirection;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Whatsapp1 {
@Id
private long phone;
private String name;
private String Email_Id;
@OneToMany
List<Contacts1>contacts1s;
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail_Id() {
	return Email_Id;
}
public void setEmail_Id(String email_Id) {
	Email_Id = email_Id;
}
public List<Contacts1> getContacts1s() {
	return contacts1s;
}
public void setContacts1s(List<Contacts1> contacts1s) {
	this.contacts1s = contacts1s;
} 
}
