import java.util.*;
import Person.*;

public class TestPerson{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter person id: ");
		int personId =  Integer.parseInt(sc.nextLine());

		System.out.print("Enter name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Birthdate (Month day year): ");
		BDate bday = new BDate(sc.next(), sc.nextInt(), sc.nextInt());

		System.out.print("Enter address (houseNo brgy city province code): ");
		Address address = new Address(sc.nextInt(), sc.next(), sc.next()+" "+ sc.next(), sc.next(), sc.nextInt());

		System.out.println();
		System.out.println("Displaying Data: ");
		Person person = new Person(personId, name, bday, address);
		System.out.println(person.toString());
	}
}