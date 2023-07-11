package unidirection;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
@Id
private int dep_id;
private String dep_name;
private String Email;

public int getDep_id() {
	return dep_id;
}
public void setDep_id(int dep_id) {
	this.dep_id = dep_id;
}
public String getdep_Name() {
	return dep_name;
}
public void setdep_Name(String dep_name) {
	this.dep_name = dep_name;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}


}
