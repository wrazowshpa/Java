package application;

public class Month {
	
	private int monthNumber;
	private String monthName;
	
	public Month(int monthNumber, String monthName) {
		super();
		this.monthNumber = monthNumber;
		this.monthName = monthName;
	}
	
	public int getMonthNumber() {
		return monthNumber;
	}
	public void setMonthNumber(int monthNumber) {
		this.monthNumber = monthNumber;
	}
	public String getMonthName() {
		return monthName;
	}
	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}

	@Override
	public String toString() {
		return monthName;
	}

}
