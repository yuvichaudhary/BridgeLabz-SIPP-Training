package Methods;
import java.util.Scanner;
public class SimpleInterestCalculator {
    public static double SimpleInterestCal(double principal,double rate,double time){
        return (principal*rate*time);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal");
        double principal = sc.nextDouble();
        System.out.println("Enter rate");
        double rate = sc.nextDouble();
        System.out.println("Enter time");
        double time = sc.nextDouble();
        double SimpleInterest = SimpleInterestCal(principal,rate,time);
        System.out.println("The Simple Interest is " + SimpleInterest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);
    }
}
