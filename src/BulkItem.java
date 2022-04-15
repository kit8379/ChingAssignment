public class BulkItem extends MenuItem {
    private char[] PACKAGE_SIZE = {'S', 'M', 'L'};
    private char size;

    public BulkItem(String name, double price, char size) {
        super(name, price);
        setSize(size);
    }

    public int getQtyBySize(char size) {
        int qty = 0;
        for (int i = 0; i < PACKAGE_SIZE.length; i++) {
            if (PACKAGE_SIZE[i] == 'S') {
                qty = 20;
            } else if (PACKAGE_SIZE[i] == 'M') {
                qty = 50;
            } else if (PACKAGE_SIZE[i] == 'L') {
                qty = 100;
            }
        }
        return qty;
    }

    public String showInfo() {
        return "[Category] [Item Name][Qty] [Price][Size]";
    }

    public String toString() {
        return showInfo();
    }

    public void setSize(char size) {
        try {
            if (size == 'S' || size == 'M' || size == 'L') {
                this.size = size;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Wrong Size");
        }

    }

    public char getSize() {
        return this.size;
    }
}
