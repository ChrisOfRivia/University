package Ex5;

public class SuiteRoom extends Room{
    int numRoomsInSuite;

    public SuiteRoom(int roomNumber, String roomType, double pricePerNight, int availableNights, int numRooms) {
        super(roomNumber, roomType, pricePerNight, availableNights);
        this.numRoomsInSuite = numRooms;
    }
}
