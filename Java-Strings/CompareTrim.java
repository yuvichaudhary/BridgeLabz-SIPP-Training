package String;

import java.util.Scanner;

public class CompareTrim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with spaces: ");
        String text = sc.nextLine();
        int start = 0;
        while (start < text.length() && text.charAt(start) == ' ') {
            start++;
        }

        int end = text.length() - 1;
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        String manual = "";
        for (int i = start; i <= end; i++) {
            manual += text.charAt(i);
        }
        String builtin = text.trim();
        boolean same = manual.equals(builtin);
        System.out.println("Manual trim:   \"" + manual + "\"");
        System.out.println("Built-in trim: \"" + builtin + "\"");
        System.out.println("Are both same? " + same);

        sc.close();
    }
}