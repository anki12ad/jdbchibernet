package bidirection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class User {
@Id
private int id;
private String name;
private long phone;
@ManyToOne
Facebook facebook;
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
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public Facebook getFacebook() {
	return facebook;
}
public void setFacebook(Facebook facebook) {
	this.facebook = facebook;
}
}
