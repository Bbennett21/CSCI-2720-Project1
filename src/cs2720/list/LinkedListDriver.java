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

             // exits
             if(cmdInput.equals("q")) {
                 System.out.println("Exiting the program...");
                 quit = true;

                 // prints the length
             } else if(cmdInput.equals("l")) {
                 System.out.println("Length of list: " + list.getLength());

                 // prints list
             } else if(cmdInput.equals("p")) {
                 System.out.print("The list is: ");
                 list.printList();

                 // keeps the cross of 2 lists
             } else if(cmdInput.equals("t")) {
                 System.out.print("Enter the length of the new list: ");
                 int length = userInput.nextInt();
                 System.out.print("Enter the numbers: ");
                 SortedLinkedList list2 = new SortedLinkedList();
                 for(int i = 0; i < length; i++) {
                     ItemType item2 = new ItemType();
                     item2.initialize(userInput.nextInt());
                     list2.insertItem(item2);
                 } // while
                 System.out.print("List 1: ");
                 list.printList();
                 System.out.print("List 2: ");
                 list2.printList();
                 list.intersect(list2);
                 System.out.print("New List: ");
                 list.printList();

                 // merges 2 lsits
			 } else if(cmdInput.equals("m")) {
                 System.out.print("Enter the length of the new list: ");
                 int length = userInput.nextInt();
                 System.out.print("Enter the numbers: ");
                 SortedLinkedList list2 = new SortedLinkedList();
                 for(int i = 0; i < length; i++) {
                     ItemType item2 = new ItemType();
                     item2.initialize(userInput.nextInt());
                     list2.insertItem(item2);
                 } // while
                 System.out.print("List 1: ");
                 list.printList();
                 System.out.print("List 2: ");
                 list2.printList();
                 list.mergeList(list2);
                 System.out.print("New List: ");
                 list.printList();

                 // deletes alternate nodes
             } else if(cmdInput.equals("a")) {
                 System.out.print("Original List: ");
                 list.printList();
                 list.deleteAlt();
                 System.out.print("New List: ");
                 list.printList();
                 // resets iterator
             } else if(cmdInput.equals("r")) {
                 list.resetList();
                 System.out.println("Iterator is reset");

                 // gets next item
             } else if(cmdInput.equals("n")) {
                 ItemType current = list.getNextItem();
                 if(current != null) {
                     System.out.println(current.getValue());
                 } // if

                 //searches for an item
             } else if(cmdInput.equals("s")) {
                 System.out.print("Enter a number to search: ");
                 numInput = userInput.nextInt();
                 item.initialize(numInput);
                 System.out.print("Original List: ");
                 list.printList();
                 int index = list.searchItem(item);
                 if (index != -1) {
                 System.out.println("Item is found at index: " + index);
                 } // if

                 // deletes an item
             } else if(cmdInput.equals("d")) {
                 System.out.print("Enter a number to delete: ");
                 int numDelete = userInput.nextInt();
                 ItemType itemDelete = new ItemType();
                 itemDelete.initialize(numDelete);
                 System.out.print("Original List: ");
                 list.printList();
                 list.deleteItem(itemDelete);
                 System.out.print("New List: ");
                 list.printList();

                 //inserts an item
             } else if(cmdInput.equals("i")) {
                 System.out.print("Enter a number to insert: ");
                 int numInsert = userInput.nextInt();
                 ItemType itemInsert = new ItemType();
                 itemInsert.initialize(numInsert);
                 System.out.print("Original List: ");
                 list.printList();
                 list.insertItem(itemInsert);
                 System.out.print("New List: ");
                 list.printList();
             } else {
                 System.out.println("Invalid command, try again!");
             } // if
          } // while
      } // main
} // LinkedListDriver
