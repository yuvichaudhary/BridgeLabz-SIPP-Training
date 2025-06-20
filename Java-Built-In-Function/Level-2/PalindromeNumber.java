package BuiltInFunction;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        String text = getInput();
        boolean isPalin = isPalindrome(text);
        displayResult(text, isPalin);
    }

    static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.nextLine().toLowerCase().replaceAll("[^a-z0-9]", "");
    }

    static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) return false;
        }
        return true;
    }

    static void displayResult(String original, boolean result) {
        if (result)
            System.out.println("It's a palindrome.");
        else
            System.out.println("Not a palindrome.");
    }
}
