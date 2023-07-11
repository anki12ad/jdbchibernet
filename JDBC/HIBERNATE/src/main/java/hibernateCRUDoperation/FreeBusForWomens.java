package hibernateCRUDoperation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FreeBusForWomens {
	@Id
private int ticket;
@Column(nullable=false,unique=true)
private String name;
@Column(nullable=false,unique=true)
private long phone;

public int getTicket() {
	return ticket;
}
public void setTicket(int ticket) {
	this.ticket = ticket;
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
}
