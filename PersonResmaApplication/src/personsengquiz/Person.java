/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personsengquiz;

/**
 *
 * @author Genica Mae Seng
 */
public class Person{
	private String name;
	private String address;
	private String contactNumber;

	public Person(){}
	public Person(String name, String address, String contactNumber){
		this.name=name;
		this.address=address;
		this.contactNumber = contactNumber;
	}

	public void setName(String name){
		this.name=name;
	}

	public void setAddress(String address){
			this.address=address;
	}

	public void setContactNumber(String contactNumber){
			this.contactNumber=contactNumber;
	}

	public String getName(){
		return name;
	}

	public String getAddress(){
			return address;
	}
	public String getContactNumber(){
			return contactNumber;
	}

	public String toString(){
		return getName()+"\n"+getAddress()+"\n"+getContactNumber();
	}
}