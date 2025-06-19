package Methods;
import java.util.Random;
public class FootballTeamHeights {

    public static int[] generateHeights(int size) {
        Random rand = new Random();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = rand.nextInt(101) + 150; // range 150–250
        }
        return heights;
    }

    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double calculateMean(int[] heights) {
        return (double) calculateSum(heights) / heights.length;
    }

    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);

        System.out.print("Player Heights (cm): ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        int sum = calculateSum(heights);
        double mean = calculateMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Total Height: " + sum + " cm");
        System.out.println("Mean Height: " + String.format("%.2f", mean) + " cm");
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
    }
}
