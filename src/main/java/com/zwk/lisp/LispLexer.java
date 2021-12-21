// Generated from D:/tools/workspace/lisp/src/main/java/com/zwk/lisp\Lisp.g4 by ANTLR 4.9.2
package com.zwk.lisp;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LispLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPERATOR=1, AGGFUNC=2, LPAREN=3, RPAREN=4, COUNT=5, SUM=6, AVG=7, MAX=8, 
		MIN=9, CAST=10, CALL=11, CASE=12, INTWORD=13, STRINGWORD=14, AND=15, OR=16, 
		ORIGIN=17, INT=18, DOUBLE=19, ID=20, STRING=21, COMMENT=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OPERATOR", "AGGFUNC", "LPAREN", "RPAREN", "COUNT", "SUM", "AVG", "MAX", 
			"MIN", "CAST", "CALL", "CASE", "INTWORD", "STRINGWORD", "AND", "OR", 
			"ORIGIN", "INT", "DOUBLE", "ID", "STRING", "LETTER", "DIGIT", "MUL", 
			"DIV", "PLUS", "SUB", "EQUAL", "GT", "LT", "GE", "LE", "NE", "COMMENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'('", "')'", "'COUNT'", "'SUM'", "'AVG'", "'MAX'", 
			"'MIN'", "'CAST'", "'CALL'", "'CASE'", "'INT'", "'STRING'", "'AND'", 
			"'OR'", "'ORIGIN'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPERATOR", "AGGFUNC", "LPAREN", "RPAREN", "COUNT", "SUM", "AVG", 
			"MAX", "MIN", "CAST", "CALL", "CASE", "INTWORD", "STRINGWORD", "AND", 
			"OR", "ORIGIN", "INT", "DOUBLE", "ID", "STRING", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public LispLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lisp.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00ea\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5"+
		"\2T\n\2\3\3\3\3\3\3\3\3\3\3\5\3[\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\6\23\u00a0\n\23"+
		"\r\23\16\23\u00a1\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00ac\n"+
		"\25\f\25\16\25\u00af\13\25\3\26\3\26\3\26\3\26\6\26\u00b5\n\26\r\26\16"+
		"\26\u00b6\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\""+
		"\3\"\5\"\u00d7\n\"\3#\3#\3#\3#\7#\u00dd\n#\f#\16#\u00e0\13#\3#\3#\3#\3"+
		"#\3#\3$\3$\3$\3$\3\u00de\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\2/\2\61\2\63"+
		"\2\65\2\67\29\2;\2=\2?\2A\2C\2E\30G\31\3\2\6\3\2))\3\2C\\\3\2\62;\5\2"+
		"\13\f\17\17\"\"\2\u00f2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\3S\3\2\2\2\5Z\3\2\2\2\7\\\3\2\2\2\t^\3\2\2\2"+
		"\13`\3\2\2\2\rf\3\2\2\2\17j\3\2\2\2\21n\3\2\2\2\23r\3\2\2\2\25v\3\2\2"+
		"\2\27{\3\2\2\2\31\u0080\3\2\2\2\33\u0085\3\2\2\2\35\u0089\3\2\2\2\37\u0090"+
		"\3\2\2\2!\u0094\3\2\2\2#\u0097\3\2\2\2%\u009f\3\2\2\2\'\u00a3\3\2\2\2"+
		")\u00a7\3\2\2\2+\u00b0\3\2\2\2-\u00ba\3\2\2\2/\u00bc\3\2\2\2\61\u00be"+
		"\3\2\2\2\63\u00c0\3\2\2\2\65\u00c2\3\2\2\2\67\u00c4\3\2\2\29\u00c6\3\2"+
		"\2\2;\u00c8\3\2\2\2=\u00ca\3\2\2\2?\u00cc\3\2\2\2A\u00cf\3\2\2\2C\u00d6"+
		"\3\2\2\2E\u00d8\3\2\2\2G\u00e6\3\2\2\2IT\5\61\31\2JT\5\63\32\2KT\5\65"+
		"\33\2LT\5\67\34\2MT\59\35\2NT\5;\36\2OT\5=\37\2PT\5? \2QT\5A!\2RT\5C\""+
		"\2SI\3\2\2\2SJ\3\2\2\2SK\3\2\2\2SL\3\2\2\2SM\3\2\2\2SN\3\2\2\2SO\3\2\2"+
		"\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T\4\3\2\2\2U[\5\13\6\2V[\5\r\7\2W[\5\17"+
		"\b\2X[\5\21\t\2Y[\5\23\n\2ZU\3\2\2\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3"+
		"\2\2\2[\6\3\2\2\2\\]\7*\2\2]\b\3\2\2\2^_\7+\2\2_\n\3\2\2\2`a\7E\2\2ab"+
		"\7Q\2\2bc\7W\2\2cd\7P\2\2de\7V\2\2e\f\3\2\2\2fg\7U\2\2gh\7W\2\2hi\7O\2"+
		"\2i\16\3\2\2\2jk\7C\2\2kl\7X\2\2lm\7I\2\2m\20\3\2\2\2no\7O\2\2op\7C\2"+
		"\2pq\7Z\2\2q\22\3\2\2\2rs\7O\2\2st\7K\2\2tu\7P\2\2u\24\3\2\2\2vw\7E\2"+
		"\2wx\7C\2\2xy\7U\2\2yz\7V\2\2z\26\3\2\2\2{|\7E\2\2|}\7C\2\2}~\7N\2\2~"+
		"\177\7N\2\2\177\30\3\2\2\2\u0080\u0081\7E\2\2\u0081\u0082\7C\2\2\u0082"+
		"\u0083\7U\2\2\u0083\u0084\7G\2\2\u0084\32\3\2\2\2\u0085\u0086\7K\2\2\u0086"+
		"\u0087\7P\2\2\u0087\u0088\7V\2\2\u0088\34\3\2\2\2\u0089\u008a\7U\2\2\u008a"+
		"\u008b\7V\2\2\u008b\u008c\7T\2\2\u008c\u008d\7K\2\2\u008d\u008e\7P\2\2"+
		"\u008e\u008f\7I\2\2\u008f\36\3\2\2\2\u0090\u0091\7C\2\2\u0091\u0092\7"+
		"P\2\2\u0092\u0093\7F\2\2\u0093 \3\2\2\2\u0094\u0095\7Q\2\2\u0095\u0096"+
		"\7T\2\2\u0096\"\3\2\2\2\u0097\u0098\7Q\2\2\u0098\u0099\7T\2\2\u0099\u009a"+
		"\7K\2\2\u009a\u009b\7I\2\2\u009b\u009c\7K\2\2\u009c\u009d\7P\2\2\u009d"+
		"$\3\2\2\2\u009e\u00a0\5/\30\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2"+
		"\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2&\3\2\2\2\u00a3\u00a4\5"+
		"%\23\2\u00a4\u00a5\7\60\2\2\u00a5\u00a6\5%\23\2\u00a6(\3\2\2\2\u00a7\u00ad"+
		"\5-\27\2\u00a8\u00ac\5-\27\2\u00a9\u00ac\5/\30\2\u00aa\u00ac\7a\2\2\u00ab"+
		"\u00a8\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae*\3\2\2\2\u00af\u00ad"+
		"\3\2\2\2\u00b0\u00b4\7)\2\2\u00b1\u00b2\7^\2\2\u00b2\u00b5\7)\2\2\u00b3"+
		"\u00b5\n\2\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00b9\7)\2\2\u00b9,\3\2\2\2\u00ba\u00bb\t\3\2\2\u00bb.\3\2\2\2\u00bc"+
		"\u00bd\t\4\2\2\u00bd\60\3\2\2\2\u00be\u00bf\7,\2\2\u00bf\62\3\2\2\2\u00c0"+
		"\u00c1\7\61\2\2\u00c1\64\3\2\2\2\u00c2\u00c3\7-\2\2\u00c3\66\3\2\2\2\u00c4"+
		"\u00c5\7/\2\2\u00c58\3\2\2\2\u00c6\u00c7\7?\2\2\u00c7:\3\2\2\2\u00c8\u00c9"+
		"\7@\2\2\u00c9<\3\2\2\2\u00ca\u00cb\7>\2\2\u00cb>\3\2\2\2\u00cc\u00cd\7"+
		"@\2\2\u00cd\u00ce\7?\2\2\u00ce@\3\2\2\2\u00cf\u00d0\7>\2\2\u00d0\u00d1"+
		"\7?\2\2\u00d1B\3\2\2\2\u00d2\u00d3\7>\2\2\u00d3\u00d7\7@\2\2\u00d4\u00d5"+
		"\7#\2\2\u00d5\u00d7\7?\2\2\u00d6\u00d2\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"D\3\2\2\2\u00d8\u00d9\7\61\2\2\u00d9\u00da\7,\2\2\u00da\u00de\3\2\2\2"+
		"\u00db\u00dd\13\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00df"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e2\7,\2\2\u00e2\u00e3\7\61\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\b#"+
		"\2\2\u00e5F\3\2\2\2\u00e6\u00e7\t\5\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9"+
		"\b$\2\2\u00e9H\3\2\2\2\f\2SZ\u00a1\u00ab\u00ad\u00b4\u00b6\u00d6\u00de"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}