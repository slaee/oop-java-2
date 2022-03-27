/**
 * Automated My Book Library
 * Written by: Sly Kint A. Bacalso
 * Feb 19, 2022
 */

import java.util.*;
import Book.*;
import Book.BookGenerator.DataFaker;

public class Main {
    public static void main(String[] args){
        Bacalso_BookList mybook = new Bacalso_BookList();
        DataFaker faker = new DataFaker();
        Scanner sc = new Scanner(System.in);
        Timer timer = new Timer();

        long time = 0L;
        for(int i = 1; i <= 5; i++){
            switch(i){
                case 1: {
                    System.out.println("Sly is adding Books...");
                    for(int j = 0; j < 6; j++){
                        timer.schedule(new TimerTask() {
                            @Override
                            public void run(){
                                mybook.addBook(new ComputerBook(faker.book()));
                            }
                        }, time += 50L);
                    }   
                }
                break;
                case 2: {
                    timer.schedule(new TimerTask() {
                        @Override
                        public void run(){
                            System.out.println("Displaying all the books...");
                        }
                    }, time += 1000L);

                    timer.schedule(new TimerTask() {
                        @Override
                        public void run(){
                            mybook.displayList();
                        }
                    }, time += 1000L);
                }
                break;
                case 3: {
                    timer.schedule(new TimerTask() {
                        @Override
                        public void run(){
                            Book searchBook = new ComputerBook(faker.book());  
                            System.out.println("\n\nSly is searching for a book...");
                            System.out.println( searchBook.toString());     

                            int index = mybook.search(searchBook);
                            if(index != -1) {
                                System.out.println("\n> Book found at index: " + index);
                            } else {
                                System.out.println("\n> Book not found");
                            }
                        }
                    }, time += 1000L);
                }
                break;
                case 4: {
                    timer.schedule(new TimerTask() {
                        @Override
                        public void run(){
                            Book removeBook = new ComputerBook(faker.book());
                            System.out.println("\n\nSly is removing a book...");
                            System.out.println(removeBook.toString());

                            if(mybook.removeBook(removeBook)) {
                                System.out.println("\n> Book removed");
                            } else {
                                System.out.println("\n> Book not found");
                            }
                        }
                    }, time += 1000L);
                }
                break;
                case 5: {
                    timer.schedule(new TimerTask() {
                        @Override
                        public void run(){
                            System.out.println("Displaying all the books...");
                        }
                    }, time += 1000L);

                    timer.schedule(new TimerTask() {
                        @Override
                        public void run(){
                            mybook.displayList();
                            timer.cancel();
                        }
                    }, time += 1000L);
                }
            }
        }
    }
}
