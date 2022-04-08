package project1;

import java.io.Serializable;

public class BoardMember implements Serializable {

	private String id;
	private String pw;
	private String name;
	private String gender;
	private String birth;
	private String email;
	private String tel;

	private int BoardNo;
	private String title;
	private String content;
	private String regdate;
	private String reply;

	public BoardMember(String id, String pw, String name, String gender, String birth, String email, String tel) {

		this.id = id;
		this.pw = pw;
		this.name = name;
		this.gender = gender;
		this.birth = birth;
		this.email = email;
		this.tel = tel;
	}
	
	public BoardMember(String id, String name, String title, String content, String regdate) {
		
		this.id = id;
		this.name = name;
		this.title = title;
		this.content = content;
		this.regdate = regdate;

	}
	


	public BoardMember(int BoardNo, String title, String content) {
		super();
		this.BoardNo = BoardNo;
		this.title = title;
		this.content = content;
	}

	@Override

	public String toString() {

		String str = String.format("아이디:%s \n이름:%s \n성별:%s \n생일:%s \n이메일:%s \n번호:%s \n",

				id, name, gender, birth, email, tel);

		return str;

	}
	
	public String toString2() {
		return "----------------------------------------------------------------------------------------------------------------\n"
				+" |no. "+ BoardNo + "| "+"[작성자: "+ name +"] "+" [제목: " + title + "] "+"[작성일: " + regdate+ "] "+"\n"
				+"--------------------------------------------------------------------------------------------------------------\n"
				+"[내용: " + content +"]"+ "\r\n";
				
	}
	
	public BoardMember() {

	}

	public int getBoardNo() {
		return BoardNo;
	}

	public void setBoardNo(int boardNo) {
		this.BoardNo = boardNo;
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

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
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
