package co.emori.prj.notice.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import co.emori.prj.notice.vo.NoticeVO;

public interface NoticeMapper {
	List<NoticeVO> noticeSelectList(@Param("state") int state, @Param("key") String key); //한건조회
	NoticeVO noticeSelect(NoticeVO vo);//전체조회
	int noticeInsert(NoticeVO vo);
	int noticeUpdate(NoticeVO vo);
	int noticeDelete(NoticeVO vo);
	
	int noticeHitUpdate(int id); //조회수 변경
}
