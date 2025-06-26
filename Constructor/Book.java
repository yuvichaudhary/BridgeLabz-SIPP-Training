package Constructor;

public class Book {
    String title;
    String author;
    double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public static void main(String[] args) {
        Book book1 = new Book("A","B",100);
        Book book2 = new Book("A", "B",200);

        System.out.println("Book 1 : Title: " + book1.title + ", Author: " + book1.author + ", Price: ₹" + book1.price);
        System.out.println("Book 2 : Title: " + book2.title + ", Author: " + book2.author + ", Price: ₹" + book2.price);
    }

}