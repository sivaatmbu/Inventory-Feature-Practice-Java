package Inventory;

public class Item {
    private int itemId;
    private String itemName;
    private double price;
    private int quantity;
    public Item(int itemId, String itemName, double price, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public int getItemId() {
        return itemId;
    }
    public String getItemName() {
        return itemName;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    // Purchase
    public void reduceQuantity(int quantity) {
        this.quantity -= quantity;
    }
    // Restock
    public void increaseQuantity(int quantity) {
        this.quantity += quantity;
    }
    public boolean isOutOfStock() {
        return quantity == 0;
    }
    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}