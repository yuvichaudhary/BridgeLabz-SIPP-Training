package Methods;
import java.util.Scanner;
public class FriendsCamparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i]);
            System.out.print("Age: ");
            ages[i] = scanner.nextInt();
            System.out.print("Height (in cm): ");
            heights[i] = scanner.nextDouble();
        }

        String youngest = findYoungest(names, ages);
        String tallest = findTallest(names, heights);

        System.out.println("\nYoungest friend: " + youngest);
        System.out.println("Tallest friend: " + tallest);
    }

    public static String findYoungest(String[] names, int[] ages) {
        int minAge = ages[0];
        int index = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                index = i;
            }
        }
        return names[index];
    }

    public static String findTallest(String[] names, double[] heights) {
        double maxHeight = heights[0];
        int index = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                index = i;
            }
        }
        return names[index];
    }
}
