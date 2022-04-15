public class OrderItem implements Ordering {
    private MenuItem item;
    private int orderedQty = 0;


    public OrderItem(MenuItem Item, int qty) throws Exception {
        this.item = item;
        this.setOrderedQty(qty);
    }

    public void setOrderedQty(int qty) throws Exception {
        if (qty <= 0) {
            throw new Exception();
        }
        orderedQty = qty;
    }

    public int getOrderedQty() {
        return orderedQty;
    }

    public void showOrderedItemInfo() {

    }

    public double getTotal() {
        double totalPrice = 0;
        totalPrice = getOrderedQty();
        return totalPrice;
    }
}