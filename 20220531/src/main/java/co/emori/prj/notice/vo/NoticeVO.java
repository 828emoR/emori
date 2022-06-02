package co.emori.prj.notice.vo;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;
/*
 * Program Name: 공지사항 VO
 * Write by : emori
 * Date : 220531 start
 * Version : 1.0
*/
@Setter
@Getter
public class NoticeVO {
	private int noticeId; //순번
	private String noticeName; //작성자
	private String noticeTitle;	//제목
	private String noticeContents;	//내용
	
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date noticeDate;//작성일자
	private int noticeHit;//조회수
	private String noticeAttech;//첨부파일명
	private String noticeDir;//물리적 첨부파일 저장폴더명

}
