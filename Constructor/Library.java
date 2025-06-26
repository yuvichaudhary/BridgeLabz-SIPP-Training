package Constructor;

public class Library {
    String title;
    String author;
    double price;
    boolean isAvailable;

    public Library(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }
    public void borrowBook() {
        if (isAvailable) {
            System.out.println("Borrowing: " + title);
            isAvailable = false;
        } else {
            System.out.println("Book already borrowed: " + title);
        }
    }
    public static void main(String[] args) {
        Library book = new Library("2000", "A", 100);
        book.borrowBook();
        book.borrowBook();
    }
}
