package co.edu.full;

public class FullVO {
	private String title;
	private String StartDate;
	private String EndDate;
	
	
	
	
	public FullVO(String title, String startDate, String endDate) {
		super();
		this.title = title;
		StartDate = startDate;
		EndDate = endDate;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	public String getEndDate() {
		return EndDate;
	}
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}
	
	
}
