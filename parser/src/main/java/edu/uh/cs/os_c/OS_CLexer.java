// Generated from /Users/kylebolton/IdeaProjects/os_compiler/parser/src/main/resources/OS_C.g4 by ANTLR 4.5.3
package edu.uh.cs.os_c;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OS_CLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, TypeSpecifier=15, StartParallel=16, 
		EndParallel=17, Identifier=18, Constant=19, Whitespace=20, Newline=21, 
		BlockComment=22, LineComment=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "TypeSpecifier", "StartParallel", 
		"EndParallel", "Identifier", "Constant", "IntegerConstant", "NonzeroDigit", 
		"Digit", "FloatingConstant", "FractionalConstant", "ExponentPart", "Sign", 
		"DigitSequence", "Nondigit", "Whitespace", "Newline", "BlockComment", 
		"LineComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "'{'", "'}'", "','", "'='", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'read('", "'write('", null, "'cobegin'", "'coend'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "TypeSpecifier", "StartParallel", "EndParallel", "Identifier", 
		"Constant", "Whitespace", "Newline", "BlockComment", "LineComment"
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


	public OS_CLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "OS_C.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u00f5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"~\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\7\23\u0091\n\23\f\23\16\23\u0094\13\23\3\24\3\24"+
		"\5\24\u0098\n\24\3\25\3\25\7\25\u009c\n\25\f\25\16\25\u009f\13\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\5\30\u00a7\n\30\3\30\3\30\3\30\5\30\u00ac\n"+
		"\30\3\31\5\31\u00af\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u00b6\n\31\3\32"+
		"\3\32\5\32\u00ba\n\32\3\32\3\32\3\32\5\32\u00bf\n\32\3\32\5\32\u00c2\n"+
		"\32\3\33\3\33\3\34\6\34\u00c7\n\34\r\34\16\34\u00c8\3\35\3\35\3\36\6\36"+
		"\u00ce\n\36\r\36\16\36\u00cf\3\36\3\36\3\37\3\37\5\37\u00d6\n\37\3\37"+
		"\5\37\u00d9\n\37\3\37\3\37\3 \3 \3 \3 \7 \u00e1\n \f \16 \u00e4\13 \3"+
		" \3 \3 \3 \3 \3!\3!\3!\3!\7!\u00ef\n!\f!\16!\u00f2\13!\3!\3!\3\u00e2\2"+
		"\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\26=\27?\30"+
		"A\31\3\2\b\3\2\63;\3\2\62;\4\2--//\5\2C\\aac|\4\2\13\13\"\"\4\2\f\f\17"+
		"\17\u00fd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\3C\3\2\2\2\5E\3\2\2\2\7G\3\2\2\2\tI\3\2\2\2\13K\3\2\2\2\r"+
		"M\3\2\2\2\17O\3\2\2\2\21Q\3\2\2\2\23S\3\2\2\2\25U\3\2\2\2\27W\3\2\2\2"+
		"\31Y\3\2\2\2\33[\3\2\2\2\35a\3\2\2\2\37}\3\2\2\2!\177\3\2\2\2#\u0087\3"+
		"\2\2\2%\u008d\3\2\2\2\'\u0097\3\2\2\2)\u0099\3\2\2\2+\u00a0\3\2\2\2-\u00a2"+
		"\3\2\2\2/\u00ab\3\2\2\2\61\u00b5\3\2\2\2\63\u00c1\3\2\2\2\65\u00c3\3\2"+
		"\2\2\67\u00c6\3\2\2\29\u00ca\3\2\2\2;\u00cd\3\2\2\2=\u00d8\3\2\2\2?\u00dc"+
		"\3\2\2\2A\u00ea\3\2\2\2CD\7=\2\2D\4\3\2\2\2EF\7*\2\2F\6\3\2\2\2GH\7+\2"+
		"\2H\b\3\2\2\2IJ\7}\2\2J\n\3\2\2\2KL\7\177\2\2L\f\3\2\2\2MN\7.\2\2N\16"+
		"\3\2\2\2OP\7?\2\2P\20\3\2\2\2QR\7-\2\2R\22\3\2\2\2ST\7/\2\2T\24\3\2\2"+
		"\2UV\7,\2\2V\26\3\2\2\2WX\7\61\2\2X\30\3\2\2\2YZ\7\'\2\2Z\32\3\2\2\2["+
		"\\\7t\2\2\\]\7g\2\2]^\7c\2\2^_\7f\2\2_`\7*\2\2`\34\3\2\2\2ab\7y\2\2bc"+
		"\7t\2\2cd\7k\2\2de\7v\2\2ef\7g\2\2fg\7*\2\2g\36\3\2\2\2hi\7k\2\2ij\7p"+
		"\2\2jk\7r\2\2kl\7w\2\2lm\7v\2\2mn\7a\2\2no\7x\2\2op\7c\2\2p~\7t\2\2qr"+
		"\7k\2\2rs\7p\2\2st\7v\2\2tu\7g\2\2uv\7t\2\2vw\7p\2\2wx\7c\2\2xy\7n\2\2"+
		"yz\7a\2\2z{\7x\2\2{|\7c\2\2|~\7t\2\2}h\3\2\2\2}q\3\2\2\2~ \3\2\2\2\177"+
		"\u0080\7e\2\2\u0080\u0081\7q\2\2\u0081\u0082\7d\2\2\u0082\u0083\7g\2\2"+
		"\u0083\u0084\7i\2\2\u0084\u0085\7k\2\2\u0085\u0086\7p\2\2\u0086\"\3\2"+
		"\2\2\u0087\u0088\7e\2\2\u0088\u0089\7q\2\2\u0089\u008a\7g\2\2\u008a\u008b"+
		"\7p\2\2\u008b\u008c\7f\2\2\u008c$\3\2\2\2\u008d\u0092\59\35\2\u008e\u0091"+
		"\59\35\2\u008f\u0091\5-\27\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093&\3\2\2\2"+
		"\u0094\u0092\3\2\2\2\u0095\u0098\5)\25\2\u0096\u0098\5/\30\2\u0097\u0095"+
		"\3\2\2\2\u0097\u0096\3\2\2\2\u0098(\3\2\2\2\u0099\u009d\5+\26\2\u009a"+
		"\u009c\5-\27\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e*\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1"+
		"\t\2\2\2\u00a1,\3\2\2\2\u00a2\u00a3\t\3\2\2\u00a3.\3\2\2\2\u00a4\u00a6"+
		"\5\61\31\2\u00a5\u00a7\5\63\32\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2"+
		"\2\u00a7\u00ac\3\2\2\2\u00a8\u00a9\5\67\34\2\u00a9\u00aa\5\63\32\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u00a4\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ac\60\3\2\2"+
		"\2\u00ad\u00af\5\67\34\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\7\60\2\2\u00b1\u00b6\5\67\34\2\u00b2\u00b3"+
		"\5\67\34\2\u00b3\u00b4\7\60\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00ae\3\2\2"+
		"\2\u00b5\u00b2\3\2\2\2\u00b6\62\3\2\2\2\u00b7\u00b9\7g\2\2\u00b8\u00ba"+
		"\5\65\33\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2"+
		"\u00bb\u00c2\5\67\34\2\u00bc\u00be\7G\2\2\u00bd\u00bf\5\65\33\2\u00be"+
		"\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\5\67"+
		"\34\2\u00c1\u00b7\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c2\64\3\2\2\2\u00c3\u00c4"+
		"\t\4\2\2\u00c4\66\3\2\2\2\u00c5\u00c7\5-\27\2\u00c6\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c98\3\2\2\2"+
		"\u00ca\u00cb\t\5\2\2\u00cb:\3\2\2\2\u00cc\u00ce\t\6\2\2\u00cd\u00cc\3"+
		"\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\b\36\2\2\u00d2<\3\2\2\2\u00d3\u00d5\7\17\2"+
		"\2\u00d4\u00d6\7\f\2\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d9"+
		"\3\2\2\2\u00d7\u00d9\7\f\2\2\u00d8\u00d3\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00db\b\37\2\2\u00db>\3\2\2\2\u00dc\u00dd\7\61\2"+
		"\2\u00dd\u00de\7,\2\2\u00de\u00e2\3\2\2\2\u00df\u00e1\13\2\2\2\u00e0\u00df"+
		"\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7,\2\2\u00e6\u00e7\7\61"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\b \2\2\u00e9@\3\2\2\2\u00ea\u00eb"+
		"\7\61\2\2\u00eb\u00ec\7\61\2\2\u00ec\u00f0\3\2\2\2\u00ed\u00ef\n\7\2\2"+
		"\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\b!\2\2\u00f4"+
		"B\3\2\2\2\25\2}\u0090\u0092\u0097\u009d\u00a6\u00ab\u00ae\u00b5\u00b9"+
		"\u00be\u00c1\u00c8\u00cf\u00d5\u00d8\u00e2\u00f0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}