package cs2720.list;

import cs2720.list.ItemType;
import cs2720.list.NodeType;

public class SortedLinkedList {

    private NodeType head;
    private NodeType currentPos;

    int length = 0;

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

        NodeType currentPos = head;
        while (currentPos != null) {
            length++;
            currentPos = currentPos.link;
        }
        return length;

    } // getLength

    /**
     * Inserts an item into the linked list while maintaining the ascending sorted order.
     * @param item the item to be inserted.
     */
    public void insertItem(ItemType item) {

        NodeType newNode = new NodeType();

        // If the list is empty, it creates a node that stores the item and sets the head to it.
        if (head == null) {

            newNode.item = item;
            newNode.next = null;
            head = newNode;

            //If the item is less than 0,
        } else if (item.compareTo(head.item) < 0) {

            newNode.item = item;
            newNode.next = head;
            head = newNode;
        } else {
            NodeType predloc;

        }


    } // insertItem

    /**
     * Removes the node in the list that contains an item equal to item.
     * @param item the item to be deleted.
     */
    public void deleteItem(ItemType item) {

        // Tells the user they can't delete from an empty list
        if (head == null) {
            System.out.println("You can't delete from an empty list";
            } // If there's only one node, it makes the node empty
            else if (head.getNextItem() == null && item.compareTo(head) == 0) {
                head = null;
            } //
            else if (

    } // deleteItem

    /**
     * Searchs the linked list for an item and returns its index.
     * @param item the item to search for.
     */
    public int searchItem(ItemType item) {

    } // searchItem

    /**
     * Returns the next item in the list pointed by the currentPos.
     */
    public ItemType getNextItem() {

        // Tells the user that the list is empty
        if (head == null) {
            System.out.println("The list is empty");
        }

    } // getNextItem

    /**
     * Initialize the currentPos variable to null.
     */
    public void resetList() {

    } // resetList

} // SortedLinkedList
