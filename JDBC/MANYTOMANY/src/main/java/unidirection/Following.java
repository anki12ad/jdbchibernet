package unidirection;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Following {
@Id
private String profile_name;
private String Commends;
private int post;
public String getProfile_name() {
	return profile_name;
	
}
public void setProfile_name(String profile_name) {
	this.profile_name = profile_name;
}
public String getCommends() {
	return Commends;
}
public void setCommends(String commends) {
	Commends = commends;
}
public int getPost() {
	return post;
}
public void setPost(int post) {
	this.post = post;
}

}
