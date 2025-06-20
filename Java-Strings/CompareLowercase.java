package String;

import java.util.Scanner;

public class CompareLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String manual = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch += 32; 
            }
            manual += ch;
        }

        String builtin = text.toLowerCase();

        boolean isEqual = manual.equals(builtin);

        System.out.println("Manual lowercase:  " + manual);
        System.out.println("Built-in lowercase: " + builtin);
        System.out.println("Are both same?      " + isEqual);

        sc.close();
    }
}
