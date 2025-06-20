package String;

import java.util.Random;
import java.util.Scanner;

	public class GradeCalculator {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of students: ");
	        int n = sc.nextInt();

	        int[][] marks = new int[n][3];
	        int[] total = new int[n];
	        double[] percent = new double[n];
	        String[] grade = new String[n];

	        Random rand = new Random();
	        for (int i = 0; i < n; i++) {
	            marks[i][0] = rand.nextInt(41) + 60;
	            marks[i][1] = rand.nextInt(41) + 60;
	            marks[i][2] = rand.nextInt(41) + 60;

	            total[i] = marks[i][0] + marks[i][1] + marks[i][2];
	            percent[i] = Math.round((total[i] / 300.0) * 10000) / 100.0;
	            grade[i] = getGrade(percent[i]);
	        }
	        System.out.println("");
	        System.out.println("-------------------------------------------------------");
	        for (int i = 0; i < n; i++) {
	            System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\t%s\n",
	                    (i + 1), marks[i][0], marks[i][1], marks[i][2],
	                    total[i], percent[i], grade[i]);
	        }
	    }
	    public static String getGrade(double p) {
	        if (p >= 90) return "A+";
	        else if (p >= 80) return "A";
	        else if (p >= 70) return "B";
	        else if (p >= 60) return "C";
	        else if (p >= 50) return "D";
	        else return "F";
	    }
	}
