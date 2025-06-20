package String;
import java.util.Scanner;
public class SplitText {

	    public static String[] manualSplit(String str) {
	        int spaceCount = 0;
	        for (char c : str.toCharArray()) {
	            if (c == ' ') spaceCount++;
	        }

	        String[] words = new String[spaceCount + 1];
	        int wordIndex = 0;
	        String word = "";

	        for (char c : str.toCharArray()) {
	            if (c != ' ') {
	                word += c;
	            } else {
	                words[wordIndex++] = word;
	                word = "";
	            }
	        }
	        words[wordIndex] = word;
	        return words;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a sentence:");
	        String input = sc.nextLine();

	        String[] builtIn = input.split(" ");
	        String[] manual = manualSplit(input);

	        System.out.println("\nBuilt-in split:");
	        for (String s : builtIn) System.out.println(s);

	        System.out.println("\nManual split:");
	        for (String s : manual) System.out.println(s);
	    }
	}
