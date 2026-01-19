public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel("Grand Palace");

        hotel.addRoom(new Room(101, 5000));
        hotel.addRoom(new Room(102, 6000));

        Customer customer = new Customer("Ali Khan", "35202-1234567-1");

        Room room = hotel.findAvailableRoom();
        Booking booking = new Booking(room, customer, 3);

        double bill = booking.calculateBill();
        Payment payment = new Payment(bill);

        System.out.println("Hotel Name: " + hotel.getName());
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Room Number: " + room.getRoomNumber());
        System.out.println("Total Bill: " + payment.getAmount());

        booking.checkout();
        System.out.println("Checkout successful");
    }
}
