package Methods;
import java.util.*;
public class NumberAnalysis {
    public static boolean isPositive(int number){
        return number>=0;
    }
    public static boolean isEven(int number){
        return number%2 ==0;
    }
    public static int compare(int number1,int number2){
        if(number1>number2)return 1;
        if(number1==number2)return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] number = new int[5];
        System.out.println("Enter five integers");
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        for (int i = 0; i < number.length; i++) {
            int num = number[i];
            System.out.println("number " + num + " is:");

            if (isPositive(num)) {
                System.out.println("Positive and ");
                if (isEven(num)) {
                    System.out.println("Even.");
                } else {
                    System.out.println("odd.");
                }
            }
            else{
                    System.out.println("Negative");
                }
        }
            int result = compare(number[0],number[4]);
            System.out.println("Comparison between First and last number");
            if(result == 1){
                System.out.println("First is greater");
            } else if(result == 0){
                System.out.println("Both are equals");
            }else{
                System.out.println("Last is greater");
            }
        sc.close();
    }
}