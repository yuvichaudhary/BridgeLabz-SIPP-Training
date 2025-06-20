package BuiltInFunction;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int terms = getTerms();
        printFibonacci(terms);
    }

    static int getTerms() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        return sc.nextInt();
    }

    static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
