package co.edu.student;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DelStudentServlet
 */
@WebServlet("/ajax/delStudentServlet")
public class DelStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DelStudentServlet() {
		super();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("delId");

		studentDAO dao = new studentDAO();
		boolean Success = dao.removeStudent(id);

		if (Success) {
			// {"retCode":"OK", "retVal": id}
			resp.getWriter().println("{\"retCode\":\"OK\", \"retVal\": " + id + "}");
		} else {
			// {"retCode":"Fuckyou", "retVal": id}
			resp.getWriter().println("{\"retCode\":\"Fuckyou\", \"retVal\": " + id + "}");
		}
	}

}
