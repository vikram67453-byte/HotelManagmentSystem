public class Room {
    private final int roomNumber;
    private final double price;
    private boolean available;

    public Room(int roomNumber, double price) {
        if (roomNumber <= 0) {
            throw new IllegalArgumentException("Room number must be positive");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }

        this.roomNumber = roomNumber;
        this.price = price;
        this.available = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void book() {
        if (!available) {
            throw new IllegalStateException("Room is already booked");
        }
        available = false;
    }

    public void checkout() {
        available = true;
    }
}
