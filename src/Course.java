import java.util.ArrayList;

public class Course {
    public String id;
    public String name;
    public int capacity;
    public ArrayList<String> facilities;
    public String idLecturer;
    public Course(String id, String name, int capacity, ArrayList<String> facilities, String idLecturer) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.facilities = new ArrayList<String>();
        for (String facility: facilities) {
            this.facilities.add(facility);
        }
        this.idLecturer = idLecturer;
    }
}
