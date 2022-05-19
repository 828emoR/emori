package middle.vo;

public class qnaVO {

	private String qnaDate;
	private int qnaNo;
	private String qnaPw;
	private String qnaCategory;
	private String productCode;
	private String qnaWrite;
	private String qnaTitle;
	private String qnaContent;
	private String id;
	
	public qnaVO () {
		
	}

	public qnaVO(String qnaDate, int qnaNo, String qnaPw, String qnaCategory, String productCode, String qnaWrite,
			String qnaTitle, String qnaContent, String id) {
		super();
		this.qnaDate = qnaDate;
		this.qnaNo = qnaNo;
		this.qnaPw = qnaPw;
		this.qnaCategory = qnaCategory;
		this.productCode = productCode;
		this.qnaWrite = qnaWrite;
		this.qnaTitle = qnaTitle;
		this.qnaContent = qnaContent;
		this.id = id;
	}

	public String getQnaDate() {
		return qnaDate;
	}

	public void setQnaDate(String qnaDate) {
		this.qnaDate = qnaDate;
	}

	public int getQnaNo() {
		return qnaNo;
	}

	public void setQnaNo(int qnaNo) {
		this.qnaNo = qnaNo;
	}

	public String getQnaPw() {
		return qnaPw;
	}

	public void setQnaPw(String qnaPw) {
		this.qnaPw = qnaPw;
	}

	public String getQnaCategory() {
		return qnaCategory;
	}

	public void setQnaCategory(String qnaCategory) {
		this.qnaCategory = qnaCategory;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getQnaWrite() {
		return qnaWrite;
	}

	public void setQnaWrite(String qnaWrite) {
		this.qnaWrite = qnaWrite;
	}

	public String getQnaTitle() {
		return qnaTitle;
	}

	public void setQnaTitle(String qnaTitle) {
		this.qnaTitle = qnaTitle;
	}

	public String getQnaContent() {
		return qnaContent;
	}

	public void setQnaContent(String qnaContent) {
		this.qnaContent = qnaContent;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "qnaVO [qnaDate=" + qnaDate + ", qnaNo=" + qnaNo + ", qnaPw=" + qnaPw + ", qnaCategory=" + qnaCategory
				+ ", productCode=" + productCode + ", qnaWrite=" + qnaWrite + ", qnaTitle=" + qnaTitle + ", qnaContent="
				+ qnaContent + ", id=" + id + "]";
	}
	
}