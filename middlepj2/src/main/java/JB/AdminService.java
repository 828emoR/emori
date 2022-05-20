package JB;

import java.util.List;

import middle.vo.ProductVO;
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
	
	public ProductVO adminProSearch(String productcode) {
		return dao.adminProSearch(productcode);
	}
	
	public List<ProductVO> Prolist(){
		return dao.Prolist();
	}
	public void adminProMod (ProductVO pro) {
		dao.adminProMod(pro);
	}
	public void adminProDel (String productCode) {
		dao.adminProDel(productCode);
	}
}
