package Book;

public abstract class Book implements ReadingMaterial{
	private String code;
	private String title;
	private Author author;
	private String category;
	private int pages;

	public Book(){}

	public <O extends Object> Book(O[] args){
		code = (String) args[0];
		title = (String) args[1];
		author = (Author) args[2];
		category = (String) args[3];
		pages = (Integer) args[4];
	}

	public Book(String code, String title, Author author,String category,int pages){
		this.code = code;
		this.title = title;
		this.author = author;
		this.category = category;
		this.pages = pages;
	}

	public Book(String code, String title, Author author,int pages){
		this(code,title,author,"Computer",pages);
	}

	public String getCode(){
		return code;
	}
	public String getTitle(){
		return title;
	}
	public Author getAuthor(){
		return author;
	}
	public String getCategory(){
		return category;
	}
	public int getPages(){
		return pages;
	}

	//This class implements all the methods of the ReadingMaterials.
	public String copyrightNotice(){
		return "Copyright 202";
	}

	public int pageCount(){
		return pages;
	}

	public abstract void display();
	public abstract String displayMe();

	@Override
	public boolean equals(Object obj){
		if(obj instanceof Book){
			Book book = (Book) obj;
			return this.getCode() == book.getCode() && this.getTitle() == book.getTitle() && this.getAuthor() == book.getAuthor() && this.getCategory() == book.getCategory() && this.getPages() == book.getPages();
		} else {
			return false;
		}
	}
}