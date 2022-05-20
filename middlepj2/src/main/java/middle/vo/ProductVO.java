package middle.vo;

import middle.dao.DAO;

// 상품판매VO 1
public class ProductVO extends DAO {

	private int productCode;
	private String productCate;
	private String productName;
	private int productPrice;
	private int productAmount;
	private String productExp;
	private String productImg;
	private String productDate;
	
	public ProductVO() {
		
	}
	
	

	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public String getProductCate() {
		return productCate;
	}
	public void setProductCate(String productCate) {
		this.productCate = productCate;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductAmount() {
		return productAmount;
	}
	public void setProductAmount(int productAmount) {
		this.productAmount = productAmount;
	}
	public String getProductExp() {
		return productExp;
	}
	public void setProductExp(String productExp) {
		this.productExp = productExp;
	}
	public String getProductImg() {
		return productImg;
	}
	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}
	public String getProductDate() {
		return productDate;
	}
	public void setProductDate(String productDate) {
		this.productDate = productDate;
	}




	
	

	
	
}
