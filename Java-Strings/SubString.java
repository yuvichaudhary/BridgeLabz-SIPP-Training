package String;
import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String builtIn = text.substring(start, end);
        String manual = "";
        for (int i = start; i < end; i++) {
            manual += text.charAt(i);
        }
        System.out.println("Built-in substring: " + builtIn);
        System.out.println("Manual substring: " + manual);
        System.out.println("Are both equal? " + builtIn.equals(manual));

        sc.close();
    }
}