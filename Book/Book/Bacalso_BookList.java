package Book;
import java.util.*;

public class Bacalso_BookList{
	int count;
	int max;

	Vector<Book> mybook;

	public Bacalso_BookList(){
		max = Book.MAX_CONTENT;
		mybook = new Vector<Book>(max);
	}

	public Bacalso_BookList(int max){
		this.max = max;
		mybook = new Vector<Book>(max);
	}

	public boolean addBook(Book book){
		if(search(book) != -1){
			System.out.println("Book already exists");
			return false;
		}
		if(count < max){
			count++;
			System.out.println("Book added");
			return mybook.add(book);
		}
		return false;
	}
	
	public int search(Book book) {
		return mybook.indexOf(book);
	}

	public boolean removeBook(Book book) {
		int index = search(book);
		if(index != -1) {
			mybook.remove(index);
			count--;
			return true;
		}
		return false;
	}

	public void displayList(){
		for(Book book : mybook) {
			System.out.println(book.toString());
		}
	}
}