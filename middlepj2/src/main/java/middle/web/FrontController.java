package middle.web;

import java.io.IOException;
import java.util.HashMap;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FrontController")
public class FrontController extends HttpServlet {

   HashMap<String, Control> list = null;
   String charset = null;
   @Override
   public void init(ServletConfig config) throws ServletException {
      charset = config.getInitParameter("charset");
      list = new HashMap<String, Control>();
         
      list.put("/delete.do", new UserDeleteControl());
      list.put("/modify.do", new ModifyControl());
      list.put("/addUser.do", new addUserControl());
      list.put("/logout.do", new logoutControl());
      list.put("/mypage.do", new Orderlist());
      list.put("/search.do", new SearchControl());
      
      // 고객센터
      list.put("/qna.do", new qnaListControl());
      list.put("/detail.do", new qnaDetailControl());

      // 상품
      list.put("/productAdd.do", new ProAddControl()); // 관리자 상품등록
      list.put("/SnackList.do", new SnackListControl()); // 간식 카테고리
      list.put("/ToyList.do", new ToyListControl()); // 장난감 카테고리
      list.put("/GoodsList.do", new GoodsListControl()); // 실내용품 카테고리
      list.put("/WashList.do", new WashListControl()); // 목욕/미용 카테고리
      list.put("/productDetail.do", new ProDetailControl()); // 한건상세
      list.put("/mainList.do", new NewListControl()); // 최신상품 목록
      list.put("/review.do", new ProReviewControl()); // 상품리뷰
      
      
      
      
      //관리자 메뉴입니다   
      list.put("/userList.do", new AdminUserListControl());
      list.put("/searchUser.do", new AdminUserSearchControl());
   }
   @Override
   protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
      req.setCharacterEncoding(charset);
      String url = req.getRequestURI(); //사용자 URI정보 /P20220503/memberInsert.do
      String context = req.getContextPath(); // P20220503
      String path = url.substring(context.length()); // P20220503/memberInsert.do여기서 P20220503값을 잘라낸 뒷부분 저장
      
      Control exeCon = list.get(path); //해당되는밸류 리턴
      exeCon.execute(req, resp); //갖고있는메소드실행
   }
   
}

