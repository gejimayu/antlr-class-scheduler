// Generated from /Users/eshael/Downloads/antlr-class-scheduler/src/Rules/ClassScheduling.g4 by ANTLR 4.7
package Rules;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ClassSchedulingLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, LOWERCASE=11, UPPERCASE=12, DIGIT=13, NUMERIC=14, WORD=15, ALPHANUMERIC=16, 
		WHITESPACE=17, ENTER=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "LOWERCASE", "UPPERCASE", "DIGIT", "NUMERIC", "WORD", "ALPHANUMERIC", 
		"WHITESPACE", "ENTER"
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


	public ClassSchedulingLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ClassScheduling.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u008d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\6\17m\n\17\r\17\16\17n\3\20\3\20\3\20\6"+
		"\20t\n\20\r\20\16\20u\3\21\3\21\3\21\3\21\6\21|\n\21\r\21\16\21}\3\22"+
		"\6\22\u0081\n\22\r\22\16\22\u0082\3\23\5\23\u0086\n\23\3\23\3\23\6\23"+
		"\u008a\n\23\r\23\16\23\u008b\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\6\3\2c|\3\2C"+
		"\\\3\2\62;\4\2\13\13\"\"\2\u0098\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5\67\3\2\2"+
		"\2\79\3\2\2\2\t;\3\2\2\2\13=\3\2\2\2\r?\3\2\2\2\17Q\3\2\2\2\21S\3\2\2"+
		"\2\23U\3\2\2\2\25W\3\2\2\2\27e\3\2\2\2\31g\3\2\2\2\33i\3\2\2\2\35l\3\2"+
		"\2\2\37s\3\2\2\2!{\3\2\2\2#\u0080\3\2\2\2%\u0089\3\2\2\2\'(\7E\2\2()\7"+
		"T\2\2)*\7G\2\2*+\7C\2\2+,\7V\2\2,-\7G\2\2-.\7\"\2\2./\7E\2\2/\60\7Q\2"+
		"\2\60\61\7W\2\2\61\62\7T\2\2\62\63\7U\2\2\63\64\7G\2\2\64\65\7\"\2\2\65"+
		"\66\7}\2\2\66\4\3\2\2\2\678\7\177\2\28\6\3\2\2\29:\7*\2\2:\b\3\2\2\2;"+
		"<\7.\2\2<\n\3\2\2\2=>\7+\2\2>\f\3\2\2\2?@\7E\2\2@A\7T\2\2AB\7G\2\2BC\7"+
		"C\2\2CD\7V\2\2DE\7G\2\2EF\7\"\2\2FG\7N\2\2GH\7G\2\2HI\7E\2\2IJ\7V\2\2"+
		"JK\7W\2\2KL\7T\2\2LM\7G\2\2MN\7T\2\2NO\7\"\2\2OP\7}\2\2P\16\3\2\2\2QR"+
		"\7]\2\2R\20\3\2\2\2ST\7_\2\2T\22\3\2\2\2UV\7/\2\2V\24\3\2\2\2WX\7E\2\2"+
		"XY\7T\2\2YZ\7G\2\2Z[\7C\2\2[\\\7V\2\2\\]\7G\2\2]^\7\"\2\2^_\7T\2\2_`\7"+
		"Q\2\2`a\7Q\2\2ab\7O\2\2bc\7\"\2\2cd\7}\2\2d\26\3\2\2\2ef\t\2\2\2f\30\3"+
		"\2\2\2gh\t\3\2\2h\32\3\2\2\2ij\t\4\2\2j\34\3\2\2\2km\t\4\2\2lk\3\2\2\2"+
		"mn\3\2\2\2nl\3\2\2\2no\3\2\2\2o\36\3\2\2\2pt\5\27\f\2qt\5\31\r\2rt\7a"+
		"\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v \3\2"+
		"\2\2w|\5\27\f\2x|\5\31\r\2y|\5\33\16\2z|\7a\2\2{w\3\2\2\2{x\3\2\2\2{y"+
		"\3\2\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\"\3\2\2\2\177\u0081"+
		"\t\5\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083$\3\2\2\2\u0084\u0086\7\17\2\2\u0085\u0084\3\2\2\2"+
		"\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008a\7\f\2\2\u0088\u008a"+
		"\7\17\2\2\u0089\u0085\3\2\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2"+
		"\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c&\3\2\2\2\f\2nsu{}\u0082"+
		"\u0085\u0089\u008b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}