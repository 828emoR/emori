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
         psmt = conn.prepareStatement(
               "select user_order.order_code 주문번호, user_order.order_date 구매날짜, user_order.order_address 주소,user_order.order_name 상품이름, user_order.order_tel 전화번호\r\n"
               + "from user_order,user_info\r\n"
               + "where user_order.id=user_info.id\r\n"
               + "and user_order.id=? ");
         psmt.setString(1, id);
         rs = psmt.executeQuery();
         while (rs.next()) {
            UserOrderVO vo = new UserOrderVO();
            vo.setUorderCode(rs.getString("주문번호"));
            vo.setUorderDate(rs.getString("구매날짜"));
            vo.setUorderAddress(rs.getString("주소"));
            vo.setUorderName(rs.getString("상품이름"));
            vo.setUorderTel(rs.getString("전화번호"));
            list.add(vo);
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         disconnect();
      }
      return list;
   }

}