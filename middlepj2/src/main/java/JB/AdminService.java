package JB;

import java.util.List;


import middle.vo.UserVO1;

public class AdminService {
	AdminDAO dao;
	
	public AdminService() {
		dao = new AdminDAO();
	}
	
	public List<UserVO1> Userlist() {
		return dao.Userlist();
	}
	
	public UserVO1 findUser(String user){
		return dao.selectUser(user);
	}
//	public void removeUser (String id){
//		dao.deleteUser(id);
//	}
//	public void modifyProduct(){
//		dao.
//	}
//	public void removeProduct(){
//		dao.
//	}

}
