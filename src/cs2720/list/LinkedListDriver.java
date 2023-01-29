package cs2720.list;

import java.util.Scanner;  // Import the Scanner class
import java.io.File;
import java.io.FileNotFoundException;
import cs2720.list.ItemType;
import cs2720.list.SortedLinkedList;

public class LinkedListDriver {

      public static void main(String[]args) {

          boolean quit = false;
          String cmdInput;
          int numInput;
          ItemType item = new ItemType();
          SortedLinkedList list = new SortedLinkedList();

          try {
              Scanner scanFile = new Scanner(new File(args[0]));

              while (scanFile.hasNextInt()) {
                  item.initialize(scanFile.nextInt());
                  list.insertItem(item);
              } // while

          } catch (FileNotFoundException e) {
              System.out.println("Error: Input file not found.");
              return;
          } // try
          Scanner userInput = new Scanner(System.in);

          while(quit == false) {
             System.out.print("Enter a command: ");
             cmdInput = userInput.next();
             if(cmdInput.equals("q")) {
                 quit = true;
             } else if(cmdInput.equals("l")) {
                 System.out.println(list.getLength());
             } else if(cmdInput.equals("p")) {

             } else if(cmdInput.equals("t")) {

			 } else if(cmdInput.equals("m")) {

             } else if(cmdInput.equals("a")) {

             } else if(cmdInput.equals("r")) {

             } else if(cmdInput.equals("n")) {

             } else if(cmdInput.equals("s")) {
                 System.out.println("Enter a number to search: ");
                 numInput = userInput.nextInt();
             } else if(cmdInput.equals("d")) {
                 System.out.println("Enter a number to delete: ");
                 numInput = userInput.nextInt();
             } else if(cmdInput.equals("i")) {
                 System.out.println("Enter a number to insert: ");
                 numInput = userInput.nextInt();
             } else {

             } // if
          } // while
      } // main
} // LinkedListDriver
