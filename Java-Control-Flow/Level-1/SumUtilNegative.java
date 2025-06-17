package fundamental;
import java.util.Scanner;

public class SumUtilNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0, num;

        System.out.print("Enter numbers (negative or zero to stop): ");
        while (true) {
            num = sc.nextDouble();
            if (num <= 0) break;
            total += num;
        }
        System.out.println("Total Sum: " + total);
        sc.close();
    }
}