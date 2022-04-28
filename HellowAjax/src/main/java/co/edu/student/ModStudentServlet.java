package co.edu.student;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ModStudentServlet
 */
@WebServlet("/ajax/ModStudentServlet")
public class ModStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ModStudentServlet() {
        super();

    }

@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	req.setCharacterEncoding("utf-8");
	resp.setCharacterEncoding("utf-8");
	resp.setContentType("text/html;charset=utf-8");
	
	String sNo = req.getParameter("a");
	String sName = req.getParameter("b");
	String eng = req.getParameter("c");
	String kor = req.getParameter("d");
	
	student std = new student();
	std.setStudentNo(Integer.parseInt(sNo));
	std.setEngScore(Integer.parseInt(eng));
	std.setKorScore(Integer.parseInt(kor));
	std.setStudentName(sName);
	
	studentDAO dao = new studentDAO();
	boolean success = dao.modifyStudent(std);
	
	if (success) {
		//{"retCode":"success", "studNo":sNo,"engScore":eng, "korScore":kor, "studName":"sName"}
		resp.getWriter().println("{\"retCode\":\"OK\", \"studentNo\":"+sNo+",\"engScore\":"+eng+",\"korScore\":"+kor+", \"studentName\":\""+sName+"\"}");
		
	} else {
		resp.getWriter().println("{\"retCode\":\"Fail\"}");
	}
}


}
