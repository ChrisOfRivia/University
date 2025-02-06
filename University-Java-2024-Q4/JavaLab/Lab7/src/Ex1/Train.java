package Ex1;

import java.util.LinkedList;
import java.util.List;

public class Train {
    List<String> trainList = new LinkedList<>();


    public void addWagon(String wagon){
        this.trainList.add(wagon);
    }

    public void removeWagon(){
        this.trainList.removeLast();
    }
}
