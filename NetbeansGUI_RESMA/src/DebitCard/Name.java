/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DebitCard;

/**
 * @author Charmaine Helven G. Resma
 * Date: March 3, 2022
 */
public class Name{
    private String firstname;
    private String middlename;
	private String lastname;

	public Name(){}

	public Name(String firstname, String middlename, String lastname){
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
	}

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
		return firstname;
	}

	public String getMiddlename(){
		return middlename;
	}

	public String getLastname(){
		return lastname;
	}

	@Override
	public String toString(){
		return this.getFirstname()+" "+this.getMiddlename()+" "+this.getLastname();
	}
}
