package BuiltInFunction;
import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        int[] numbers = getInputs();
        int max = findMax(numbers[0], numbers[1], numbers[2]);
        System.out.println("The maximum value is: " + max);
    }

    static int[] getInputs() {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        System.out.print("Enter first number: ");
        nums[0] = sc.nextInt();
        System.out.print("Enter second number: ");
        nums[1] = sc.nextInt();
        System.out.print("Enter third number: ");
        nums[2] = sc.nextInt();
        return nums;
    }

    static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}

