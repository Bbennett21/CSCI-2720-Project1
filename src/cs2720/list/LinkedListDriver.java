package cs2720.list;

import java.util.Scanner;  // Import the Scanner class
import cs2720.list.ItemType;
import cs2720.list.SortedLinkedList;

public class LinkedListDriver {

      public static void main(String[]args) {

          boolean quit = false;
          String input;
          Scanner scan = new Scanner(System.in);

         Scanner getList = new Scanner(System.in);
         ItemType item = new ItemType();
         SortedLinkedList list = new SortedLinkedList();

         while (getList.hasNext()) {
             item.initialize(getList.next());
             list.insertItem(item);
         } // while

         getList.close();

         while(quit == false) {
             System.out.println("Enter a command: ");
             input = scan.nextLine();

             if(input.equals("q")) {
                 quit = true;
             } else if(input.equals("l")) {
                 System.out.println(list.getLength());
             } else if(input.equals("p")) {

             } else if(input.equals("t")) {
			 } else if(input.equals("m")) {

             } else if(input.equals("a")) {

             } else if(input.equals("r")) {

             } else if(input.equals("n")) {

             } else if(input.equals("s")) {
                 System.out.println("Enter a number to search: ");
             } else if(input.equals("d")) {
                 System.out.println("Enter a number to delete: ");
             } else if(input.equals("i")) {
                 System.out.println("Enter a number to insert: ");
             } else {

             } // if
			} // while
		} // main
	} // LinkedListDriver
