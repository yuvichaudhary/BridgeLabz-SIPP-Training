package Inheritence;

class Order {
         int orderId;
         String orderDate;

         Order(int orderId, String orderDate) {
             this.orderId = orderId;
             this.orderDate = orderDate;
         }

         String getOrderStatus() {
             return "Order placed";
         }

         void displayInfo() {
             System.out.println("Order ID: " + orderId);
             System.out.println("Order Date: " + orderDate);
             System.out.println("Status: " + getOrderStatus());
         }
     }

     class ShippedOrder extends Order {
         String trackingNumber;

         ShippedOrder(int orderId, String orderDate, String trackingNumber) {
             super(orderId, orderDate);
             this.trackingNumber = trackingNumber;
         }

         String getOrderStatus() {
             return "Order shipped";
         }

         void displayInfo() {
             super.displayInfo();
             System.out.println("Tracking Number: " + trackingNumber);
         }
     }

     class DeliveredOrder extends ShippedOrder {
         String deliveryDate;

         DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
             super(orderId, orderDate, trackingNumber);
             this.deliveryDate = deliveryDate;
         }

         String getOrderStatus() {
             return "Order delivered on " + deliveryDate;
         }

         void displayInfo() {
             super.displayInfo();
             System.out.println("Delivery Date: " + deliveryDate);
             System.out.println("Status: " + getOrderStatus());
         }
     }
     public class OrderTest {
         public static void main(String[] args) {
             DeliveredOrder order = new DeliveredOrder(101, "2025-07-01", "TRK12345", "2025-07-03");
             order.displayInfo();
         }
     }

