package Constructor;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    public HotelBooking() {
        this.guestName = "Anky";
        this.roomType = "Standard";
        this.nights = 1;
    }
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
    public static void main(String[] args) {
        HotelBooking defaultBooking = new HotelBooking();
        HotelBooking customBooking = new HotelBooking("Yuvi", "Deluxe", 3);
        HotelBooking copiedBooking = new HotelBooking(customBooking);
        System.out.println("Default Booking: " + defaultBooking.guestName + ", Room: " +
                defaultBooking.roomType + ", Nights: " + defaultBooking.nights);
        System.out.println("Custom Booking: " + customBooking.guestName + ", Room: " +
                customBooking.roomType + ", Nights: " + customBooking.nights);
        System.out.println("Copied Booking: " + copiedBooking.guestName + ", Room: " +
                copiedBooking.roomType + ", Nights: " + copiedBooking.nights);
    }
}