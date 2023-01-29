package cs2720.list;

import cs2720.list.ItemType;
import cs2720.list.NodeType;

public class SortedLinkedList {

    private NodeType head;
    private NodeType currentPos;

    /**
     * Initializes a sorted linked list object.
     */
    public SortedLinkedList() {
        head = null;
        currentPos = null;
    } // SortedLinkedList

    /**
     * Returns the length of the linked list.
     */
    public int getLength() {

        int length = 0;
        NodeType temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        } // while

        return length;
    } // getLength

    /**
     * Inserts an item into the linked list while maintaining the ascending sorted order.
     * @param item the item to be inserted.
     */
    public void insertItem(ItemType item) {

        NodeType newNode = new NodeType();
        newNode.info = item;
        newNode.next = null;

        // If the list is empty, it creates a node that stores the item and sets the head to it.
        if (head == null) {
            head = newNode;
        // If the inserts the item if item < head
        } else if (head.info.compareTo(item) > 0) {
            newNode.next = head;
            head = newNode;
        // Inserts the item in the middle/end of the list
        } else {
            NodeType location = head;

            while (location.next != null && item.compareTo(location.next.info) > 0) {
                location = location.next;
            } //while

            //checks for duplicates
            if (location.next != null && item.compareTo(location.next.info) == 0) {
                System.out.println("Sorry. You cannot insert the duplicate item");
            } else {
                newNode.next = location.next;
                location.next = newNode;
            } // if
        } // if
    } // insertItem

    /**
     * Removes the node in the list that contains an item equal to item.
     * @param item the item to be deleted.
     */
    public void deleteItem(ItemType item) {
        NodeType current = head;
        NodeType previous = null;
        boolean found = false;

        while (current != null && !found) {
            if (current.info.compareTo(item) == 0) {
                found = true;
            } else {
                previous = current;
                current = current.next;
            } // if
        } // while

        if (!found) {
            if(head == null) {
                System.out.println("Cannot delete from an empty list");
            } else {
            System.out.println("Item not found");
            } // if
        } else if (current == head) {
            head = head.next;
        } else if (current.next == null) {
            previous.next = null;
        } else {
            previous.next = current.next;
        } // if
    } // deleteItem

    /**
     * Searchs the linked list for an item and returns its index.
     * @param item the item to search for.
     */
    public int searchItem(ItemType item) {
        NodeType temp = head;
        int index = 1;
        boolean found = false;
        while (temp != null && !found) {
            if (temp.info.compareTo(item) == 0) {
                found = true;
            } else {
                temp = temp.next;
                index++;
            } // if
        } // while

        if (!found) {
            if(head == null) {
                System.out.println("The list is empty");
            } else {
                System.out.println("Item not found");
            } // if

            return -1;
        } else {
            return index;
        } // if
    } // searchItem

    /**
     * Returns the next item in the list pointed by the currentPos.
     */
    public ItemType getNextItem() {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        } // if
        if (currentPos == null) {
            currentPos = head;
            return currentPos.info;
        } // if
        if (currentPos.next == null) {
            System.out.println("The end of the list has been reached");
            return null;
        } else {
        currentPos = currentPos.next;
        } // if
        return currentPos.info;
    } // getNextItem

    /**
     * Initialize the currentPos variable to null.
     */
    public void resetList() {
        currentPos = null;
    } // resetList

    /**
     * Prints the list.
     */
    public void printList() {
        NodeType position = head;
        while (position != null) {
            System.out.print(position.info.getValue() + " ");
            position = position.next;
        } // while
        System.out.println();
    } // printList

    /**
     * Merges two lists and doesn't include any duplicate items in the list.
     */
    public void mergeList(SortedLinkedList list2) {
        NodeType position2 = list2.head;
        while (position2 != null) {
            insertItem(position2.info);
            position2 = position2.next;
        } //while
    } // mergeList

    /**
     * Deletes alternate nodes from the list.
     */
    public void deleteAlt() {
        if (head == null) {
            System.out.println("You can't delete from an empty list");
        } // if

        NodeType temp = head;
        while (temp != null && temp.next != null) {
            NodeType delete = temp.next;
            temp.next = delete.next;
            delete.next = null;
            temp = temp.next;
        } // while

    } // deleteAlt

    /**
     * Finds the common elements between input list and original list,
     * and then prints the results.
     */
    public void intersect(SortedLinkedList list2) {

        NodeType current = head;

        while (current != null) {
            boolean found = false;
            NodeType secondCurrent = list2.head;
            while (secondCurrent != null) {
                if (current.info.compareTo(secondCurrent.info) == 0) {
                    found = true;
                    break;
                } // if
                secondCurrent = secondCurrent.next;
            } // while


            if (!found) {
                deleteItem(current.info);
            } // if
            current = current.next;
        } // while
    } // intersect

} // SortedLinkedList
