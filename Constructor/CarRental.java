package Constructor;
public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 1000.0;

    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Generic";
        this.rentalDays = 1;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }
    public static void main(String[] args) {
        CarRental defaultRental = new CarRental();
        CarRental customRental = new CarRental("Yuvi", "Jaquar Pace", 5);

        System.out.println("Default Rental - Customer: " + defaultRental.customerName +
                ", Car: " + defaultRental.carModel +
                ", Days: " + defaultRental.rentalDays +
                ", Total: ₹" + defaultRental.calculateTotalCost());

        System.out.println("Custom Rental  - Customer: " + customRental.customerName +
                ", Car: " + customRental.carModel +
                ", Days: " + customRental.rentalDays +
                ", Total: ₹" + customRental.calculateTotalCost());
    }
}