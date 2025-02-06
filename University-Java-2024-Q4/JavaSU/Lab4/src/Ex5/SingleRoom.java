package Ex5;

public class SingleRoom extends Room{
    String bedType;

    public SingleRoom(int roomNumber, String roomType, double pricePerNight, int availableNights, String bedType) {
        super(roomNumber, roomType, pricePerNight, availableNights);
        this.bedType = bedType;
    }




}
