Contributors:
- Michael Le (ml10674@uga.edu): implemented the SortedLinkedList class and ItemType class
- Bryson Bennett (blb64218@uga.edu): implemented the LinkedListDriver class and NodeType class

Instructions:
1. Compile all source files using the following commands:
   - javac -d bin src/cs2720/list/ItemType.java
   - javac -cp bin -d bin src/cs2720/list/NodeType.java
   - javac -cp bin -d bin src/cs2720/list/SortedLinkedList.java
   - javac -cp bin -d bin src/cs2720/list/LinkedListDriver.java

2. Run the program using the following command:
   - java -cp bin src/cs2720/list/LinkedListDriver input.txt

   Note: Replace "input.txt" with the name of the input file you want to use.

Description:
This program implements a sorted linked list that stores integer values. The SortedLinkedList class contains methods for inserting, deleting, searching, printing, merging, and intersecting lists. The LinkedListDriver class contains a main method that provides a menu for the user to interact with the SortedLinkedList.

The program reads input from a file specified by the user and initializes the SortedLinkedList with the integer values in the file. The user can then perform various operations on the list using the menu provided. The program also allows the user to create a new list and perform operations on it, such as merging it with the existing list or finding the intersection between the two lists.

