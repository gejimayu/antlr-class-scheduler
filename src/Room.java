import java.util.ArrayList;

public class Room {
    public String id;
    public int capacity;
    public ArrayList<String> facilities;
    public Room(String id, int capacity, ArrayList<String> facilities) {
        this.id = id;
        this.capacity = capacity;
        this.facilities = new ArrayList<String>();
        for (String facility: facilities) {
            this.facilities.add(facility);
        }
    }
}
