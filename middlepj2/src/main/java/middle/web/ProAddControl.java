package middle.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import middle.service.ProductService;
import middle.vo.ProductVO;

public class ProAddControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String saveDir = "upload";
		saveDir = request.getServletContext().getRealPath(saveDir);
		int maxSize = 1024 * 1024 * 10;
		String encoding = "utf-8";
		MultipartRequest multi = new MultipartRequest(request, saveDir, maxSize, encoding, new DefaultFileRenamePolicy());
		
		System.out.println("상품등록 컨트롤");
		
		String name = multi.getParameter("pname");
		String category = multi.getParameter("pcate");
		int price = Integer.parseInt(multi.getParameter("pprice"));
		int amount = Integer.parseInt(multi.getParameter("pamount"));
		String exp = multi.getParameter("pexp");
		String img = multi.getFilesystemName("pimg");
		
		ProductVO vo = new ProductVO();
		vo.setProductName(name);
		vo.setProductCate(category);
		vo.setProductPrice(price);
		vo.setProductAmount(amount);
		vo.setProductExp(exp);
		vo.setProductImg(img);
		
		ProductService service = new ProductService();
		service.productInsert(vo);
		
		request.setAttribute("name", name);
		request.setAttribute("category", category);
		
		request.getRequestDispatcher("result/ProAddOut.jsp").forward(request, response);
		
	}

}
