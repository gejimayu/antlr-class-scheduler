import java.util.ArrayList;

public class Lecturer {
    public String id;
    public String name;
    public ArrayList<DayTime> preferences;
    public Lecturer(String id, String name, ArrayList<DayTime> preferences) {
        this.id = id;
        this.name = name;
        this.preferences = new ArrayList<DayTime>();
        for (DayTime preference: preferences) {
            this.preferences.add(preference);
        }
    }
}
