package bidirection;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class FollowingBi {
	@Id
	private String profile_name;
	private String Commends;
	private int post;
	@ManyToMany
	List<FollowersBi> followersBi;
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
	public List<FollowersBi> getFollowersBi() {
		return followersBi;
	}
	public void setFollowersBi(List<FollowersBi> followersBi) {
		this.followersBi = followersBi;
	}
	
	
}
