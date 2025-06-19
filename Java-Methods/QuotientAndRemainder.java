package Methods;
import java.util.*;
public class QuotientAndRemainder {
    public static int[] FindQuotientAndRemainder(int number, int divisor){
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] {remainder, quotient};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend");
        int number = sc.nextInt();
        System.out.println("Enter the divisor");
        int divisor = sc.nextInt();
        if(divisor == 0){
            System.out.println("Division by zero is not allowed");
        }else{
            int[] result = FindQuotientAndRemainder(number,divisor);
            System.out.println("The quotient is "+result[1]);
            System.out.println("The remainder is "+result[0]);
        }
    }

}