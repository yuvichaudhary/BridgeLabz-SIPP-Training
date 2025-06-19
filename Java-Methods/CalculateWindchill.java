package Methods;
import java.util.Scanner;
public class CalculateWindchill {
    public static double calculateWindChill(double temperature, double windSpeed){
        return 35.74 +(0.6215*temperature)+(0.4275*temperature-35.75)*Math.pow(windSpeed,0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature");
        double temperature = sc.nextDouble();
        System.out.println("Enter windspeed");
        double windspeed = sc.nextDouble();
        double WindChill = calculateWindChill(temperature,windspeed);
        System.out.println("The Windchill is "+WindChill+" for "+temperature+" and  "+windspeed);
        sc.close();
    }
}