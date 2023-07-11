package unidirection;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contacts {
@Id
private String email_Id;
private String Name;
private long Phone;
private String Nickname;
public String getEmail_Id() {
	return email_Id;
}
public void setEmail_Id(String email_Id) {
	this.email_Id = email_Id;
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
public String getNickname() {
	return Nickname;
}
public void setNickname(String nickname) {
	Nickname = nickname;
}



}
