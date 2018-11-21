import jdk.nashorn.internal.ir.Terminal;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

public class ClassSchedulingLoader extends ClassSchedulingBaseListener {
    public ArrayList<Room> rooms = new ArrayList<Room>();
    public ArrayList<Course> courses = new ArrayList<Course>();
    public ArrayList<Lecturer> lecturers = new ArrayList<Lecturer>();

    @Override
    public void exitCreateCourse(ClassSchedulingParser.CreateCourseContext ctx) {
        super.exitCreateCourse(ctx);
        for (ClassSchedulingParser.CourseContext ctx2: ctx.course()) {
            String currentCourseID = ctx2.courseID().ALPHANUMERIC().getText();
            String currentCourseName = ctx2.courseName().WORD().getText();
            int currentCapacity = Integer.parseInt(ctx2.capacity().NUMERIC().getText());
            String currentLecturerID = ctx2.lecturerID().NUMERIC().getText();
            ArrayList<String> currentFacilities = new ArrayList<String>();
            for(ClassSchedulingParser.FacilityContext ctx3 : ctx2.facilities().facility()) {
                String currentFacility = "";
                for(TerminalNode word : ctx3.WORD()) {
                    currentFacility += word.getText() + " ";
                }
                //remove last whitespace
                currentFacility = currentFacility.substring(0, currentFacility.length() - 1);
                currentFacilities.add(currentFacility);
            }
            Course currentCourse = new Course(currentCourseID, currentCourseName, currentCapacity, currentFacilities, currentLecturerID);
            courses.add(currentCourse);
        }
    }

    @Override
    public void exitCreateLecturer(ClassSchedulingParser.CreateLecturerContext ctx) {
        super.exitCreateLecturer(ctx);
        for (ClassSchedulingParser.LecturerContext ctx2: ctx.lecturer()) {
            String currentLecturerID = ctx2.lecturerID().NUMERIC().getText();
            String currentLecturerName = ctx2.lecturerName().WORD().getText();
            ArrayList<DayTime> currentDayTime = new ArrayList<DayTime>();
            for(ClassSchedulingParser.DaytimeContext ctx3: ctx2.preference().daytime()) {
                String day = ctx3.day().getText();
                ArrayList<Time> times = new ArrayList<Time>();
                for(ClassSchedulingParser.TimeContext ctx4: ctx3.times().time()) {
                    int from = Integer.parseInt(ctx4.from().getText());
                    int to = Integer.parseInt(ctx4.to().getText());
                    Time temp = new Time(from, to);
                    times.add(temp);
                }
                DayTime temp = new DayTime(day, times);
                currentDayTime.add(temp);
            }
            Lecturer currentLecturer = new Lecturer(currentLecturerID, currentLecturerName, currentDayTime);
            lecturers.add(currentLecturer);
        }
    }

    @Override
    public void exitCreateRoom(ClassSchedulingParser.CreateRoomContext ctx) {
        super.exitCreateRoom(ctx);
        for (ClassSchedulingParser.RoomContext ctx2: ctx.room()){
            int currentCapacity = Integer.parseInt(ctx2.capacity().NUMERIC().getText());
            String currentRoomID = ctx2.roomID().ALPHANUMERIC().getText();
            ArrayList<String> currentFacilities = new ArrayList<String>();
            for(ClassSchedulingParser.FacilityContext ctx3 : ctx2.facilities().facility()) {
                String currentFacility = "";
                for(TerminalNode word : ctx3.WORD()) {
                    currentFacility += word.getText() + " ";
                }
                //remove last whitespace
                currentFacility = currentFacility.substring(0, currentFacility.length() - 1);
                currentFacilities.add(currentFacility);
            }
            Room currentRoom = new Room(currentRoomID, currentCapacity, currentFacilities);
            rooms.add(currentRoom);
        }
    }
}
