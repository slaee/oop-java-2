/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeansgui_seng.GUI;

/**
 *
 * @author Genica Mae Seng
 */
public class Name{
	private String firstname;
	private String middlename;
	private String lastname;

	public Name(String firstname, String middlename, String lastname){
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
	}

	public Name(){}

	public void setFirstname(String firstname){
		this.firstname = firstname;
	}

	public void setMiddlename(String middlename){
		this.middlename = middlename;
	}

	public void setLastname(String lastname){
		this.lastname = lastname;
	}

	public String getFirstname(){
		return this.firstname;
	}

	public String getMiddlename(){
		return this.middlename;
	}

	public String getLastname(){
		return this.lastname;
	}

	public String toString(){
		return this.getFirstname()+" "+this.getMiddlename()+" "+this.getLastname();
	}
}