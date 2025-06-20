package BuiltInFunction;
	import java.util.Scanner;

	public class RecursiveFactorial {
	    public static void main(String[] args) {
	        int num = getInput();
	        long fact = factorial(num);
	        displayResult(num, fact);
	    }

	    static int getInput() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        return sc.nextInt();
	    }

	    static long factorial(int n) {
	        if (n <= 1) return 1;
	        return n * factorial(n - 1);
	    }

	    static void displayResult(int num, long result) {
	        System.out.println("Factorial of " + num + " is " + result);
	    }
	}

