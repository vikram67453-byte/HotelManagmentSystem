public class Booking {
    private final Room room;
    private final Customer customer;
    private final int days;

    public Booking(Room room, Customer customer, int days) {
        if (room == null) {
            throw new IllegalArgumentException("Room cannot be null");
        }
        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null");
        }
        if (days <= 0) {
            throw new IllegalArgumentException("Days must be positive");
        }

        this.room = room;
        this.customer = customer;
        this.days = days;

        room.book(); // Defensive programming
    }

    public double calculateBill() {
        return room.getPrice() * days;
    }

    public void checkout() {
        room.checkout();
    }
}
