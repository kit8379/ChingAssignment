public class Order {
    public final static int MAX_NO_ITEM_PER_ORDER = 10;
    private OrderItem[] orderedItems;
    private int noOfItemOrdered = 0;

    public Order() {
        this.orderedItems = new OrderItem[MAX_NO_ITEM_PER_ORDER];
        this.noOfItemOrdered = 0;
    }

    public Order(int size) {
        this.noOfItemOrdered = 0;
        this.orderedItems = new OrderItem[size];
    }

    public int getNumOfOrderedItem() {
        return noOfItemOrdered;
    }

    public OrderItem[] getOrderedItems() {
        return orderedItems;
    }

    public void addItem(OrderItem item) {
        orderedItems[noOfItemOrdered] = item;
        noOfItemOrdered++;
    }

    public double getGrandTotal() {
        double total = 0;
        for (int i = 0; i < getNumOfOrderedItem(); i++) {
            total += this.getOrderedItems()[i].getTotal();
        }
        return total;
    }

}


