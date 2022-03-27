import java.util.*;

public class TestMyFileBacalso {
	public static void main(String[] args){
        MyMileageBacalso mmb = new MyMileageBacalso();
		MyFileBacalso myFile = new MyFileBacalso("input.txt");
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the gallons used (-1 to end): ");
		mmb.gallons = sc.nextDouble();
		System.out.print("Enter the miles driven: ");
		mmb.miles = sc.nextDouble();

		if(myFile.writeToFile("input.txt")){
			myFile.write(mmb.toString());
		}

		myFile.readFromFile("input.txt");
		String data[] = myFile.getContent().split(" ");
		double milesPerGallon = Double.parseDouble(data[1])/ Double.parseDouble(data[0]);
		
		myFile.createFile("output.txt");
		if(myFile.writeToFile("output.txt")){
			myFile.write("The miles/gallon for this tank was " + milesPerGallon);
		}

		System.out.println();
		myFile.readFromFile("output.txt");
		System.out.println(myFile.getContent());

		sc.close();
	}
}