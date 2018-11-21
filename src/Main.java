import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static final String INPUT_FILE = "input.txt";

    public static void main(String[] args) {
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
//        // show tree
//        ParserRuleContext ruleContext = parser.main();
//        Trees.inspect(ruleContext, parser);
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
    }
}
