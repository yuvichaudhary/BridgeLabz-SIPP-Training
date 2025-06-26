package Oops.ObjectAndClass;

public class Item{
        int itemCode;
        String itemName;
        double price;

        void displayItem(int quantity) {
            System.out.println("Item Code: " + itemCode);
            System.out.println("Item Name: " + itemName);
            System.out.println("Unit Price: ₹" + price);
            System.out.println("Total Cost for " + quantity + ": ₹" + (price * quantity));
        }
        public static void main(String[] args) {
            Item item = new Item();
            item.itemCode = 2001;
            item.itemName = "Notebook";
            item.price = 45.5;
            item.displayItem(3);
        }
    }

