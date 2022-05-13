package co.project.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Map<String, Controller> map;
	String enc;

	public FrontController() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
System.out.println("므요");
		enc = config.getInitParameter("encoding");

		map = new HashMap<String, Controller>();

		map.put("/addUser.do", new AddUserControl());
		map.put("/listUser.do", new ListUserControl());
		map.put("/searchUser.do", new SearchUserControl());
		map.put("/modifyUser.do", new ModifyUserControl());
		map.put("/removeUser.do", new RemoveUserControl());

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding(enc);

		String uri = request.getRequestURI();
		String context = request.getContextPath();
		String path = uri.substring(context.length());

		Controller controller = map.get(path);
		controller.execute(request, response);

	}

}
