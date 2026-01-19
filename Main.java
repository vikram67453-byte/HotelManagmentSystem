public class Main {
    public static void main(String[] args) {

        // Create Hotel
        Hotel hotel = new Hotel("Grand Palace");

        // Add Rooms
        hotel.addRoom(new Room(101, 5000));
        hotel.addRoom(new Room(102, 6000));

        // Create Customer
        Customer customer = new Customer("Ali Khan", "35202-1234567-1");

        // Book Room
        Room room = hotel.findAvailableRoom();
        Booking booking = new Booking(room, customer, 3);

        // Billing
        double bill = booking.calculateBill();
        Payment payment = new Payment(bill);

        // Output
        System.out.println("Hotel Name: " + hotel.getName());
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Room Number: " + room.getRoomNumber());
        System.out.println("Total Bill: " + payment.getAmount());

        // Checkout
        booking.checkout();
        System.out.println("Checkout successful");
    }
}
