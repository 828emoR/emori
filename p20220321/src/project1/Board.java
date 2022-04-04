package project1;
//참조, 라이브러리 용도 

import java.io.Serializable;
import java.lang.reflect.Member;
import java.util.Date;

public class Board implements Serializable {

	private int no;
	private String title;
	private String content;
	private String writer;
	private String registeredDate;
	private int viewCount;
	private int like;
	private String reason;
	private String requester;
	public static int lastIndex = 1;

	
	
	
	
	public Board(int no, String title, String content, String writer, Date registeredDate, int viewCount, int like,
			String reason, String requester) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.registeredDate = registeredDate;
		this.viewCount = viewCount;
		this.like = like;
		this.reason = reason;
		this.requester = requester;
	}
	
	

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public String getRegisteredDate() {
		return registeredDate;
	}

	public void setRegisteredDate(String registeredDate) {
		this.registeredDate = registeredDate;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRequester() {
		return requester;
	}

	public void setRequester(String requester) {
		this.requester = requester;
	}

	public static int getLastIndex() {
		return lastIndex;
	}

	public static void setLastIndex(int lastIndex) {
		Board.lastIndex = lastIndex;
	}

	public Board() {

	}

}
