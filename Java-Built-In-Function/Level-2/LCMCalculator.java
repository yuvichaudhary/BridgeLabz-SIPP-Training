package BuiltInFunction;

	import java.util.Scanner;
	public class LCMCalculator {
	    public static void main(String[] args) {
	        int[] numbers = getNumbers();
	        int gcd = computeGCD(numbers[0], numbers[1]);
	        int lcm = computeLCM(numbers[0], numbers[1], gcd);

	        System.out.println("GCD: " + gcd);
	        System.out.println("LCM: " + lcm);
	    }

	    static int[] getNumbers() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();
	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();
	        return new int[]{a, b};
	    }

	    static int computeGCD(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }

	    static int computeLCM(int a, int b, int gcd) {
	        return (a * b) / gcd;
	    }
	}

