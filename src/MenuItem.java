public abstract class MenuItem {
    private String name;
    private double price;
    private int qty;

    public MenuItem(String name, double price) {
        setName(name);
        setPrice(price);
    }

    public String showInfo() {
       return "[Category][Item Name][Price]";
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return this.price;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public int getQty() {
        return this.qty;
    }
}
