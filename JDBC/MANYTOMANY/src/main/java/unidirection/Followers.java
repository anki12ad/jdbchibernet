package unidirection;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Followers {
private String Name;
@Id
private String profile_name;
private int post;
private String Highlights;

@ManyToMany
List<Following> following;

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public String getProfile_name() {
	return profile_name;
}

public void setProfile_name(String profile_name) {
	this.profile_name = profile_name;
}

public int getPost() {
	return post;
}

public void setPost(int post) {
	this.post = post;
}

public String getHighlights() {
	return Highlights;
}

public void setHighlights(String highlights) {
	Highlights = highlights;
}

public List<Following> getFollowing() {
	return following;
}

public void setFollowing(List<Following> following) {
	this.following = following;
}

}
