// Generated from D:/Project/tesgrammarantlr\ClassScheduling.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ClassSchedulingParser}.
 */
public interface ClassSchedulingListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ClassSchedulingParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(ClassSchedulingParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassSchedulingParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(ClassSchedulingParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassSchedulingParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(ClassSchedulingParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassSchedulingParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(ClassSchedulingParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassSchedulingParser#createCourse}.
	 * @param ctx the parse tree
	 */
	void enterCreateCourse(ClassSchedulingParser.CreateCourseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassSchedulingParser#createCourse}.
	 * @param ctx the parse tree
	 */
	void exitCreateCourse(ClassSchedulingParser.CreateCourseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassSchedulingParser#course}.
	 * @param ctx the parse tree
	 */
	void enterCourse(ClassSchedulingParser.CourseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassSchedulingParser#course}.
	 * @param ctx the parse tree
	 */
	void exitCourse(ClassSchedulingParser.CourseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassSchedulingParser#courseID}.
	 * @param ctx the parse tree
	 */
	void enterCourseID(ClassSchedulingParser.CourseIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassSchedulingParser#courseID}.
	 * @param ctx the parse tree
	 */
	void exitCourseID(ClassSchedulingParser.CourseIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassSchedulingParser#courseName}.
	 * @param ctx the parse tree
	 */
	void enterCourseName(ClassSchedulingParser.CourseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassSchedulingParser#courseName}.
	 * @param ctx the parse tree
	 */
	void exitCourseName(ClassSchedulingParser.CourseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassSchedulingParser#lecturerID}.
	 * @param ctx the parse tree
	 */
	void enterLecturerID(ClassSchedulingParser.LecturerIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassSchedulingParser#lecturerID}.
	 * @param ctx the parse tree
	 */
	void exitLecturerID(ClassSchedulingParser.LecturerIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassSchedulingParser#lecturerName}.
	 * @param ctx the parse tree
	 */
	void enterLecturerName(ClassSchedulingParser.LecturerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassSchedulingParser#lecturerName}.
	 * @param ctx the parse tree
	 */
	void exitLecturerName(ClassSchedulingParser.LecturerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassSchedulingParser#createLecturer}.
	 * @param ctx the parse tree
	 */
	void enterCreateLecturer(ClassSchedulingParser.CreateLecturerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassSchedulingParser#createLecturer}.
	 * @param ctx the parse tree
	 */
	void exitCreateLecturer(ClassSchedulingParser.CreateLecturerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassSchedulingParser#lecturer}.
	 * @param ctx the parse tree
	 */
	void enterLecturer(ClassSchedulingParser.LecturerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassSchedulingParser#lecturer}.
	 * @param ctx the parse tree
	 */
	void exitLecturer(ClassSchedulingParser.LecturerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassSchedulingParser#preference}.
	 * @param ctx the parse tree
	 */
	void enterPreference(ClassSchedulingParser.PreferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassSchedulingParser#preference}.
	 * @param ctx the parse tree
	 */
	void exitPreference(ClassSchedulingParser.PreferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassSchedulingParser#daytime}.
	 * @param ctx the parse tree
	 */
	void enterDaytime(ClassSchedulingParser.DaytimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassSchedulingParser#daytime}.
	 * @param ctx the parse tree
	 */
	void exitDaytime(ClassSchedulingParser.DaytimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassSchedulingParser#day}.
	 * @param ctx the parse tree
	 */
	void enterDay(ClassSchedulingParser.DayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassSchedulingParser#day}.
	 * @param ctx the parse tree
	 */
	void exitDay(ClassSchedulingParser.DayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassSchedulingParser#times}.
	 * @param ctx the parse tree
	 */
	void enterTimes(ClassSchedulingParser.TimesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassSchedulingParser#times}.
	 * @param ctx the parse tree
	 */
	void exitTimes(ClassSchedulingParser.TimesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassSchedulingParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(ClassSchedulingParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassSchedulingParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(ClassSchedulingParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassSchedulingParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(ClassSchedulingParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassSchedulingParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(ClassSchedulingParser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassSchedulingParser#to}.
	 * @param ctx the parse tree
	 */
	void enterTo(ClassSchedulingParser.ToContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassSchedulingParser#to}.
	 * @param ctx the parse tree
	 */
	void exitTo(ClassSchedulingParser.ToContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassSchedulingParser#createRoom}.
	 * @param ctx the parse tree
	 */
	void enterCreateRoom(ClassSchedulingParser.CreateRoomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassSchedulingParser#createRoom}.
	 * @param ctx the parse tree
	 */
	void exitCreateRoom(ClassSchedulingParser.CreateRoomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassSchedulingParser#room}.
	 * @param ctx the parse tree
	 */
	void enterRoom(ClassSchedulingParser.RoomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassSchedulingParser#room}.
	 * @param ctx the parse tree
	 */
	void exitRoom(ClassSchedulingParser.RoomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassSchedulingParser#roomID}.
	 * @param ctx the parse tree
	 */
	void enterRoomID(ClassSchedulingParser.RoomIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassSchedulingParser#roomID}.
	 * @param ctx the parse tree
	 */
	void exitRoomID(ClassSchedulingParser.RoomIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassSchedulingParser#facilities}.
	 * @param ctx the parse tree
	 */
	void enterFacilities(ClassSchedulingParser.FacilitiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassSchedulingParser#facilities}.
	 * @param ctx the parse tree
	 */
	void exitFacilities(ClassSchedulingParser.FacilitiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassSchedulingParser#facility}.
	 * @param ctx the parse tree
	 */
	void enterFacility(ClassSchedulingParser.FacilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassSchedulingParser#facility}.
	 * @param ctx the parse tree
	 */
	void exitFacility(ClassSchedulingParser.FacilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassSchedulingParser#capacity}.
	 * @param ctx the parse tree
	 */
	void enterCapacity(ClassSchedulingParser.CapacityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassSchedulingParser#capacity}.
	 * @param ctx the parse tree
	 */
	void exitCapacity(ClassSchedulingParser.CapacityContext ctx);
}