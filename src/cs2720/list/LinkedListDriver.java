package cs2720.list;

import java.util.Scanner;  // Import the Scanner class
import java.io.File;
import java.io.FileNotFoundException;
import cs2720.list.ItemType;
import cs2720.list.SortedLinkedList;

public class LinkedListDriver {

      public static void main(String[]args) {

          boolean quit = false;
          String input = "";
          ItemType item = new ItemType();
          SortedLinkedList list = new SortedLinkedList();

          try {
              Scanner scanFile = new Scanner(new File(args[0]));

              while (scanFile.hasNextInt()) {
                  item.initialize(scanFile.nextInt());
                  System.out.println(item.getValue());
                  list.insertItem(item);
              } // while

          } catch (FileNotFoundException e) {
              System.out.println("Error: Input file not found.");
              return;
          } // try
          Scanner userInput = new Scanner(System.in);

          while(quit == false) {
             System.out.print("Enter a command: ");
             input = userInput.next();
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
