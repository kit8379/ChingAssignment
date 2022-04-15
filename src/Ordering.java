public interface Ordering {

    public void setOrderedQty(int qty) throws Exception;
    public int getOrderedQty();
    public abstract void showOrderedItemInfo();
    public abstract double getTotal();

}
