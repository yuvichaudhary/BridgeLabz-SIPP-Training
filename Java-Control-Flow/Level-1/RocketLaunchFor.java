package fundamental;

import java.util.Scanner;

public class RocketLaunchFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start value: ");
        int counter = sc.nextInt();

        for (; counter >= 1; counter--) {
            System.out.println(counter);
        }
        System.out.println("Liftoff!");
        sc.close();
    }
}