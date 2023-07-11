package bidirection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Contacts1 {
@Id
private String Email_Id;
private String Name;
private long Phone;
@ManyToOne
Whatsapp1 whatsapp1;
public String getEmail_Id() {
	return Email_Id;
}
public void setEmail_Id(String email_Id) {
	Email_Id = email_Id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public long getPhone() {
	return Phone;
}
public void setPhone(long phone) {
	Phone = phone;
}
public Whatsapp1 getWhatsapp1() {
	return whatsapp1;
}
public void setWhatsapp1(Whatsapp1 whatsapp1) {
	this.whatsapp1 = whatsapp1;
}


}
