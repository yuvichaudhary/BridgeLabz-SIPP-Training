package String;

import java.util.Scanner;

public class StringLength {

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); 
                count++;
            }
        } catch (Exception e) {
        	
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.next();

        int myLength = getLength(input);
        System.out.println("Length using custom method: " + myLength);
        System.out.println("Length using built-in method: " + input.length());
    }
}