package Book.BookGenerator;

import java.util.*;

import Book.Author;

import java.io.*;
import java.security.SecureRandom;


public class DataFaker {
    private static final SecureRandom random = new SecureRandom();

    public Object[] book(){
        Object[] objBook = new Object[7];
        try {
            String strLine = generateBook();
            String[] data = strLine.split("\\|");
            objBook[0] = (String) data[0]; //code
            objBook[1] = (String) data[1]; // title

            String authorName[] = data[2].split("\\s"); // author
            objBook[2] = new Author(authorName[0], authorName[1]); 
            
            objBook[3] = "Computer"; // category
            objBook[4] = (Integer) Integer.parseInt(data[4]); // pages
            objBook[5] = (String) data[3]; // area
            objBook[6] = (Boolean) true; // isbn
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return objBook;
    }

    private static String generateBook() throws FileNotFoundException {
        String book = selectPlainData(new File("Book/BookGenerator/datalib/books.txt"));
        return book;
    }

    private static String selectPlainData(File f) throws FileNotFoundException {
        String result = null;
        int n = 0;

        Scanner sc = new Scanner(f);
        for (;sc.hasNext();) {
            ++n;
            String line = sc.nextLine();
            if (random.nextInt(n) == 0){
                result = line;
            }
        }
        return result;
    }
}
 