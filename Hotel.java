import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private final String name;
    private final List<Room> rooms;

    public Hotel(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Hotel name cannot be empty");
        }

        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        if (room == null) {
            throw new IllegalArgumentException("Room cannot be null");
        }
        rooms.add(room);
    }

    public Room findAvailableRoom() {
        return rooms.stream()
                .filter(Room::isAvailable)
                .findFirst()
                .orElseThrow(() ->
                        new IllegalStateException("No rooms available"));
    }

    public String getName() {
        return name;
    }
}
