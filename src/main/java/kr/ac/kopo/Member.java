package kr.ac.kopo;

public class Member {
	private String id;
	private String passwd;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public boolean login() {
		if(id.equals("user") && passwd.equals("1234"))
				return true;
		else if(id.equals("admin") && passwd.equals("5678"))
			return true;
		return false;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", passwd=" + passwd + "]";
	}
	
	
}
