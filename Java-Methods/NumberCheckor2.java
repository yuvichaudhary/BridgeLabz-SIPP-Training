package Methods;
import java.util.Arrays;
public class NumberCheckor2{
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigitsArray(int num) {
        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(int num) {
        int[] digits = getDigitsArray(num);
        int[] reversed = reverseArray(digits);
        return arraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int num) {
        int[] digits = getDigitsArray(num);
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] testNumbers = {121, 1230, 707, 0, 1002};

        for (int num : testNumbers) {
            int[] digits = getDigitsArray(num);
            int[] reversed = reverseArray(digits);

            System.out.println("Number: " + num);
            System.out.println("Count of Digits: " + countDigits(num));
            System.out.println("Digits Array: " + Arrays.toString(digits));
            System.out.println("Reversed Digits: " + Arrays.toString(reversed));
            System.out.println("Is Palindrome? " + isPalindrome(num));
            System.out.println("Is Duck Number? " + isDuckNumber(num));
            System.out.println("-----------------------------");
        }
    }
}
