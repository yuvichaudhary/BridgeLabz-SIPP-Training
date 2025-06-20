package String;
import java.util.Scanner;

public class CompareCharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();

        char[] builtIn = input.toCharArray();
        char[] manual = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            manual[i] = input.charAt(i);
        }
        boolean same = true;
        for (int i = 0; i < input.length(); i++) {
            if (manual[i] != builtIn[i]) {
                same = false;
                break;
            }
        }
        System.out.println("Built-in array:  " + String.valueOf(builtIn));
        System.out.println("Manual array:    " + String.valueOf(manual));
        System.out.println("Are both equal?  " + same);

        sc.close();
    }
}