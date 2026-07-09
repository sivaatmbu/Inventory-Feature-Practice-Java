package Inventory;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private String storeName;
    private List<Item> items;
    public Store(String storeName) {
        this.storeName = storeName;
        this.items = new ArrayList<>();
    }
    public void addItem(Item item) {
        items.add(item);
    }
    public void showItems() {
        System.out.println("\n------ INVENTORY ------");
        for (Item item : items) {
            System.out.println(item);
        }
    }
    public void purchaseItem(String itemName, int requiredQuantity) {
        for (Item item : items) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                if (item.isOutOfStock()) {
                    System.out.println(itemName + " is Out Of Stock.");
                    return;
                }
                if (requiredQuantity > item.getQuantity()) {
                    System.out.println("Only " + item.getQuantity() + " " + itemName + " available.");
                    return;
                }
                item.reduceQuantity(requiredQuantity);
                System.out.println(requiredQuantity + " " + itemName + " purchased successfully.");
                if (item.isOutOfStock()) {
                    System.out.println(itemName + " is now Out Of Stock.");
                }
                return;
            }
        }
        System.out.println("Item Not Found.");
    }
    public void restockItem(String itemName, int quantity) {
        for (Item item : items) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                item.increaseQuantity(quantity);
                System.out.println(itemName + " restocked successfully.");
                return;
            }
        }
        System.out.println("Item Not Found.");
    }
    public void showItemsToRestock() {
        System.out.println("\nItems To Restock");
        boolean found = false;
        for (Item item : items) {
            if (item.getQuantity() < 5) {
                System.out.println(item);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No items need restocking.");
        }
    }
}