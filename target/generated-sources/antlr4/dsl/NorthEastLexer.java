// Generated from dsl/NorthEastLexer.g4 by ANTLR 4.7
package dsl;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NorthEastLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, BEGIN=3, END=4, To=5, NEXT=6, REAL=7, BOOLEAN=8, NOTEQUAL=9, 
		AND=10, OR=11, POW=12, ID=13, STRING=14, NUM=15, PRINT=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "FLOAT", "BEGIN", "END", "To", "NEXT", "REAL", "BOOLEAN", "NOTEQUAL", 
		"AND", "OR", "POW", "ID", "STRING", "NUM", "PRINT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'float'", "'begin'", "'end'", "'to'", "'next'", "'real'", 
		"'bool'", "'!='", "'&&'", "'||'", "'^'", null, null, null, "'\u6574\u4E24\u53E5'", 
		"' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "FLOAT", "BEGIN", "END", "To", "NEXT", "REAL", "BOOLEAN", 
		"NOTEQUAL", "AND", "OR", "POW", "ID", "STRING", "NUM", "PRINT", "WS"
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


	public NorthEastLexer(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23u\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\6\16"+
		"X\n\16\r\16\16\16Y\3\17\3\17\3\17\3\17\6\17`\n\17\r\17\16\17a\3\17\3\17"+
		"\3\17\3\20\6\20h\n\20\r\20\16\20i\5\20l\n\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3a\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\4\4\2C\\c|\3\2\62;\2x\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3"+
		"%\3\2\2\2\5)\3\2\2\2\7/\3\2\2\2\t\65\3\2\2\2\139\3\2\2\2\r<\3\2\2\2\17"+
		"A\3\2\2\2\21F\3\2\2\2\23K\3\2\2\2\25N\3\2\2\2\27Q\3\2\2\2\31T\3\2\2\2"+
		"\33W\3\2\2\2\35[\3\2\2\2\37k\3\2\2\2!m\3\2\2\2#q\3\2\2\2%&\7k\2\2&\'\7"+
		"p\2\2\'(\7v\2\2(\4\3\2\2\2)*\7h\2\2*+\7n\2\2+,\7q\2\2,-\7c\2\2-.\7v\2"+
		"\2.\6\3\2\2\2/\60\7d\2\2\60\61\7g\2\2\61\62\7i\2\2\62\63\7k\2\2\63\64"+
		"\7p\2\2\64\b\3\2\2\2\65\66\7g\2\2\66\67\7p\2\2\678\7f\2\28\n\3\2\2\29"+
		":\7v\2\2:;\7q\2\2;\f\3\2\2\2<=\7p\2\2=>\7g\2\2>?\7z\2\2?@\7v\2\2@\16\3"+
		"\2\2\2AB\7t\2\2BC\7g\2\2CD\7c\2\2DE\7n\2\2E\20\3\2\2\2FG\7d\2\2GH\7q\2"+
		"\2HI\7q\2\2IJ\7n\2\2J\22\3\2\2\2KL\7#\2\2LM\7?\2\2M\24\3\2\2\2NO\7(\2"+
		"\2OP\7(\2\2P\26\3\2\2\2QR\7~\2\2RS\7~\2\2S\30\3\2\2\2TU\7`\2\2U\32\3\2"+
		"\2\2VX\t\2\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\34\3\2\2\2[\\"+
		"\7}\2\2\\]\7}\2\2]_\3\2\2\2^`\13\2\2\2_^\3\2\2\2`a\3\2\2\2ab\3\2\2\2a"+
		"_\3\2\2\2bc\3\2\2\2cd\7\177\2\2de\7\177\2\2e\36\3\2\2\2fh\t\3\2\2gf\3"+
		"\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2kg\3\2\2\2kl\3\2\2\2l \3"+
		"\2\2\2mn\7\u6576\2\2no\7\u4e26\2\2op\7\u53e7\2\2p\"\3\2\2\2qr\7\"\2\2"+
		"rs\3\2\2\2st\b\22\2\2t$\3\2\2\2\7\2Yaik\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}