package Person;

public class Address{
	private int houseNo;
	private String brgy;
	private String city;
	private String prov;
	private int code;

	public Address(){}

	public Address(int houseNo, String brgy, String city, String prov, int code){
		this.houseNo = houseNo;
		this.brgy = brgy;
		this.city = city;
		this.prov = prov;
		this.code = code;
	}

	public void setHouseNo(int houseNo){
		this.houseNo = houseNo;
	}

	public void setBrgy(String brgy){
		this.brgy = brgy;
	}

	public void setCity(String city){
		this.city = city;
	}

	public void setProv(String prov){
		this.prov = prov;
	}

	public void setCode(int code){
		this.code = code;
	}

	public int getHouseNo(){
		return houseNo;
	}

	public String getBrgy(){
		return brgy;
	}

	public String getCity(){
		return city;
	}

	public String getProv(){
		return prov;
	}

	public int getCode(){
		return code;
	}

	public String toString(){
		return "Address: "+getHouseNo()
		+", "+getBrgy()
		+", "+getCity()
		+", "+getProv()
		+", "+getCode();
	}
}