package Methods;
public class NumberCheckor {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    public static boolean isSpy(int num) {
        int sum = 0, product = 1, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int num) {
        int square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    public static boolean isBuzz(int num) {
        return (num % 7 == 0 || num % 10 == 7);
    }

    public static void main(String[] args) {
        int[] testNumbers = {2, 9, 1124, 5, 27};

        System.out.println("Number Checker Results:\n");

        for (int num : testNumbers) {
            System.out.println("Number: " + num);
            System.out.println("Prime? " + isPrime(num));
            System.out.println("Neon? " + isNeon(num));
            System.out.println("Spy? " + isSpy(num));
            System.out.println("Automorphic? " + isAutomorphic(num));
            System.out.println("Buzz? " + isBuzz(num));
            System.out.println("------------------------------");
        }
    }
}
