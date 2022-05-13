package co.project.service;

import java.util.List;

import co.project.dao.UserInfoDAO;
import co.project.vo.UserInfoVO;

public class UserService {

	UserInfoDAO dao;

	public UserService() {
		dao = new UserInfoDAO();
	}

	// 목록
	public List<UserInfoVO> UserList() {
		return dao.UserList();
	}

	// 단건조회
	public UserInfoVO findUser(String UserSel) {
		return dao.selectUser(UserSel);
	}

	// 수정
	public void modifyBook(UserInfoVO UserInst) {
		dao.updateUser(UserInst);
	}

	// 삭제
	public void removeUser(String UserSel) {
		dao.deleteUser(UserSel);
	}

	// 입력
	public void addBook(UserInfoVO UserInst) {
		dao.insertUser(UserInst);
	}

}
