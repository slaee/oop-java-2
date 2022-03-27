import java.io.File;
import java.util.*;
import java.io.*;

public class M {
    public static void main(String[] args) {
        File file = new File("CS228");
        file.mkdir();
        System.out.println(file.exists());

        // ArrayList<Character> myArrayList = new ArrayList();
        // myArrayList.add('a');
        // myArrayList.add('g');
        // myArrayList.add('y');
        // myArrayList.add('m');
        // myArrayList.add('c');

        // for(Character c : myArrayList){
        //     System.out.println(c);
        // }

        // File myFile = new File("myfile.txt");
        // boolean b;
        // try {
        //     b = myFile.createNewFile();
        //     System.out.println(b);
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }
        
        
    }
}