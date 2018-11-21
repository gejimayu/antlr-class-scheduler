import java.util.ArrayList;

public class DayTime {
    public String day;
    public ArrayList<Time> times;
    public DayTime(String day, ArrayList<Time> times) {
        this.day = day;
        this.times = new ArrayList<Time>();
        for (Time time: times) {
            this.times.add(time);
        }
    }

    @Override
    public String toString() {
        String returnStr = this.day + " ";
        for (Time time: this.times) {
            returnStr += time.from + "-" + time.to + ",";
        }
        returnStr = returnStr.substring(0, returnStr.length() - 1);
        return returnStr;
    }
}
