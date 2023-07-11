package bidirection;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Facebook {
@Id
private String version;
private String server_name;
private long app_id;
@OneToMany
List<User> user;
public String getVersion() {
	return version;
}
public void setVersion(String version) {
	this.version = version;
}
public String getServer_name() {
	return server_name;
}
public void setServer_name(String server_name) {
	this.server_name = server_name;
}
public long getApp_id() {
	return app_id;
}
public void setApp_id(long app_id) {
	this.app_id = app_id;
}
public List<User> getUser() {
	return user;
}
public void setUser(List<User> user) {
	this.user = user;
}


}
