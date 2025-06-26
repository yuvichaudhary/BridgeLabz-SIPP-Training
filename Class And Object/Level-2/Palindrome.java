package Oops.ObjectAndClass;
public class Palindrome {
    String text;

    public Palindrome(String text) {
        this.text = text;
    }
    public boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }

    public void displayResult() {
        if (isPalindrome())
            System.out.println("'" + text + "' is a palindrome.");
        else
            System.out.println("'" + text + "' is not a palindrome.");
    }
    public static void main(String[] args) {
        Palindrome checker = new Palindrome("oppo");
        checker.displayResult();
    }
}