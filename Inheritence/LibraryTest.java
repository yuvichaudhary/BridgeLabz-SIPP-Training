package Inheritence;
class Book {
         String title;
         int publicationYear;

         Book(String title, int publicationYear) {
             this.title = title;
             this.publicationYear = publicationYear;
         }

         void displayInfo() {
             System.out.println("Title: " + title);
             System.out.println("Publication Year: " + publicationYear);
         }
     }

     class Author extends Book {
         String name;
         String bio;

         Author(String title, int publicationYear, String name, String bio) {
             super(title, publicationYear);
             this.name = name;
             this.bio = bio;
         }

         void displayInfo() {
             super.displayInfo();
             System.out.println("Author Name: " + name);
             System.out.println("Bio: " + bio);
         }
     }
     public class LibraryTest {
         public static void main(String[] args) {
             Author book = new Author("The X-Fctor", 2020, "Yuvi", "Writes tech thrillers with a sci-fi twist.");
             book.displayInfo();
         }
     }

