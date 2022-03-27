package Book;

public class ComputerBook extends Book{
	private String area;
	private boolean isEBookAvailable;
	
	// This constructor has args for all the fields of the parent class.
	public <O extends Object> ComputerBook(O[] args){
		super(args);
		area = (String) args[5];
		isEBookAvailable = (Boolean) args[6];
	}

	public ComputerBook(String area, boolean isEBookAvailable){
		this.area = area;
		this.isEBookAvailable = isEBookAvailable;
	}

	public ComputerBook(boolean isEBookAvailable){
		area = "Programming";
		this.isEBookAvailable = isEBookAvailable;
	}

	public ComputerBook(){
		this("Networking",true);
	}

	public boolean equals(Object obj){
		if(obj instanceof ComputerBook){
			ComputerBook cbook = (ComputerBook) obj;
			return this.area == cbook.area && super.equals(obj);
		} 

		return false;
	}

	public String getArea(){
		return area;
	}

	public void display(){
		System.out.println("\nCode: " + super.getCode() +"\nTitle:"
			+getTitle() + "\nAuthor: " + getAuthor() + "\nCategory: "
			+getCategory() + "\nPages: " + getPages());
	}
	public String displayMe(){
		return "";
	}

	public String toString(){
		return "\nCode: " + super.getCode() 
		+"\nTitle: " +getTitle() 
		+"\nAuthor: " + getAuthor() 
		+"\nCategory: " + getCategory() 
		+"\nPages: " + getPages()
		+"\nArea: " + area 
		+"\nE-Book Available: " + isEBookAvailable;
	}
}