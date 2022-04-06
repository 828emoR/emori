package project1;

import java.io.Serializable;
import java.util.Date;

public class BoardMember implements Serializable {

	private int id;
	private String pw;
	private String name;
	private String gender;
	private String birth;
	private String email;
	private String tel;

	private int BoardNo;
	private String title;
	private String content;
	private Date regdate;
	private String reply;

	public BoardMember(int id, String pw, String name, String gender, String birth, String email, String tel) {

		this.id = id;
		this.pw = pw;
		this.name = name;
		this.gender = gender;
		this.birth = birth;
		this.email = email;
		this.tel = tel;
	}
	
	public BoardMember(int boardNo, String name, String title, String content, Date regdate) {
		
		BoardNo = boardNo;
		this.name = name;
		this.title = title;
		this.content = content;
		this.regdate = regdate;

	}

	@Override

	public String toString() {

		String str = String.format("아이디:%s \n이름:%s \n성별:%s \n생일:%s \n이메일:%s \n번호:%s \n",

				id, name, gender, birth, email, tel);

		return str;

	}
	
	
	public BoardMember() {

	}

	public int getBoardNo() {
		return BoardNo;
	}

	public void setBoardNo(int boardNo) {
		BoardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	

	public int getId() {

		return id;

	}

	public void setId(int id) {

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

	public String getGender() {

		return gender;

	}

	public void setGender(String gender) {

		this.gender = gender;

	}

	public String getBirth() {

		return birth;

	}

	public void setBirth(String birth) {

		this.birth = birth;

	}

	public String getEmail() {

		return email;

	}

	public void setEmail(String email) {

		this.email = email;

	}

	public String getTel() {

		return tel;

	}

	public void setTel(String tel) {

		this.tel = tel;

	}



}
