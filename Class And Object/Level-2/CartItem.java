package Oops.ObjectAndClass;

public class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotal() {
        return price * quantity;
    }


    static class ShoppingCart {
        CartItem[] items = new CartItem[10];
        int count = 0;

        void addItem(CartItem item) {
            items[count++] = item;
        }

        void removeItem(String name) {
            for (int i = 0; i < count; i++) {
                if (items[i].itemName.equals(name)) {
                    items[i] = items[--count];  // Replace with last and reduce count
                    System.out.println(name + " removed.");
                    return;
                }
            }
            System.out.println(name + " not found.");
        }

        void displayTotal() {
            double total = 0;
            for (int i = 0; i < count; i++) {
                total += items[i].getTotal();
            }
            System.out.println("Total: ₹" + total);
        }
    }
        public static void main(String[] args) {
            ShoppingCart cart = new ShoppingCart();
            cart.addItem(new CartItem("Pen", 10.0, 2));
            cart.addItem(new CartItem("Notebook", 50.0, 1));
            cart.displayTotal();

            cart.removeItem("Pen");
            cart.displayTotal();
        }
    }
