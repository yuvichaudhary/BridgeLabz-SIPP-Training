package fundamental;
import java.util.Scanner;
public class CheckAgeForVote {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the Age: ");
        int Age = input.nextInt();
        if (Age >= 18) {
        	 System.out.println("The person's age is " + Age + " and can vote.");
        } else {
            System.out.println("The person's age is " + Age + " and cannot vote.");
        }
        input.close();
	}

}
