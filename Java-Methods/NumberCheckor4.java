package Methods;
import java.util.Scanner;
public class NumberCheckor4{
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

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrongNumber(int num, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == num;
    }

    public static void findLargestAndSecondLargest(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2 && digit != max1) {
                max2 = digit;
            }
        }
        System.out.println("Largest: " + max1);
        System.out.println("Second Largest: " + (max2 == Integer.MIN_VALUE ? "Not found" : max2));
    }

    public static void findSmallestAndSecondSmallest(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < min1) {
                min2 = min1;
                min1 = digit;
            } else if (digit < min2 && digit != min1) {
                min2 = digit;
            }
        }
        System.out.println("Smallest: " + min1);
        System.out.println("Second Smallest: " + (min2 == Integer.MAX_VALUE ? "Not found" : min2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = countDigits(num);
        int[] digits = getDigitsArray(num);

        System.out.println("Total Digits: " + count);
        System.out.print("Digits Array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        System.out.println("Duck Number? " + isDuckNumber(digits));
        System.out.println("Armstrong Number? " + isArmstrongNumber(num, digits));

        findLargestAndSecondLargest(digits);
        findSmallestAndSecondSmallest(digits);
    }
}
