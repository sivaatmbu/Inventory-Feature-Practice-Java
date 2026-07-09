package Inventory;

public class Main {

    public static void main(String[] args) {

        Store store = new Store("Fresh Mart");

        store.addItem(new Item(1, "Milk", 50, 20));
        store.addItem(new Item(2, "Bread", 40, 15));
        store.addItem(new Item(3, "Eggs", 8, 3));
        store.addItem(new Item(4, "Rice", 70, 0));

        store.showItems();

        System.out.println();

        store.purchaseItem("Milk", 5);

        store.purchaseItem("Rice", 2);

        store.purchaseItem("Eggs", 5);

        store.purchaseItem("Bread", 15);

        store.showItems();

        store.showItemsToRestock();

        store.restockItem("Rice", 20);

        store.restockItem("Eggs", 15);

        store.showItems();
    }
}