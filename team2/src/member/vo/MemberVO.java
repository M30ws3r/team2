package member.vo;

import lombok.Data;

//VO(Value Object)
// getter, setter Source 통해서 만들어줄 수 있지만은 그냥 Annotation 붙여주자... @Data 하나면 된다.
public class MemberVO {

	private String userid;
	private String userpass;
	private String username;

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
		return "MemberVO [userid=" + userid + ", userpass=" + userpass + ", username=" + username + "]";
	}
}