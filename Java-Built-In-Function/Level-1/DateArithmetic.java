package BuiltInFunction;
	import java.time.LocalDate;

	public class DateArithmetic {
	    public static void main(String[] args) {
	        LocalDate date = LocalDate.of(2023, 4, 5); // Example input
	        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
	        System.out.println("Final Date: " + result);
	    }
	}

