public class InventoryItem {
    private String name;
    private int id;
    private int quantity;
    private int minQuantity;

    public InventoryItem(String name, int id, int quantity, int minQuantity) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.minQuantity = minQuantity;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void updateQuantity(int amount) {
        this.quantity += amount;
    }

    public boolean isBelowMinimum() {
        return quantity < minQuantity;
    }

    public void printInfo() {
        System.out.println("Položka: " + name + ", ID: " + id + ", Množství: " + quantity + ", Minimum: " + minQuantity);
    }
}