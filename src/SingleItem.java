public class SingleItem extends MenuItem {
    public SingleItem(String name, double price) {
        super(name, price);
    }

    public String showInfo() {
        return "[Category] [Item Name][Qty] [Price]";
    }

    public String toString() {
        return showInfo();
    }

}
