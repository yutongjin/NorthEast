// Generated from /Users/yutongjin/IdeaProjects/NorthEastFun/src/main/antlr4/NorthEastLexer.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, BEGIN=3, END=4, To=5, NEXT=6, REAL=7, BOOLEAN=8, NOTEQUAL=9, 
		AND=10, OR=11, POW=12, ID=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "FLOAT", "BEGIN", "END", "To", "NEXT", "REAL", "BOOLEAN", "NOTEQUAL", 
			"AND", "OR", "POW", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'begin'", "'end'", "'to'", "'next'", "'real'", 
			"'bool'", "'!='", "'&&'", "'||'", "'^'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "BEGIN", "END", "To", "NEXT", "REAL", "BOOLEAN", 
			"NOTEQUAL", "AND", "OR", "POW", "ID", "WS"
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


	public Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NorthEastLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20Y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\6\16R\n\16\r\16\16\16S\3\17\3\17\3"+
		"\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\3\2\3\4\2C\\c|\2Y\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\3\37\3\2\2\2\5#\3\2\2\2\7)\3\2\2\2\t/\3\2\2\2\13\63\3\2\2\2\r\66\3"+
		"\2\2\2\17;\3\2\2\2\21@\3\2\2\2\23E\3\2\2\2\25H\3\2\2\2\27K\3\2\2\2\31"+
		"N\3\2\2\2\33Q\3\2\2\2\35U\3\2\2\2\37 \7k\2\2 !\7p\2\2!\"\7v\2\2\"\4\3"+
		"\2\2\2#$\7h\2\2$%\7n\2\2%&\7q\2\2&\'\7c\2\2\'(\7v\2\2(\6\3\2\2\2)*\7d"+
		"\2\2*+\7g\2\2+,\7i\2\2,-\7k\2\2-.\7p\2\2.\b\3\2\2\2/\60\7g\2\2\60\61\7"+
		"p\2\2\61\62\7f\2\2\62\n\3\2\2\2\63\64\7v\2\2\64\65\7q\2\2\65\f\3\2\2\2"+
		"\66\67\7p\2\2\678\7g\2\289\7z\2\29:\7v\2\2:\16\3\2\2\2;<\7t\2\2<=\7g\2"+
		"\2=>\7c\2\2>?\7n\2\2?\20\3\2\2\2@A\7d\2\2AB\7q\2\2BC\7q\2\2CD\7n\2\2D"+
		"\22\3\2\2\2EF\7#\2\2FG\7?\2\2G\24\3\2\2\2HI\7(\2\2IJ\7(\2\2J\26\3\2\2"+
		"\2KL\7~\2\2LM\7~\2\2M\30\3\2\2\2NO\7`\2\2O\32\3\2\2\2PR\t\2\2\2QP\3\2"+
		"\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\34\3\2\2\2UV\7\"\2\2VW\3\2\2\2WX\b"+
		"\17\2\2X\36\3\2\2\2\4\2S\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}