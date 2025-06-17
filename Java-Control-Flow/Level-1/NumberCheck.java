package fundamental;
import java.util.Scanner;
public class NumberCheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the  number: ");
        int number = input.nextInt();
        if (number > 0) {
        	System.out.println("The Number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        input.close();
	}
}


