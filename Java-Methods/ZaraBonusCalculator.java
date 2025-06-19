package Methods;
public class ZaraBonusCalculator {
    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData();
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
        printSummary(employeeData, updatedData);
    }

    public static double[][] generateEmployeeData() {
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double salary = 10000 + Math.random() * 90000;
            int years = (int)(Math.random() * 11);
            data[i][0] = Math.round(salary);
            data[i][1] = years;
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(double[][] originalData) {
        double[][] result = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double salary = originalData[i][0];
            int years = (int) originalData[i][1];
            double bonusPercent = years > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusPercent;
            double newSalary = salary + bonus;
            result[i][0] = Math.round(bonus);
            result[i][1] = Math.round(newSalary);
        }
        return result;
    }

    public static void printSummary(double[][] original, double[][] updated) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Emp\tOld Salary\tYears\tBonus\t\tNew Salary");
        for (int i = 0; i < 10; i++) {
            double oldSalary = original[i][0];
            int years = (int) original[i][1];
            double bonus = updated[i][0];
            double newSalary = updated[i][1];

            System.out.printf("%d\t%.2f\t\t%d\t%.2f\t\t%.2f\n",
                    (i + 1), oldSalary, years, bonus, newSalary);

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("Total\t%.2f\t\t\t%.2f\t\t%.2f\n",
                totalOldSalary, totalBonus, totalNewSalary);
    }
}
