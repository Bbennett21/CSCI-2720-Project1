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
        }
        return length;

    } // getLength

    /**
     * Inserts an item into the linked list while maintaining the ascending sorted order.
     * @param item the item to be inserted.
     */
    public void insertItem(ItemType item) {
        NodeType newNode = new NodeType();
        newNode.info = item;
        if(head != null)
            System.out.println(head.info.getValue());
        // If the list is empty, it creates a node that stores the item and sets the head to it.
        if (head == null) {
            head = newNode;
            System.out.println("set head");
        } else if (head.info.compareTo(item) > 0) {
            newNode.next = head;
            head = newNode;
            System.out.println("newhead");
        } else {
            NodeType predloc = null;
            NodeType location = head;
            while (location != null) {
                System.out.println(location.info.getValue());
                if (location.info.compareTo(item) == 0) {
                    System.out.println("Sorry. You cannot insert a duplicate item.");
                    return;
                } else if (location.info.compareTo(item) > 0) {
                    System.out.println("smaller");
                    newNode.next = location;
                    predloc.next = newNode;
                    return;
                } else {
                    System.out.println("move forward");
                    predloc = location;
                    location = location.next;
                } // if
                System.out.println("loop");
            } // while
            System.out.println("end");
            predloc.next = newNode;
        } // if
    } // insertItem

    /**
     * Removes the node in the list that contains an item equal to item.
     * @param item the item to be deleted.
     */
    public void deleteItem(ItemType item) {

        // Tells the user they can't delete from an empty list
        if (head == null) {
            System.out.println("You can't delete from an empty list");
            } // If there's only one node, it makes the node empty
            else if (head.next == null && item.compareTo(head.info) == 0) {
                head = null;
            } //

    } // deleteItem

    /**
     * Searchs the linked list for an item and returns its index.
     * @param item the item to search for.
     */
    public int searchItem(ItemType item) {

        NodeType temp = head;
        if (temp == null) {
            return -1;
        }

        int index = 0;


        while (temp != null) {
            if (item.compareTo(temp.info) == 0) {
                return index;
            }
            index++;
        }




        return -1;
    } // searchItem

    /**
     * Returns the next item in the list pointed by the currentPos.
     */
    public ItemType getNextItem() {

        // Tells the user that the list is empty
        if (head == null) {
            ItemType temp;
            System.out.println("The list is empty");
        }
        if (currentPos.next == null || currentPos == null) {
            currentPos = head;
        }
        else {
            currentPos = currentPos.next;
        }
        return currentPos.info;
    } // getNextItem

    /**
     * Initialize the currentPos variable to null.
     */
    public void resetList() {

        currentPos = null;

    } // resetList

    /**
     * Merges two lists and doesn't include any duplicate items in the list.
     */
    public void merge(int num, String input) {

    }

    /**
     * Deletes alternate nodes from the list.
     */
    public void deleteAlt() {
        if (head == null) {
            System.out.println("You can't delete from an empty list");
        }
        else {
            int index = 1;

        }
    }

    /**
     * Finds the common elements between input list and original list,
     * and then prints the results.
     */
    public void intersect(int num, String input) {

    }

} // SortedLinkedList
