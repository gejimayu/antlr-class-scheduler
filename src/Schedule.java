public class Schedule {
    public String courseID;
    public String roomID;
    public DayTime dayTime;
    public Schedule(String courseID, String roomID, DayTime dayTime) {
        this.courseID = courseID;
        this.roomID = roomID;
        this.dayTime = dayTime;
    }

    public boolean isAvailable(DayTime time) {
        if (time.day != dayTime.day) {
            return true;
        }
        int i = 0;
        for (Time hour : dayTime.times) {
            if (hour.from <= time.times.get(i).from) {

            }
        }
    }
}
