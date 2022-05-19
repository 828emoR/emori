package middle.vo;

public class UserVO1 {
	private String Uid;
	private String Upw;
	private String Uname;
	private String Utel;
	private String Uemail;
	private String Uaddress;
	
	public UserVO1() {
		
	}
	
	public UserVO1(String uid, String upw, String uname, String utel, String uemail, String uaddress) {
		super();
		Uid = uid;
		Upw = upw;
		Uname = uname;
		Utel = utel;
		Uemail = uemail;
		Uaddress = uaddress;
	}
	public String getUid() {
		return Uid;
	}
	public void setUid(String uid) {
		Uid = uid;
	}
	public String getUpw() {
		return Upw;
	}
	public void setUpw(String upw) {
		Upw = upw;
	}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public String getUtel() {
		return Utel;
	}
	public void setUtel(String utel) {
		Utel = utel;
	}
	public String getUemail() {
		return Uemail;
	}
	public void setUemail(String uemail) {
		Uemail = uemail;
	}
	public String getUaddress() {
		return Uaddress;
	}
	public void setUadress(String uadress) {
		Uaddress = uadress;
	}
	@Override
	public String toString() {
		return "UserVO [Uid=" + Uid + ", Upw=" + Upw + ", Uname=" + Uname + ", Utel=" + Utel + ", Uemail=" + Uemail
				+ ", Uadress=" + Uaddress + "]";
	}
	
}
