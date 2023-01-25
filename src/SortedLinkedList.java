import ItemType;
import NodeType;
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
        newNode.info = item.copy();
//        NodeType pred

    } // insertItem

    /**
     * Removes the node in the list that contains an item equal to item.
     * @param item the item to be deleted.
     */
    public void deleteItem(ItemType item) {

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

    } // getNextItem

    /**
     * Initialize the currentPos variable to null.
     */
    public void resetList() {

    } // resetList

} // SortedLinkedList
