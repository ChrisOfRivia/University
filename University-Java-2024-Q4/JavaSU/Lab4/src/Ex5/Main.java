package Ex5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Room> rooms = new LinkedList<>();
        Room room1 = new SingleRoom(101, "Single", 10.5, 5, "Single");
        Room room2 = new SuiteRoom(202, "Suite", 50.5, 5, 5);
        Room room3 = new SingleRoom(303, "Single", 15.5, 5, "Single");

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        
        try{
            FileWriter fw = new FileWriter("src/Ex5/rooms.txt");
            for(int i =  0; i < rooms.size(); i++){
                int roomType = 0;
                if(rooms.get(i).roomType.equals("Single")){
                    roomType = 1;
                } else if (rooms.get(i).roomType.equals("Suite")) {
                    roomType = 2;
                }
                fw.write(roomType + "*" + rooms.get(i).roomNumber + "*" + rooms.get(i).roomType + "*" + rooms.get(i).pricePerNight + "*" + rooms.get(i).availableNights + "\n");
            }
            fw.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }



    }
}
