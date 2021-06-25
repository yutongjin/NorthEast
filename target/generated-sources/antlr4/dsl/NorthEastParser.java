// Generated from dsl/NorthEastParser.g4 by ANTLR 4.7
package dsl;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NorthEastParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, BEGIN=3, END=4, To=5, NEXT=6, REAL=7, BOOLEAN=8, NOTEQUAL=9, 
		AND=10, OR=11, POW=12, ID=13, STRING=14, NUM=15, PRINT=16, WS=17;
	public static final int
		RULE_spec = 0, RULE_statements = 1, RULE_statement = 2, RULE_printstatement = 3, 
		RULE_vartype = 4;
	public static final String[] ruleNames = {
		"spec", "statements", "statement", "printstatement", "vartype"
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

	@Override
	public String getGrammarFileName() { return "NorthEastParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NorthEastParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SpecContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(NorthEastParser.EOF, 0); }
		public SpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NorthEastParserListener ) ((NorthEastParserListener)listener).enterSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NorthEastParserListener ) ((NorthEastParserListener)listener).exitSpec(this);
		}
	}

	public final SpecContext spec() throws RecognitionException {
		SpecContext _localctx = new SpecContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			statements();
			setState(11);
			match(EOF);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NorthEastParserListener ) ((NorthEastParserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NorthEastParserListener ) ((NorthEastParserListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(13);
				statement();
				}
				}
				setState(16); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PRINT );
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

	public static class StatementContext extends ParserRuleContext {
		public PrintstatementContext printstatement() {
			return getRuleContext(PrintstatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NorthEastParserListener ) ((NorthEastParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NorthEastParserListener ) ((NorthEastParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			printstatement();
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

	public static class PrintstatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(NorthEastParser.PRINT, 0); }
		public TerminalNode STRING() { return getToken(NorthEastParser.STRING, 0); }
		public PrintstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NorthEastParserListener ) ((NorthEastParserListener)listener).enterPrintstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NorthEastParserListener ) ((NorthEastParserListener)listener).exitPrintstatement(this);
		}
	}

	public final PrintstatementContext printstatement() throws RecognitionException {
		PrintstatementContext _localctx = new PrintstatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_printstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(PRINT);
			setState(21);
			match(STRING);
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

	public static class VartypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(NorthEastParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(NorthEastParser.FLOAT, 0); }
		public VartypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vartype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NorthEastParserListener ) ((NorthEastParserListener)listener).enterVartype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NorthEastParserListener ) ((NorthEastParserListener)listener).exitVartype(this);
		}
	}

	public final VartypeContext vartype() throws RecognitionException {
		VartypeContext _localctx = new VartypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vartype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\34\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\3\6\3\21\n\3\r\3\16\3\22\3"+
		"\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\3\3\2\3\4\2\27\2\f\3"+
		"\2\2\2\4\20\3\2\2\2\6\24\3\2\2\2\b\26\3\2\2\2\n\31\3\2\2\2\f\r\5\4\3\2"+
		"\r\16\7\2\2\3\16\3\3\2\2\2\17\21\5\6\4\2\20\17\3\2\2\2\21\22\3\2\2\2\22"+
		"\20\3\2\2\2\22\23\3\2\2\2\23\5\3\2\2\2\24\25\5\b\5\2\25\7\3\2\2\2\26\27"+
		"\7\22\2\2\27\30\7\20\2\2\30\t\3\2\2\2\31\32\t\2\2\2\32\13\3\2\2\2\3\22";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}