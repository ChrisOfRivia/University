package Ex5;

public class Room {
    int roomNumber;
    String roomType;
    double pricePerNight;
    int availableNights;

    public Room(int roomNumber, String roomType, double pricePerNight, int availableNights) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.availableNights = availableNights;
    }

    public boolean reserveRoom(int numNights) throws NoAvailableNightsException {
        if(this.availableNights >= numNights){
            this.availableNights -= numNights;
            return true;
        }
        throw new NoAvailableNightsException("No available room!");
    }
}
