/*Write a class named Author with the following attributes:
firstName, lastName and middleInitial.
Provide getter/setter methods for the lastName.
Override the toString method of the Object class.
It will follow the format
<firstName> <middleInitial>. <lastName>
for example: Sigurado N. Pasar for its string representation.*/

package Book;

public class Author{
	private String fname;
	private String lname;

	public Author(){}
	
	public Author(String fname, String lname){
		this.fname = fname;
		this.lname = lname;
	}

	public String getFname(){
		return fname;
	}

	public void setFname(String fname){
		this.fname = fname;
	}

	public void setLname(String lname){
		this.lname = lname;
	}

	public String getLname(){
		return this.lname;
	}

	public String toString(){
		return fname + " " + getLname();
	}
}