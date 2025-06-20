package String;
import java.util.Scanner;
public class CompareString {

	    public static boolean compareUsingCharAt(String str1, String str2) {
	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        for (int i = 0; i < str1.length(); i++) {
	            if (str1.charAt(i) != str2.charAt(i)) {
	                return false; 
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the first string: ");
	        String string1 = scanner.next();

	        System.out.print("Enter the second string: ");
	        String string2 = scanner.next();
	        boolean resultFromCharAt = compareUsingCharAt(string1, string2);
	        boolean resultFromEquals = string1.equals(string2);
	        System.out.println("Comparison using charAt(): " + resultFromCharAt);
	        System.out.println("Comparison using equals(): " + resultFromEquals);

	        if (resultFromCharAt == resultFromEquals) {
	            System.out.println("Both comparison methods give the same result.");
	        } else {
	            System.out.println("Mismatch between charAt() method and equals() method!");
	        }

	        scanner.close();
	    }
	}


