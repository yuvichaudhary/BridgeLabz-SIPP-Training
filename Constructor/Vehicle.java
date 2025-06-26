package Constructor;
public class Vehicle {
    private static double registrationFee = 5000;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }
    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Hemant", "Car");
        Vehicle vehicle2 = new Vehicle("Yuvi", "Scooter");

        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(6000);
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}