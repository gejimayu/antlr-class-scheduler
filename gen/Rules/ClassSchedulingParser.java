// Generated from /Users/eshael/Downloads/antlr-class-scheduler/src/Rules/ClassScheduling.g4 by ANTLR 4.7
package Rules;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ClassSchedulingParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, LOWERCASE=11, UPPERCASE=12, DIGIT=13, NUMERIC=14, WORD=15, ALPHANUMERIC=16, 
		WHITESPACE=17, ENTER=18;
	public static final int
		RULE_main = 0, RULE_command = 1, RULE_createCourse = 2, RULE_course = 3, 
		RULE_courseID = 4, RULE_courseName = 5, RULE_courseDuration = 6, RULE_lecturerID = 7, 
		RULE_createLecturer = 8, RULE_lecturer = 9, RULE_lecturerName = 10, RULE_preference = 11, 
		RULE_daytime = 12, RULE_day = 13, RULE_times = 14, RULE_time = 15, RULE_from = 16, 
		RULE_to = 17, RULE_createRoom = 18, RULE_room = 19, RULE_roomID = 20, 
		RULE_facilities = 21, RULE_facility = 22, RULE_capacity = 23;
	public static final String[] ruleNames = {
		"main", "command", "createCourse", "course", "courseID", "courseName", 
		"courseDuration", "lecturerID", "createLecturer", "lecturer", "lecturerName", 
		"preference", "daytime", "day", "times", "time", "from", "to", "createRoom", 
		"room", "roomID", "facilities", "facility", "capacity"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'CREATE COURSE {'", "'}'", "'('", "','", "')'", "'CREATE LECTURER {'", 
		"'['", "']'", "'-'", "'CREATE ROOM {'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "LOWERCASE", 
		"UPPERCASE", "DIGIT", "NUMERIC", "WORD", "ALPHANUMERIC", "WHITESPACE", 
		"ENTER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ClassScheduling.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ClassSchedulingParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MainContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public List<TerminalNode> ENTER() { return getTokens(ClassSchedulingParser.ENTER); }
		public TerminalNode ENTER(int i) {
			return getToken(ClassSchedulingParser.ENTER, i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassSchedulingVisitor ) return ((ClassSchedulingVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				command();
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENTER) {
					{
					setState(49);
					match(ENTER);
					}
				}

				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__9))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public CreateRoomContext createRoom() {
			return getRuleContext(CreateRoomContext.class,0);
		}
		public CreateLecturerContext createLecturer() {
			return getRuleContext(CreateLecturerContext.class,0);
		}
		public CreateCourseContext createCourse() {
			return getRuleContext(CreateCourseContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassSchedulingVisitor ) return ((ClassSchedulingVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				createRoom();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				createLecturer();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				createCourse();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateCourseContext extends ParserRuleContext {
		public List<TerminalNode> ENTER() { return getTokens(ClassSchedulingParser.ENTER); }
		public TerminalNode ENTER(int i) {
			return getToken(ClassSchedulingParser.ENTER, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(ClassSchedulingParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(ClassSchedulingParser.WHITESPACE, i);
		}
		public List<CourseContext> course() {
			return getRuleContexts(CourseContext.class);
		}
		public CourseContext course(int i) {
			return getRuleContext(CourseContext.class,i);
		}
		public CreateCourseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createCourse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).enterCreateCourse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).exitCreateCourse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassSchedulingVisitor ) return ((ClassSchedulingVisitor<? extends T>)visitor).visitCreateCourse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateCourseContext createCourse() throws RecognitionException {
		CreateCourseContext _localctx = new CreateCourseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_createCourse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__0);
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				match(ENTER);
				setState(63);
				match(WHITESPACE);
				setState(64);
				course();
				setState(66);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(65);
					match(ENTER);
					}
					break;
				}
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ENTER );
			setState(72);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CourseContext extends ParserRuleContext {
		public CourseIDContext courseID() {
			return getRuleContext(CourseIDContext.class,0);
		}
		public CourseNameContext courseName() {
			return getRuleContext(CourseNameContext.class,0);
		}
		public CapacityContext capacity() {
			return getRuleContext(CapacityContext.class,0);
		}
		public FacilitiesContext facilities() {
			return getRuleContext(FacilitiesContext.class,0);
		}
		public CourseDurationContext courseDuration() {
			return getRuleContext(CourseDurationContext.class,0);
		}
		public LecturerIDContext lecturerID() {
			return getRuleContext(LecturerIDContext.class,0);
		}
		public CourseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_course; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).enterCourse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).exitCourse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassSchedulingVisitor ) return ((ClassSchedulingVisitor<? extends T>)visitor).visitCourse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CourseContext course() throws RecognitionException {
		CourseContext _localctx = new CourseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_course);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__2);
			setState(75);
			courseID();
			setState(76);
			match(T__3);
			setState(77);
			courseName();
			setState(78);
			match(T__3);
			setState(79);
			capacity();
			setState(80);
			match(T__3);
			setState(81);
			facilities();
			setState(82);
			match(T__3);
			setState(83);
			courseDuration();
			setState(84);
			match(T__3);
			setState(85);
			lecturerID();
			setState(86);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CourseIDContext extends ParserRuleContext {
		public TerminalNode ALPHANUMERIC() { return getToken(ClassSchedulingParser.ALPHANUMERIC, 0); }
		public CourseIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_courseID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).enterCourseID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).exitCourseID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassSchedulingVisitor ) return ((ClassSchedulingVisitor<? extends T>)visitor).visitCourseID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CourseIDContext courseID() throws RecognitionException {
		CourseIDContext _localctx = new CourseIDContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_courseID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ALPHANUMERIC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CourseNameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(ClassSchedulingParser.WORD, 0); }
		public CourseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_courseName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).enterCourseName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).exitCourseName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassSchedulingVisitor ) return ((ClassSchedulingVisitor<? extends T>)visitor).visitCourseName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CourseNameContext courseName() throws RecognitionException {
		CourseNameContext _localctx = new CourseNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_courseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CourseDurationContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(ClassSchedulingParser.DIGIT, 0); }
		public CourseDurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_courseDuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).enterCourseDuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).exitCourseDuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassSchedulingVisitor ) return ((ClassSchedulingVisitor<? extends T>)visitor).visitCourseDuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CourseDurationContext courseDuration() throws RecognitionException {
		CourseDurationContext _localctx = new CourseDurationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_courseDuration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(DIGIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LecturerIDContext extends ParserRuleContext {
		public TerminalNode NUMERIC() { return getToken(ClassSchedulingParser.NUMERIC, 0); }
		public LecturerIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lecturerID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).enterLecturerID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).exitLecturerID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassSchedulingVisitor ) return ((ClassSchedulingVisitor<? extends T>)visitor).visitLecturerID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LecturerIDContext lecturerID() throws RecognitionException {
		LecturerIDContext _localctx = new LecturerIDContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lecturerID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(NUMERIC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateLecturerContext extends ParserRuleContext {
		public List<TerminalNode> ENTER() { return getTokens(ClassSchedulingParser.ENTER); }
		public TerminalNode ENTER(int i) {
			return getToken(ClassSchedulingParser.ENTER, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(ClassSchedulingParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(ClassSchedulingParser.WHITESPACE, i);
		}
		public List<LecturerContext> lecturer() {
			return getRuleContexts(LecturerContext.class);
		}
		public LecturerContext lecturer(int i) {
			return getRuleContext(LecturerContext.class,i);
		}
		public CreateLecturerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createLecturer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).enterCreateLecturer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).exitCreateLecturer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassSchedulingVisitor ) return ((ClassSchedulingVisitor<? extends T>)visitor).visitCreateLecturer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateLecturerContext createLecturer() throws RecognitionException {
		CreateLecturerContext _localctx = new CreateLecturerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_createLecturer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__5);
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				match(ENTER);
				setState(98);
				match(WHITESPACE);
				setState(99);
				lecturer();
				setState(101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(100);
					match(ENTER);
					}
					break;
				}
				}
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ENTER );
			setState(107);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LecturerContext extends ParserRuleContext {
		public LecturerIDContext lecturerID() {
			return getRuleContext(LecturerIDContext.class,0);
		}
		public LecturerNameContext lecturerName() {
			return getRuleContext(LecturerNameContext.class,0);
		}
		public PreferenceContext preference() {
			return getRuleContext(PreferenceContext.class,0);
		}
		public LecturerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lecturer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).enterLecturer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).exitLecturer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassSchedulingVisitor ) return ((ClassSchedulingVisitor<? extends T>)visitor).visitLecturer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LecturerContext lecturer() throws RecognitionException {
		LecturerContext _localctx = new LecturerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lecturer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__2);
			setState(110);
			lecturerID();
			setState(111);
			match(T__3);
			setState(112);
			lecturerName();
			setState(113);
			match(T__3);
			setState(114);
			preference();
			setState(115);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LecturerNameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(ClassSchedulingParser.WORD, 0); }
		public LecturerNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lecturerName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).enterLecturerName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).exitLecturerName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassSchedulingVisitor ) return ((ClassSchedulingVisitor<? extends T>)visitor).visitLecturerName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LecturerNameContext lecturerName() throws RecognitionException {
		LecturerNameContext _localctx = new LecturerNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lecturerName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreferenceContext extends ParserRuleContext {
		public List<DaytimeContext> daytime() {
			return getRuleContexts(DaytimeContext.class);
		}
		public DaytimeContext daytime(int i) {
			return getRuleContext(DaytimeContext.class,i);
		}
		public PreferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).enterPreference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).exitPreference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassSchedulingVisitor ) return ((ClassSchedulingVisitor<? extends T>)visitor).visitPreference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreferenceContext preference() throws RecognitionException {
		PreferenceContext _localctx = new PreferenceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_preference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__6);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(120);
				daytime();
				}
			}

			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(123);
					match(T__3);
					setState(124);
					daytime();
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(132);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DaytimeContext extends ParserRuleContext {
		public DayContext day() {
			return getRuleContext(DayContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(ClassSchedulingParser.WHITESPACE, 0); }
		public TimesContext times() {
			return getRuleContext(TimesContext.class,0);
		}
		public DaytimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_daytime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).enterDaytime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).exitDaytime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassSchedulingVisitor ) return ((ClassSchedulingVisitor<? extends T>)visitor).visitDaytime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DaytimeContext daytime() throws RecognitionException {
		DaytimeContext _localctx = new DaytimeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_daytime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			day();
			setState(135);
			match(WHITESPACE);
			setState(136);
			times();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DayContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(ClassSchedulingParser.WORD, 0); }
		public DayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).enterDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).exitDay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassSchedulingVisitor ) return ((ClassSchedulingVisitor<? extends T>)visitor).visitDay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DayContext day() throws RecognitionException {
		DayContext _localctx = new DayContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_day);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimesContext extends ParserRuleContext {
		public List<TimeContext> time() {
			return getRuleContexts(TimeContext.class);
		}
		public TimeContext time(int i) {
			return getRuleContext(TimeContext.class,i);
		}
		public TimesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_times; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).enterTimes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).exitTimes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassSchedulingVisitor ) return ((ClassSchedulingVisitor<? extends T>)visitor).visitTimes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimesContext times() throws RecognitionException {
		TimesContext _localctx = new TimesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_times);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__2);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIGIT || _la==NUMERIC) {
				{
				setState(141);
				time();
				}
			}

			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(144);
					match(T__3);
					setState(145);
					time();
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(153);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeContext extends ParserRuleContext {
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public ToContext to() {
			return getRuleContext(ToContext.class,0);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassSchedulingVisitor ) return ((ClassSchedulingVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			from();
			setState(156);
			match(T__8);
			setState(157);
			to();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromContext extends ParserRuleContext {
		public TerminalNode NUMERIC() { return getToken(ClassSchedulingParser.NUMERIC, 0); }
		public TerminalNode DIGIT() { return getToken(ClassSchedulingParser.DIGIT, 0); }
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).enterFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).exitFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassSchedulingVisitor ) return ((ClassSchedulingVisitor<? extends T>)visitor).visitFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_from);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !(_la==DIGIT || _la==NUMERIC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ToContext extends ParserRuleContext {
		public TerminalNode NUMERIC() { return getToken(ClassSchedulingParser.NUMERIC, 0); }
		public TerminalNode DIGIT() { return getToken(ClassSchedulingParser.DIGIT, 0); }
		public ToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).enterTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).exitTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassSchedulingVisitor ) return ((ClassSchedulingVisitor<? extends T>)visitor).visitTo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToContext to() throws RecognitionException {
		ToContext _localctx = new ToContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_to);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !(_la==DIGIT || _la==NUMERIC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateRoomContext extends ParserRuleContext {
		public List<TerminalNode> ENTER() { return getTokens(ClassSchedulingParser.ENTER); }
		public TerminalNode ENTER(int i) {
			return getToken(ClassSchedulingParser.ENTER, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(ClassSchedulingParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(ClassSchedulingParser.WHITESPACE, i);
		}
		public List<RoomContext> room() {
			return getRuleContexts(RoomContext.class);
		}
		public RoomContext room(int i) {
			return getRuleContext(RoomContext.class,i);
		}
		public CreateRoomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRoom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).enterCreateRoom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).exitCreateRoom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassSchedulingVisitor ) return ((ClassSchedulingVisitor<? extends T>)visitor).visitCreateRoom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateRoomContext createRoom() throws RecognitionException {
		CreateRoomContext _localctx = new CreateRoomContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_createRoom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__9);
			setState(170); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(164);
				match(ENTER);
				setState(165);
				match(WHITESPACE);
				setState(166);
				room();
				setState(168);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(167);
					match(ENTER);
					}
					break;
				}
				}
				}
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ENTER );
			setState(174);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoomContext extends ParserRuleContext {
		public RoomIDContext roomID() {
			return getRuleContext(RoomIDContext.class,0);
		}
		public CapacityContext capacity() {
			return getRuleContext(CapacityContext.class,0);
		}
		public FacilitiesContext facilities() {
			return getRuleContext(FacilitiesContext.class,0);
		}
		public RoomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_room; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).enterRoom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).exitRoom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassSchedulingVisitor ) return ((ClassSchedulingVisitor<? extends T>)visitor).visitRoom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoomContext room() throws RecognitionException {
		RoomContext _localctx = new RoomContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_room);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__2);
			setState(177);
			roomID();
			setState(178);
			match(T__3);
			setState(179);
			capacity();
			setState(180);
			match(T__3);
			setState(181);
			facilities();
			setState(182);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoomIDContext extends ParserRuleContext {
		public TerminalNode ALPHANUMERIC() { return getToken(ClassSchedulingParser.ALPHANUMERIC, 0); }
		public RoomIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roomID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).enterRoomID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).exitRoomID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassSchedulingVisitor ) return ((ClassSchedulingVisitor<? extends T>)visitor).visitRoomID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoomIDContext roomID() throws RecognitionException {
		RoomIDContext _localctx = new RoomIDContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_roomID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(ALPHANUMERIC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FacilitiesContext extends ParserRuleContext {
		public List<FacilityContext> facility() {
			return getRuleContexts(FacilityContext.class);
		}
		public FacilityContext facility(int i) {
			return getRuleContext(FacilityContext.class,i);
		}
		public FacilitiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facilities; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).enterFacilities(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).exitFacilities(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassSchedulingVisitor ) return ((ClassSchedulingVisitor<? extends T>)visitor).visitFacilities(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FacilitiesContext facilities() throws RecognitionException {
		FacilitiesContext _localctx = new FacilitiesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_facilities);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__6);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(187);
				facility();
				}
			}

			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(190);
					match(T__3);
					setState(191);
					facility();
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(199);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FacilityContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(ClassSchedulingParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ClassSchedulingParser.WORD, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(ClassSchedulingParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(ClassSchedulingParser.WHITESPACE, i);
		}
		public FacilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).enterFacility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).exitFacility(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassSchedulingVisitor ) return ((ClassSchedulingVisitor<? extends T>)visitor).visitFacility(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FacilityContext facility() throws RecognitionException {
		FacilityContext _localctx = new FacilityContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_facility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(WORD);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(202);
				match(WHITESPACE);
				setState(203);
				match(WORD);
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CapacityContext extends ParserRuleContext {
		public TerminalNode NUMERIC() { return getToken(ClassSchedulingParser.NUMERIC, 0); }
		public CapacityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capacity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).enterCapacity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassSchedulingListener ) ((ClassSchedulingListener)listener).exitCapacity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassSchedulingVisitor ) return ((ClassSchedulingVisitor<? extends T>)visitor).visitCapacity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CapacityContext capacity() throws RecognitionException {
		CapacityContext _localctx = new CapacityContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_capacity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(NUMERIC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\u00d6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\5\2\65\n\2\6\2\67\n\2\r\2\16\28\3\3\3\3\3\3\5\3>\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\5\4E\n\4\6\4G\n\4\r\4\16\4H\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\5\nh\n\n\6\nj\n\n\r\n\16\nk\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\5\r|\n\r\3\r\3\r\7\r\u0080\n\r"+
		"\f\r\16\r\u0083\13\r\5\r\u0085\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\5\20\u0091\n\20\3\20\3\20\7\20\u0095\n\20\f\20\16\20\u0098"+
		"\13\20\5\20\u009a\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\5\24\u00ab\n\24\6\24\u00ad\n\24\r\24\16\24"+
		"\u00ae\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\5\27\u00bf\n\27\3\27\3\27\7\27\u00c3\n\27\f\27\16\27\u00c6\13\27"+
		"\5\27\u00c8\n\27\3\27\3\27\3\30\3\30\3\30\7\30\u00cf\n\30\f\30\16\30\u00d2"+
		"\13\30\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\2\3\3\2\17\20\2\u00d1\2\66\3\2\2\2\4=\3\2\2\2\6?\3\2\2\2\bL"+
		"\3\2\2\2\nZ\3\2\2\2\f\\\3\2\2\2\16^\3\2\2\2\20`\3\2\2\2\22b\3\2\2\2\24"+
		"o\3\2\2\2\26w\3\2\2\2\30y\3\2\2\2\32\u0088\3\2\2\2\34\u008c\3\2\2\2\36"+
		"\u008e\3\2\2\2 \u009d\3\2\2\2\"\u00a1\3\2\2\2$\u00a3\3\2\2\2&\u00a5\3"+
		"\2\2\2(\u00b2\3\2\2\2*\u00ba\3\2\2\2,\u00bc\3\2\2\2.\u00cb\3\2\2\2\60"+
		"\u00d3\3\2\2\2\62\64\5\4\3\2\63\65\7\24\2\2\64\63\3\2\2\2\64\65\3\2\2"+
		"\2\65\67\3\2\2\2\66\62\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29\3\3"+
		"\2\2\2:>\5&\24\2;>\5\22\n\2<>\5\6\4\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2\2>\5"+
		"\3\2\2\2?F\7\3\2\2@A\7\24\2\2AB\7\23\2\2BD\5\b\5\2CE\7\24\2\2DC\3\2\2"+
		"\2DE\3\2\2\2EG\3\2\2\2F@\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2"+
		"\2JK\7\4\2\2K\7\3\2\2\2LM\7\5\2\2MN\5\n\6\2NO\7\6\2\2OP\5\f\7\2PQ\7\6"+
		"\2\2QR\5\60\31\2RS\7\6\2\2ST\5,\27\2TU\7\6\2\2UV\5\16\b\2VW\7\6\2\2WX"+
		"\5\20\t\2XY\7\7\2\2Y\t\3\2\2\2Z[\7\22\2\2[\13\3\2\2\2\\]\7\21\2\2]\r\3"+
		"\2\2\2^_\7\17\2\2_\17\3\2\2\2`a\7\20\2\2a\21\3\2\2\2bi\7\b\2\2cd\7\24"+
		"\2\2de\7\23\2\2eg\5\24\13\2fh\7\24\2\2gf\3\2\2\2gh\3\2\2\2hj\3\2\2\2i"+
		"c\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\4\2\2n\23\3\2\2"+
		"\2op\7\5\2\2pq\5\20\t\2qr\7\6\2\2rs\5\26\f\2st\7\6\2\2tu\5\30\r\2uv\7"+
		"\7\2\2v\25\3\2\2\2wx\7\21\2\2x\27\3\2\2\2y{\7\t\2\2z|\5\32\16\2{z\3\2"+
		"\2\2{|\3\2\2\2|\u0084\3\2\2\2}~\7\6\2\2~\u0080\5\32\16\2\177}\3\2\2\2"+
		"\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\7\n\2\2\u0087\31\3\2\2\2\u0088\u0089\5\34\17"+
		"\2\u0089\u008a\7\23\2\2\u008a\u008b\5\36\20\2\u008b\33\3\2\2\2\u008c\u008d"+
		"\7\21\2\2\u008d\35\3\2\2\2\u008e\u0090\7\5\2\2\u008f\u0091\5 \21\2\u0090"+
		"\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0099\3\2\2\2\u0092\u0093\7\6"+
		"\2\2\u0093\u0095\5 \21\2\u0094\u0092\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\u0096\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009c\7\7\2\2\u009c\37\3\2\2\2\u009d\u009e\5\"\22\2\u009e\u009f\7\13"+
		"\2\2\u009f\u00a0\5$\23\2\u00a0!\3\2\2\2\u00a1\u00a2\t\2\2\2\u00a2#\3\2"+
		"\2\2\u00a3\u00a4\t\2\2\2\u00a4%\3\2\2\2\u00a5\u00ac\7\f\2\2\u00a6\u00a7"+
		"\7\24\2\2\u00a7\u00a8\7\23\2\2\u00a8\u00aa\5(\25\2\u00a9\u00ab\7\24\2"+
		"\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a6"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\7\4\2\2\u00b1\'\3\2\2\2\u00b2\u00b3\7\5\2\2"+
		"\u00b3\u00b4\5*\26\2\u00b4\u00b5\7\6\2\2\u00b5\u00b6\5\60\31\2\u00b6\u00b7"+
		"\7\6\2\2\u00b7\u00b8\5,\27\2\u00b8\u00b9\7\7\2\2\u00b9)\3\2\2\2\u00ba"+
		"\u00bb\7\22\2\2\u00bb+\3\2\2\2\u00bc\u00be\7\t\2\2\u00bd\u00bf\5.\30\2"+
		"\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c7\3\2\2\2\u00c0\u00c1"+
		"\7\6\2\2\u00c1\u00c3\5.\30\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00ca\7\n\2\2\u00ca-\3\2\2\2\u00cb\u00d0\7\21\2\2\u00cc\u00cd\7\23\2"+
		"\2\u00cd\u00cf\7\21\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1/\3\2\2\2\u00d2\u00d0\3\2\2\2"+
		"\u00d3\u00d4\7\20\2\2\u00d4\61\3\2\2\2\25\648=DHgk{\u0081\u0084\u0090"+
		"\u0096\u0099\u00aa\u00ae\u00be\u00c4\u00c7\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}