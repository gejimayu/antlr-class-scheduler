// Generated from D:/Project/tesgrammarantlr\ClassScheduling.g4 by ANTLR 4.7
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\6\17l\n\17\r\17\16\17m\3\20\3\20\3\20\6\20"+
		"s\n\20\r\20\16\20t\3\21\3\21\3\21\3\21\6\21{\n\21\r\21\16\21|\3\22\6\22"+
		"\u0080\n\22\r\22\16\22\u0081\3\23\5\23\u0085\n\23\3\23\3\23\6\23\u0089"+
		"\n\23\r\23\16\23\u008a\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\6\3\2c|\3\2C\\\3\2"+
		"\62;\4\2\13\13\"\"\2\u0097\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5\66\3\2\2\2\78\3"+
		"\2\2\2\t:\3\2\2\2\13<\3\2\2\2\r>\3\2\2\2\17P\3\2\2\2\21R\3\2\2\2\23T\3"+
		"\2\2\2\25V\3\2\2\2\27d\3\2\2\2\31f\3\2\2\2\33h\3\2\2\2\35k\3\2\2\2\37"+
		"r\3\2\2\2!z\3\2\2\2#\177\3\2\2\2%\u0088\3\2\2\2\'(\7E\2\2()\7T\2\2)*\7"+
		"G\2\2*+\7C\2\2+,\7V\2\2,-\7G\2\2-.\7\"\2\2./\7E\2\2/\60\7N\2\2\60\61\7"+
		"C\2\2\61\62\7U\2\2\62\63\7U\2\2\63\64\7\"\2\2\64\65\7}\2\2\65\4\3\2\2"+
		"\2\66\67\7\177\2\2\67\6\3\2\2\289\7*\2\29\b\3\2\2\2:;\7.\2\2;\n\3\2\2"+
		"\2<=\7+\2\2=\f\3\2\2\2>?\7E\2\2?@\7T\2\2@A\7G\2\2AB\7C\2\2BC\7V\2\2CD"+
		"\7G\2\2DE\7\"\2\2EF\7N\2\2FG\7G\2\2GH\7E\2\2HI\7V\2\2IJ\7W\2\2JK\7T\2"+
		"\2KL\7G\2\2LM\7T\2\2MN\7\"\2\2NO\7}\2\2O\16\3\2\2\2PQ\7]\2\2Q\20\3\2\2"+
		"\2RS\7_\2\2S\22\3\2\2\2TU\7/\2\2U\24\3\2\2\2VW\7E\2\2WX\7T\2\2XY\7G\2"+
		"\2YZ\7C\2\2Z[\7V\2\2[\\\7G\2\2\\]\7\"\2\2]^\7T\2\2^_\7Q\2\2_`\7Q\2\2`"+
		"a\7O\2\2ab\7\"\2\2bc\7}\2\2c\26\3\2\2\2de\t\2\2\2e\30\3\2\2\2fg\t\3\2"+
		"\2g\32\3\2\2\2hi\t\4\2\2i\34\3\2\2\2jl\t\4\2\2kj\3\2\2\2lm\3\2\2\2mk\3"+
		"\2\2\2mn\3\2\2\2n\36\3\2\2\2os\5\27\f\2ps\5\31\r\2qs\7a\2\2ro\3\2\2\2"+
		"rp\3\2\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u \3\2\2\2v{\5\27\f"+
		"\2w{\5\31\r\2x{\5\33\16\2y{\7a\2\2zv\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2"+
		"\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\"\3\2\2\2~\u0080\t\5\2\2\177~\3\2"+
		"\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082$"+
		"\3\2\2\2\u0083\u0085\7\17\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2"+
		"\u0085\u0086\3\2\2\2\u0086\u0089\7\f\2\2\u0087\u0089\7\17\2\2\u0088\u0084"+
		"\3\2\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b&\3\2\2\2\f\2mrtz|\u0081\u0084\u0088\u008a\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}