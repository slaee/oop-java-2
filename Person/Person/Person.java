package Person;

public class Person{
	private int personId;
	private String name;
	private BDate bday;
	private Address address;

	public Person(){}

	public Person(int personId, String name, BDate bday, Address address){
		this.personId = personId;
		this.name = name;
		this.bday = bday;
		this.address = address;
	}

	public void setPersonId(int personId){
		this.personId = personId;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setBday(BDate bday){
		this.bday = bday;
	}

	public void setAddress(Address address){
		this.address = address;
	}

	public int getPersonId(){
		return personId;
	}

	public String getName(){
		return name;
	}

	public BDate getBDay(){
		return bday;
	}

	public Address getAddress(){
		return address;
	}

	public String toString(){
		return "Person ID: "+ getPersonId()
			+"\nName: "+ getName()
		 	+"\n"+ bday.toString()
		 	+"\n"+ address.toString();
	}
}