package project1;
//참조, 라이브러리 용도 

import java.io.Serializable;
import java.util.Date;

public class BoardWrite implements Serializable {

	private int BoardNo;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private String reply;
	
	
	
	public BoardWrite(int boardNo, String title, String content, String writer, Date regdate, String reply) {
		super();
		BoardNo = boardNo;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
		this.reply = reply;
	}
	
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
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
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	@Override
	public String toString() {
		return "Board [BoardNo=" + BoardNo + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", regdate=" + regdate + ", reply=" + reply + "]";
	}

	
	
	
	
}