package middle.service;

import java.util.List;

import middle.dao.ProductDAO;
import middle.vo.ProductVO;

public class ProductService {
	
	ProductDAO dao = new ProductDAO();
	
	// 상품등록
	public void productInsert(ProductVO product) {
		dao.insertProduct(product);
	}
	
	// 간식 카테고리
	public List<ProductVO> snackList() {
		return dao.listSnack();
	}
	
	// 장난감 카테고리
	public List<ProductVO> toyList() {
		return dao.listToy();
	}
	
	// 실내용품
	public List<ProductVO> goodsList() {
		return dao.listGoods();
	}
	
	
	// 목욕/미용
	public List<ProductVO> washList() {
		return dao.listWash();
	}
	
	
//	// 카테고리별 보기
//	public List<ProductVO> cateList(String product_category) {
//		return dao.listProduct(product_category);
//	}
	
	
	// 최신목록
	public List<ProductVO> newList() {
		return dao.listNew();
	}
	
	
	// 상품상세보기
	public ProductVO DetailProduct(String product_code) {
		return dao.productDetail(product_code);
	}
	
	// 상품주문..?

}
