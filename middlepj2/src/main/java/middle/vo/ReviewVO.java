package middle.vo;

public class ReviewVO {
	
	private int reviewCode;
	private int orderCode;
	private int productCode;
	private String id;
	private String reviewPass;
	private String reviewTitle;
	private String reviewContent;
	private String reviewDate;
	private String reviewImg;
	private int reviewStar;
	
	
	public int getReviewCode() {
		return reviewCode;
	}
	public void setReviewCode(int reviewCode) {
		this.reviewCode = reviewCode;
	}
	public int getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(int orderCode) {
		this.orderCode = orderCode;
	}
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getReviewPass() {
		return reviewPass;
	}
	public void setReviewPass(String reviewPass) {
		this.reviewPass = reviewPass;
	}
	public String getReviewTitle() {
		return reviewTitle;
	}
	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}
	public String getReviewContent() {
		return reviewContent;
	}
	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}
	public String getReviewDate() {
		return reviewDate;
	}
	public void setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
	}
	public String getReviewImg() {
		return reviewImg;
	}
	public void setReviewImg(String reviewImg) {
		this.reviewImg = reviewImg;
	}
	public int getReviewStar() {
		return reviewStar;
	}
	public void setReviewStar(int reviewStar) {
		this.reviewStar = reviewStar;
	}
	
}
