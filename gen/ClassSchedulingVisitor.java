// Generated from D:/Project/tesgrammarantlr\ClassScheduling.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ClassSchedulingParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ClassSchedulingVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ClassSchedulingParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(ClassSchedulingParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassSchedulingParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(ClassSchedulingParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassSchedulingParser#createCourse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateCourse(ClassSchedulingParser.CreateCourseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassSchedulingParser#course}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCourse(ClassSchedulingParser.CourseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassSchedulingParser#courseID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCourseID(ClassSchedulingParser.CourseIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassSchedulingParser#courseName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCourseName(ClassSchedulingParser.CourseNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassSchedulingParser#lecturerID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLecturerID(ClassSchedulingParser.LecturerIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassSchedulingParser#lecturerName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLecturerName(ClassSchedulingParser.LecturerNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassSchedulingParser#createLecturer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLecturer(ClassSchedulingParser.CreateLecturerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassSchedulingParser#lecturer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLecturer(ClassSchedulingParser.LecturerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassSchedulingParser#preference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreference(ClassSchedulingParser.PreferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassSchedulingParser#daytime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDaytime(ClassSchedulingParser.DaytimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassSchedulingParser#day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay(ClassSchedulingParser.DayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassSchedulingParser#times}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimes(ClassSchedulingParser.TimesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassSchedulingParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(ClassSchedulingParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassSchedulingParser#from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom(ClassSchedulingParser.FromContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassSchedulingParser#to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTo(ClassSchedulingParser.ToContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassSchedulingParser#createRoom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateRoom(ClassSchedulingParser.CreateRoomContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassSchedulingParser#room}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoom(ClassSchedulingParser.RoomContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassSchedulingParser#roomID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoomID(ClassSchedulingParser.RoomIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassSchedulingParser#facilities}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFacilities(ClassSchedulingParser.FacilitiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassSchedulingParser#facility}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFacility(ClassSchedulingParser.FacilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassSchedulingParser#capacity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapacity(ClassSchedulingParser.CapacityContext ctx);
}