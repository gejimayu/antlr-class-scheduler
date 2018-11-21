// Generated from D:/Project/tesgrammarantlr\ClassScheduling.g4 by ANTLR 4.7
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
		RULE_courseID = 4, RULE_courseName = 5, RULE_lecturerID = 6, RULE_lecturerName = 7, 
		RULE_createLecturer = 8, RULE_lecturer = 9, RULE_preference = 10, RULE_daytime = 11, 
		RULE_day = 12, RULE_times = 13, RULE_time = 14, RULE_from = 15, RULE_to = 16, 
		RULE_createRoom = 17, RULE_room = 18, RULE_roomID = 19, RULE_facilities = 20, 
		RULE_facility = 21, RULE_capacity = 22;
	public static final String[] ruleNames = {
		"main", "command", "createCourse", "course", "courseID", "courseName", 
		"lecturerID", "lecturerName", "createLecturer", "lecturer", "preference", 
		"daytime", "day", "times", "time", "from", "to", "createRoom", "room", 
		"roomID", "facilities", "facility", "capacity"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'CREATE CLASS {'", "'}'", "'('", "','", "')'", "'CREATE LECTURER {'", 
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
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				command();
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENTER) {
					{
					setState(47);
					match(ENTER);
					}
				}

				}
				}
				setState(52); 
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
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				createRoom();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				createLecturer();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
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
			setState(59);
			match(T__0);
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				match(ENTER);
				setState(61);
				match(WHITESPACE);
				setState(62);
				course();
				setState(64);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(63);
					match(ENTER);
					}
					break;
				}
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ENTER );
			setState(70);
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
			setState(72);
			match(T__2);
			setState(73);
			courseID();
			setState(74);
			match(T__3);
			setState(75);
			courseName();
			setState(76);
			match(T__3);
			setState(77);
			capacity();
			setState(78);
			match(T__3);
			setState(79);
			facilities();
			setState(80);
			match(T__3);
			setState(81);
			lecturerID();
			setState(82);
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
			setState(84);
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
			setState(86);
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
		enterRule(_localctx, 12, RULE_lecturerID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
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
		enterRule(_localctx, 14, RULE_lecturerName);
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
			setState(92);
			match(T__5);
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(93);
				match(ENTER);
				setState(94);
				match(WHITESPACE);
				setState(95);
				lecturer();
				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(96);
					match(ENTER);
					}
					break;
				}
				}
				}
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ENTER );
			setState(103);
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
			setState(105);
			match(T__2);
			setState(106);
			lecturerID();
			setState(107);
			match(T__3);
			setState(108);
			lecturerName();
			setState(109);
			match(T__3);
			setState(110);
			preference();
			setState(111);
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
		enterRule(_localctx, 20, RULE_preference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__6);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(114);
				daytime();
				}
			}

			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(117);
					match(T__3);
					setState(118);
					daytime();
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(126);
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
		enterRule(_localctx, 22, RULE_daytime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			day();
			setState(129);
			match(WHITESPACE);
			setState(130);
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
		enterRule(_localctx, 24, RULE_day);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
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
		enterRule(_localctx, 26, RULE_times);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__2);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIGIT || _la==NUMERIC) {
				{
				setState(135);
				time();
				}
			}

			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(138);
					match(T__3);
					setState(139);
					time();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(147);
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
		enterRule(_localctx, 28, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			from();
			setState(150);
			match(T__8);
			setState(151);
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
		enterRule(_localctx, 30, RULE_from);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
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
		enterRule(_localctx, 32, RULE_to);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
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
		enterRule(_localctx, 34, RULE_createRoom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__9);
			setState(164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(158);
				match(ENTER);
				setState(159);
				match(WHITESPACE);
				setState(160);
				room();
				setState(162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(161);
					match(ENTER);
					}
					break;
				}
				}
				}
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ENTER );
			setState(168);
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
		enterRule(_localctx, 36, RULE_room);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__2);
			setState(171);
			roomID();
			setState(172);
			match(T__3);
			setState(173);
			capacity();
			setState(174);
			match(T__3);
			setState(175);
			facilities();
			setState(176);
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
		enterRule(_localctx, 38, RULE_roomID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
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
		enterRule(_localctx, 40, RULE_facilities);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__6);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(181);
				facility();
				}
			}

			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(184);
					match(T__3);
					setState(185);
					facility();
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(193);
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
		enterRule(_localctx, 42, RULE_facility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(WORD);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(196);
				match(WHITESPACE);
				setState(197);
				match(WORD);
				}
				}
				setState(202);
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
		enterRule(_localctx, 44, RULE_capacity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\u00d0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\5"+
		"\2\63\n\2\6\2\65\n\2\r\2\16\2\66\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\5\4C\n\4\6\4E\n\4\r\4\16\4F\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\5\nd\n\n\6\nf\n\n\r\n\16\ng\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\5\fv\n\f\3\f\3\f\7\fz\n\f\f\f\16\f}\13\f\5\f\177\n\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\5\17\u008b\n\17\3\17\3\17\7\17"+
		"\u008f\n\17\f\17\16\17\u0092\13\17\5\17\u0094\n\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00a5\n\23"+
		"\6\23\u00a7\n\23\r\23\16\23\u00a8\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\26\3\26\5\26\u00b9\n\26\3\26\3\26\7\26\u00bd"+
		"\n\26\f\26\16\26\u00c0\13\26\5\26\u00c2\n\26\3\26\3\26\3\27\3\27\3\27"+
		"\7\27\u00c9\n\27\f\27\16\27\u00cc\13\27\3\30\3\30\3\30\2\2\31\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\3\3\2\17\20\2\u00cc\2\64\3"+
		"\2\2\2\4;\3\2\2\2\6=\3\2\2\2\bJ\3\2\2\2\nV\3\2\2\2\fX\3\2\2\2\16Z\3\2"+
		"\2\2\20\\\3\2\2\2\22^\3\2\2\2\24k\3\2\2\2\26s\3\2\2\2\30\u0082\3\2\2\2"+
		"\32\u0086\3\2\2\2\34\u0088\3\2\2\2\36\u0097\3\2\2\2 \u009b\3\2\2\2\"\u009d"+
		"\3\2\2\2$\u009f\3\2\2\2&\u00ac\3\2\2\2(\u00b4\3\2\2\2*\u00b6\3\2\2\2,"+
		"\u00c5\3\2\2\2.\u00cd\3\2\2\2\60\62\5\4\3\2\61\63\7\24\2\2\62\61\3\2\2"+
		"\2\62\63\3\2\2\2\63\65\3\2\2\2\64\60\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2"+
		"\2\66\67\3\2\2\2\67\3\3\2\2\28<\5$\23\29<\5\22\n\2:<\5\6\4\2;8\3\2\2\2"+
		";9\3\2\2\2;:\3\2\2\2<\5\3\2\2\2=D\7\3\2\2>?\7\24\2\2?@\7\23\2\2@B\5\b"+
		"\5\2AC\7\24\2\2BA\3\2\2\2BC\3\2\2\2CE\3\2\2\2D>\3\2\2\2EF\3\2\2\2FD\3"+
		"\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\4\2\2I\7\3\2\2\2JK\7\5\2\2KL\5\n\6\2LM"+
		"\7\6\2\2MN\5\f\7\2NO\7\6\2\2OP\5.\30\2PQ\7\6\2\2QR\5*\26\2RS\7\6\2\2S"+
		"T\5\16\b\2TU\7\7\2\2U\t\3\2\2\2VW\7\22\2\2W\13\3\2\2\2XY\7\21\2\2Y\r\3"+
		"\2\2\2Z[\7\20\2\2[\17\3\2\2\2\\]\7\21\2\2]\21\3\2\2\2^e\7\b\2\2_`\7\24"+
		"\2\2`a\7\23\2\2ac\5\24\13\2bd\7\24\2\2cb\3\2\2\2cd\3\2\2\2df\3\2\2\2e"+
		"_\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\4\2\2j\23\3\2\2"+
		"\2kl\7\5\2\2lm\5\16\b\2mn\7\6\2\2no\5\20\t\2op\7\6\2\2pq\5\26\f\2qr\7"+
		"\7\2\2r\25\3\2\2\2su\7\t\2\2tv\5\30\r\2ut\3\2\2\2uv\3\2\2\2v~\3\2\2\2"+
		"wx\7\6\2\2xz\5\30\r\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\177\3\2"+
		"\2\2}{\3\2\2\2~{\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7"+
		"\n\2\2\u0081\27\3\2\2\2\u0082\u0083\5\32\16\2\u0083\u0084\7\23\2\2\u0084"+
		"\u0085\5\34\17\2\u0085\31\3\2\2\2\u0086\u0087\7\21\2\2\u0087\33\3\2\2"+
		"\2\u0088\u008a\7\5\2\2\u0089\u008b\5\36\20\2\u008a\u0089\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u0093\3\2\2\2\u008c\u008d\7\6\2\2\u008d\u008f\5\36"+
		"\20\2\u008e\u008c\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0090\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7\7\2\2\u0096"+
		"\35\3\2\2\2\u0097\u0098\5 \21\2\u0098\u0099\7\13\2\2\u0099\u009a\5\"\22"+
		"\2\u009a\37\3\2\2\2\u009b\u009c\t\2\2\2\u009c!\3\2\2\2\u009d\u009e\t\2"+
		"\2\2\u009e#\3\2\2\2\u009f\u00a6\7\f\2\2\u00a0\u00a1\7\24\2\2\u00a1\u00a2"+
		"\7\23\2\2\u00a2\u00a4\5&\24\2\u00a3\u00a5\7\24\2\2\u00a4\u00a3\3\2\2\2"+
		"\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\7\4\2\2\u00ab%\3\2\2\2\u00ac\u00ad\7\5\2\2\u00ad\u00ae\5(\25\2"+
		"\u00ae\u00af\7\6\2\2\u00af\u00b0\5.\30\2\u00b0\u00b1\7\6\2\2\u00b1\u00b2"+
		"\5*\26\2\u00b2\u00b3\7\7\2\2\u00b3\'\3\2\2\2\u00b4\u00b5\7\22\2\2\u00b5"+
		")\3\2\2\2\u00b6\u00b8\7\t\2\2\u00b7\u00b9\5,\27\2\u00b8\u00b7\3\2\2\2"+
		"\u00b8\u00b9\3\2\2\2\u00b9\u00c1\3\2\2\2\u00ba\u00bb\7\6\2\2\u00bb\u00bd"+
		"\5,\27\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00be\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\7\n\2\2\u00c4"+
		"+\3\2\2\2\u00c5\u00ca\7\21\2\2\u00c6\u00c7\7\23\2\2\u00c7\u00c9\7\21\2"+
		"\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb-\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\20\2\2\u00ce"+
		"/\3\2\2\2\25\62\66;BFcgu{~\u008a\u0090\u0093\u00a4\u00a8\u00b8\u00be\u00c1"+
		"\u00ca";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}