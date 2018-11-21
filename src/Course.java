import java.util.ArrayList;

public class Course {
    public String id;
    public String name;
    public int capacity;
    public ArrayList<String> facilities;
    public int duration;
    public String idLecturer;
    public Course(String id, String name, int capacity, ArrayList<String> facilities, int duration, String idLecturer) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.facilities = new ArrayList<String>();
        for (String facility: facilities) {
            this.facilities.add(facility);
        }
        this.duration = duration;
        this.idLecturer = idLecturer;
    }
}
