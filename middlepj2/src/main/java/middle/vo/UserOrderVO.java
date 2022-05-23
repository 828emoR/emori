package middle.vo;

public class UserOrderVO {
private String uid; //구매 id
private int productCode; // 구매 상품코드
private int productPrice;  // 구매 상품금액
private String productName; // 상품 이름
private int uorderCode; // 주문번호
private String uorderDate; // 주문날짜
private String uorderAddress;// 주소
private String uorderName; // 주문자이름
private String uorderTel; // 주문자전화번호
private int amount; // 수량
private String productImg; //상품이미지
public UserOrderVO() {
   
}

public UserOrderVO(String uid, int productCode, int productPrice, String productName, int uorderCode,
		String uorderDate, String uorderAddress, String uorderName, String uorderTel, int amount, String productImg) {
	super();
	this.uid = uid;
	this.productCode = productCode;
	this.productPrice = productPrice;
	this.productName = productName;
	this.uorderCode = uorderCode;
	this.uorderDate = uorderDate;
	this.uorderAddress = uorderAddress;
	this.uorderName = uorderName;
	this.uorderTel = uorderTel;
	this.amount = amount;
	this.productImg = productImg;
}

public String getUid() {
	return uid;
}
public void setUid(String uid) {
	this.uid = uid;
}
public int getProductCode() {
	return productCode;
}
public void setProductCode(int productCode) {
	this.productCode = productCode;
}
public int getProductPrice() {
	return productPrice;
}
public void setProductPrice(int productPrice) {
	this.productPrice = productPrice;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getUorderCode() {
	return uorderCode;
}
public void setUorderCode(int uorderCode) {
	this.uorderCode = uorderCode;
}
public String getUorderDate() {
	return uorderDate;
}
public void setUorderDate(String uorderDate) {
	this.uorderDate = uorderDate;
}
public String getUorderAddress() {
	return uorderAddress;
}
public void setUorderAddress(String uorderAddress) {
	this.uorderAddress = uorderAddress;
}
public String getUorderName() {
	return uorderName;
}
public void setUorderName(String uorderName) {
	this.uorderName = uorderName;
}
public String getUorderTel() {
	return uorderTel;
}
public void setUorderTel(String uorderTel) {
	this.uorderTel = uorderTel;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public String getProductImg() {
	return productImg;
}
public void setProductImg(String productImg) {
	this.productImg = productImg;
}
@Override
public String toString() {
	return "UserOrderVO [uid=" + uid + ", productCode=" + productCode + ", productPrice=" + productPrice
			+ ", productName=" + productName + ", uorderCode=" + uorderCode + ", uorderDate=" + uorderDate
			+ ", uorderAddress=" + uorderAddress + ", uorderName=" + uorderName + ", uorderTel=" + uorderTel
			+ ", amount=" + amount + ", productImg=" + productImg + "]";
}









}