package Methods;
import java.util.*;
public class UnitConvertor2 {
    public static double convertFarhenheitToCelsius(double farhenheit) {
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit * farhenheit2celsius;
    }

    public static double convertCelciusToFarhenheit(double celcius) {
        double celsius2farhenheit = (celcius * 9 / 5) + 32;
        return celcius * celsius2farhenheit;
    }

    public static double convertPoundToKilograms(double pound) {
        double pounds2kilograms = 0.453592;
        return pound * pounds2kilograms;
    }

    public static double convertKilogramsToPound(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonToLiters(double gallon) {
        double gallons2liters = 3.78541;
        return gallon * gallons2liters;
    }

    public static double convertLitersToGallon(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }    
        public static void main (String[] args){
            System.out.println("98.6°F to Celsius: " + convertFarhenheitToCelsius(98.6));
            System.out.println("37°C to Fahrenheit: " + convertCelciusToFarhenheit(37));
            System.out.println("150 pounds to kg: " + convertPoundToKilograms(150));
            System.out.println("68 kg to pounds: " + convertKilogramsToPound(68));
            System.out.println("10 gallons to liters: " + convertGallonToLiters(10));
            System.out.println("15 liters to gallons: " + convertLitersToGallon(15));
        }

}