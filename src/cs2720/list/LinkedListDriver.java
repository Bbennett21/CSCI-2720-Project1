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
              File inputFile = new File(args[0]);
              Scanner scanFile = new Scanner(inputFile);
              while (scanFile.hasNext()) {
                  ItemType item1 = new ItemType();
                  item1.initialize(scanFile.nextInt());
                  list.insertItem(item1);
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
                 System.out.println("Length of list: " + list.getLength());

             } else if(cmdInput.equals("p")) {
                 list.printList();
             } else if(cmdInput.equals("t")) {

			 } else if(cmdInput.equals("m")) {

             } else if(cmdInput.equals("a")) {

             } else if(cmdInput.equals("r")) {
                 list.resetList();
             } else if(cmdInput.equals("n")) {
                 if (item != null) {
                     System.out.println("Next item: " + item.getValue());
                 } else {
                     System.out.println("The end of the list has been reached");
                 } // if

             } else if(cmdInput.equals("s")) {
                 System.out.print("Enter a number to search: ");
                 numInput = userInput.nextInt();
                 item.initialize(numInput);
                 int index = list.searchItem(item);
                 System.out.println("Item is found at index: " + index);

             } else if(cmdInput.equals("d")) {
                 System.out.print("Enter a number to delete: ");
                 numInput = userInput.nextInt();
                 item.initialize(numInput);
                  list.deleteItem(item);

             } else if(cmdInput.equals("i")) {
                 System.out.print("Enter a number to insert: ");
                 numInput = userInput.nextInt();
                 item.initialize(numInput);
                 list.insertItem(item);

             } else {
                 System.out.println("Invalid command, try again!");
             } // if
          } // while
      } // main
} // LinkedListDriver
