package fundamental;
import java.util.Scanner;
public class SumOfNaturalLoop{

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a natural number: ");
	        int n = scanner.nextInt();
	        
	        if (n <= 0) {
	            System.out.println("Please enter a positive natural number.");
	        } else {
	            int formulaSum = (n * (n + 1)) / 2;

	          
	            int loopSum = 0;
	            for (int i = 1; i <= n; i++) {
	                loopSum += i;
	            }
	            System.out.println("Sum using formula: " + formulaSum);
	            System.out.println("Sum using for loop: " + loopSum);
	        }
	        
	        scanner.close();
	    }
}
	    




