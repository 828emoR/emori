package middle.dao;

import java.awt.print.Printable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import middle.dao.DAO;
import middle.vo.UserOrderVO;
import middle.vo.UserVO1;

public class ModiFyDAO extends DAO {
   Connection conn; // sql 연결
   ResultSet rs;
   PreparedStatement psmt; // 쿼리실행

   
   public UserVO1 userFind(String Uid) {
      return null;
   }
   public int userCheck(String id, String pw) {
      conn = getConnect();

      String sql = "select*from user_info where id = ? and pw = ? ";

      try {
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, id);
         psmt.setString(2, pw);

         int r = psmt.executeUpdate();
         
         if(r>0)
            return 1; // 로그인 성공

      } catch (SQLException e) {
         e.printStackTrace();

      } finally {
         disconnect();

      }
      return 0;// 실패

   }

   public void insertUser(UserVO1 vo) {
      conn = getConnect();
      String sql = "insert into user_info(id, pw, name, tel, email, address) " + "values (?, ?, ?, ?, ?, ?)";
      try {
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, vo.getUid());
         psmt.setString(2, vo.getUpw());
         psmt.setString(3, vo.getUname());
         psmt.setString(4, vo.getUtel());
         psmt.setString(5, vo.getUemail());
         psmt.setString(6, vo.getUaddress());

         int r = psmt.executeUpdate();
         System.out.println(r + "건 입력성공");

      } catch (SQLException e) {

         e.printStackTrace();
      } finally {
         disconnect();

      }

   }

   public UserVO1 searUs(String id) { // 회원정보
      String sql = "SELECT * FROM user_info WHERE id=?";
      conn = getConnect();
      UserVO1 vo = null;
      try {
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, id);
         rs = psmt.executeQuery();
         if (rs.next()) {
            vo = new UserVO1();
            vo.setUid(rs.getString("id"));
            vo.setUpw(rs.getString("pw"));
            vo.setUname(rs.getString("name"));
            vo.setUtel(rs.getString("tel"));
            vo.setUemail(rs.getString("email"));
            vo.setUadress(rs.getString("address"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         disconnect();
      }
      return vo;
   }

   public void updateUser(UserVO1 vo) { // 회원정보수정
      conn = getConnect();
      String sql = "update user_info set pw=?, name=?, tel=?, email=?, address=? where id = ? ";
      try {
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, vo.getUpw());
         psmt.setString(2, vo.getUname());
         psmt.setString(3, vo.getUtel());
         psmt.setString(4, vo.getUemail());
         psmt.setString(5, vo.getUaddress());
         psmt.setString(6, vo.getUid());
         int r = psmt.executeUpdate();
          System.out.println(r +"수정");
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }

   public void deleteUser(String Uid) { // 탈퇴
      conn = getConnect();
      String sql = "delete user_info where id= ?";
      try {
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, Uid);
         int r = psmt.executeUpdate();
         System.out.println(r+ "삭제");
         
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         disconnect();
      }
   }

   public List<UserOrderVO> Orderlist(String id) { // 구매내역
	      conn = getConnect();
	      List<UserOrderVO> list = new ArrayList<UserOrderVO>();
	      try {
	         psmt = conn.prepareStatement("select product.product_img img, user_order.product_name pname, user_order.order_name oname, user_order.product_price price,user_order.amount am, user_order.order_date da, user_order.order_address adr, user_order.order_tel te\r\n"
	               + "from user_order, product\r\n"
	               + "where user_order.id=? and product.product_code=user_order.product_code");
	         psmt.setString(1, id);
	         rs = psmt.executeQuery();
	         while (rs.next()) {
	            UserOrderVO vo = new UserOrderVO();
	            vo.setProductImg(rs.getString("img"));
	            vo.setProductName(rs.getString("pname"));
	            vo.setUorderName(rs.getString("oname"));
	            vo.setProductPrice(rs.getInt("price"));
	            vo.setAmount(rs.getInt("am"));
	            vo.setUorderDate(rs.getString("da"));
	            vo.setUorderAddress(rs.getString("adr"));
	            vo.setUorderTel(rs.getString("te"));
	            list.add(vo);
	            System.out.println("조회");
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } finally {
	         disconnect();
	      }
	      return list;
	   }
   public void BuyUser(UserOrderVO vo) {
	      conn = getConnect();
	      String sql = "insert into user_order(order_code,id,product_code,product_price,product_name,order_date,order_address,order_name,order_tel,amount) \r\n"
	      		+ "    values(order_code.NEXTVAL,?,?,?,?,sysdate,?,?,?,?)";
	      try {
	         psmt = conn.prepareStatement(sql);
	         psmt.setString(1, vo.getUid());
	         psmt.setInt(2, vo.getProductCode());
	         psmt.setInt(3, vo.getProductPrice());
	         psmt.setString(4, vo.getProductName());
	         psmt.setString(5, vo.getUorderAddress());
             psmt.setString(6, vo.getUorderName());
	         psmt.setString(7, vo.getUorderTel());
	         psmt.setInt(8, vo.getAmount());
	         

	         int r = psmt.executeUpdate();
	         System.out.println(r + "건 입력성공");

	      } catch (SQLException e) {

	         e.printStackTrace();
	      } finally {
	         disconnect();

	      }

	   }
   public void BuyReal(UserOrderVO vo) {
	   conn = getConnect();
	      String sql = "update user_order\r\n"
	      		+ "set  order_address = ?, order_name = ?, order_tel = ?\r\n"
	      		+ "where order_code=?";
	      try {
	         psmt = conn.prepareStatement(sql);
	         psmt.setString(1, vo.getUorderAddress());
	         psmt.setString(2, vo.getUorderName());
	         psmt.setString(3, vo.getUorderTel());
	         psmt.setInt(4, vo.getUorderCode());

	         int r = psmt.executeUpdate();
	          System.out.println(r +"수정");
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
   }
   

}