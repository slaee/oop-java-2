import java.util.*;

public class Sample {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        
        myList.add(100);
        myList.add(new Integer(1));
        myList.add(1);
        myList.add(new Integer(200));
        myList.add(2);

        for (Integer i : myList) {
            System.out.println(i);
        }

        // sort the arraylist
        Collections.sort(myList);

        for (Integer i : myList) {
            System.out.println(i);
        }
    }
}