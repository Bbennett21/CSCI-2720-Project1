package cs2720.list;

public class ItemType {

    private int value;

    /**
     * Compares the value of item with the current object's value.
     * @param item the item to be compared with.
     */
    int compareTo(ItemType item) {
        if (this.value < item.getValue()) {
            return -1;
        } else if (this.value == item.getValue()) {
            return 0;
        } else {
            return 1;
        } // if
    } // compareTo

    /**
     * Returns the value of instance variable.
     */
    int getValue() {
        return this.value;
    } //getValue

    /**
     * Initializes the data member by variable num.
     * @param num The int val is initialized to.
     */
    void initialize(int num) {
        this.value = num;
    } // initialize

} // ItemType
