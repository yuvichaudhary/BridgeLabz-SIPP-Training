package String;

import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("\nCharacter\tType");
        System.out.println("-----");

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String type = getType(ch);
            System.out.println("   " + ch + "\t\t" + type);
        }
    }

    public static String getType(char ch) {
        ch = Character.toLowerCase(ch);

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return "Vowel";
            else
                return "Consonant";
        } else {
            return "Not a Letter";
        }
    }
}