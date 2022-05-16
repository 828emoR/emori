package co.project.vo;

public class UserInfoVO {
	
	
	private String id;
	private String pw;
	private String name;
	private String tel;
	private String email;
	private String address;
	
	
	
	
	
	@Override
	public String toString() {
		return "UserInfoVO [아이디: =" + id + ", 비밀번호: =" + pw + ", 닉네임: =" + name + ", 전화번호: =" + tel + ", 이메일: =" + email
				+ ", 주소: =" + address + "]";
		
	}
	public UserInfoVO(String id, String pw, String name, String tel, String email, String address) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.address = address;
		
		
	}
	public UserInfoVO() {

	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}



}
