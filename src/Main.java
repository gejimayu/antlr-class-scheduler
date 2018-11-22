import Rules.ClassSchedulingLexer;
import Rules.ClassSchedulingParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static final String INPUT_FILE = "input2.txt";
    public static ArrayList<Schedule>[][] schedules = new ArrayList[7][24];

    public static int convertToNumber(String day) {
        switch(day) {
            case "senin": return 0;
            case "selasa": return 1;
            case "rabu": return 2;
            case "kamis": return 3;
            case "jumat": return 4;
            case "sabtu": return 5;
            case "minggu": return 6;
            default: return 0;
        }
    }

    public static String toDay(int a) {
        String returnStr = "";
        if (a == 0) {
            returnStr = "Senin";
        } else if (a == 1) {
            returnStr = "Selasa";
        } else if (a == 2) {
            returnStr = "Rabu";
        } else if (a == 3) {
            returnStr = "Kamis";
        } else if (a == 4) {
            returnStr = "Jumat";
        }
        return returnStr;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 24; j++) {
                schedules[i][j] = new ArrayList<Schedule>();
            }
        }
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(INPUT_FILE);
        } catch (FileNotFoundException e) {
            System.err.println("Input file not found");
            return;
        }
        ClassSchedulingLexer lexer;
        try {
            lexer = new ClassSchedulingLexer(new ANTLRInputStream(fileInputStream));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ClassSchedulingParser parser = new ClassSchedulingParser(tokens);
        ParseTree tree = parser.main();
        ParseTreeWalker walker = new ParseTreeWalker();
        ClassSchedulingLoader loader = new ClassSchedulingLoader();
        walker.walk(loader, tree);
        for (Room room: loader.rooms) {
            System.out.println(room.id + " " + room.capacity + " " + room.facilities);
        }
        for (Course course: loader.courses) {
            System.out.println(course.id + " " + course.name + " " + course.capacity + " " + course.facilities + " " + course.idLecturer);
        }
        for (Lecturer lecturer: loader.lecturers) {
            System.out.println(lecturer.id + " " + lecturer.name + " " + lecturer.preferences);
        }
        for (Course course: loader.courses) {
            int duration = course.duration;
            for (Room room: loader.rooms) {
                if (room.capacity >= course.capacity && room.facilities.containsAll(course.facilities)) {
                    for (Lecturer lecturer: loader.lecturers) {
                        if (lecturer.id.equals(course.idLecturer)) {
                            for (DayTime preference: lecturer.preferences) {
                                for (Time time: preference.times) {
                                    for (int i = time.from; i < time.to && duration > 0; i++) {
                                        if (schedules[convertToNumber(preference.day)][i].isEmpty()) {
                                            Schedule temp = new Schedule(course.id, room.id);
                                            schedules[convertToNumber(preference.day)][i].add(temp);
                                            duration--;
                                        }
                                        boolean roomFound = false;
                                        for (Schedule s : schedules[convertToNumber(preference.day)][i]) {
                                            if (s.roomID.equals(room.id)) {
                                                roomFound = true;
                                                break;
                                            }
                                        }
                                        if (!roomFound) {
                                            Schedule temp = new Schedule(course.id, room.id);
                                            schedules[convertToNumber(preference.day)][i].add(temp);
                                            duration--;
                                        }
                                    }
                                    if (duration == 0) break;
                                }
                                if (duration == 0) break;
                            }
                        }
                        if (duration == 0) break;
                    }
                }
                if (duration == 0) break;
            }
            // Case for class that has the same preferences
            if (duration > 0) {
                for (Room room: loader.rooms) {
                    if (room.capacity >= course.capacity && room.facilities.containsAll(course.facilities)) {
                        for (int i = 0; i < 7 && duration > 0; i++) {
                            for (int j = 7; j < 18 && duration > 0; j++) {
                                if (schedules[i][j].isEmpty()) {
                                    Schedule temp = new Schedule(course.id, room.id);
                                    schedules[i][j].add(temp);
                                    duration--;
                                }
                                boolean roomFound = false;
                                for (Schedule s : schedules[i][j]) {
                                    if (s.roomID.equals(room.id)) {
                                        roomFound = true;
                                        break;
                                    }
                                }
                                if (!roomFound) {
                                    Schedule temp = new Schedule(course.id, room.id);
                                    schedules[i][j].add(temp);
                                    duration--;
                                }
                            }
                        }
                    }
                    if (duration == 0) break;
                }
            }
        }
        System.out.println("=========== Schedule ===========");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 24; j++) {
                for (Schedule s : schedules[i][j]) {
                    System.out.println("Hari " + toDay(i) + ", Jam " + j + ", Ruang: " + s.roomID + ", Mata Kuliah " + s.courseID);
                }
            }
        }
    }
}
