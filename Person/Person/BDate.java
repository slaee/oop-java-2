package Person;

public class BDate {
	private String month;
	private int day;
	private int year;

	public BDate(){}

	public BDate(String month, int day, int year){
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public void setMonth(String month){
		this.month = month;
	}

	public void setDay(int day){
		this.day = day;
	}

	public void setYear(int year){
		this.year = year;
	}

	public String getMonth(){
		return month;
	}

	public int getDay(){
		return day;
	}

	public int getYear(){
		return year;
	}

	@Override
	public String toString(){
		return "Birthdate :" + getMonth() 
		+", " +getDay()
		+", " +getYear();
	}
}