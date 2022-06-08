package in.ster.model;

public class User {

	//give name of attributes same as name given in jsp form
	private String uid;
	private String pwd;

	public String getUid() {
		return uid;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", pwd=" + pwd + "]";
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
