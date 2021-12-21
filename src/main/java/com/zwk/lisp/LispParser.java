// Generated from D:/tools/workspace/lisp/src/main/java/com/zwk/lisp\Lisp.g4 by ANTLR 4.9.2
package com.zwk.lisp;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LispParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPERATOR=1, AGGFUNC=2, LPAREN=3, RPAREN=4, COUNT=5, SUM=6, AVG=7, MAX=8, 
		MIN=9, CAST=10, CALL=11, CASE=12, INTWORD=13, STRINGWORD=14, AND=15, OR=16, 
		NULL=17, IS=18, NOT=19, ORIGIN=20, INT=21, DOUBLE=22, ID=23, STRING=24, 
		COMMENT=25, WS=26;
	public static final int
		RULE_lisp = 0, RULE_parseExpresion = 1, RULE_aggregate = 2, RULE_calculate = 3, 
		RULE_commonExpression = 4, RULE_caseBranch = 5, RULE_cast = 6, RULE_call = 7, 
		RULE_castType = 8, RULE_whenClause = 9, RULE_simpleClause = 10, RULE_conditionClause = 11, 
		RULE_valueExpression = 12, RULE_intValue = 13, RULE_string = 14, RULE_origin = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"lisp", "parseExpresion", "aggregate", "calculate", "commonExpression", 
			"caseBranch", "cast", "call", "castType", "whenClause", "simpleClause", 
			"conditionClause", "valueExpression", "intValue", "string", "origin"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'('", "')'", "'COUNT'", "'SUM'", "'AVG'", "'MAX'", 
			"'MIN'", "'CAST'", "'CALL'", "'CASE'", "'INT'", "'STRING'", "'AND'", 
			"'OR'", "'NULL'", "'IS'", "'NOT'", "'ORIGIN'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPERATOR", "AGGFUNC", "LPAREN", "RPAREN", "COUNT", "SUM", "AVG", 
			"MAX", "MIN", "CAST", "CALL", "CASE", "INTWORD", "STRINGWORD", "AND", 
			"OR", "NULL", "IS", "NOT", "ORIGIN", "INT", "DOUBLE", "ID", "STRING", 
			"COMMENT", "WS"
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

	@Override
	public String getGrammarFileName() { return "Lisp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LispParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class LispContext extends ParserRuleContext {
		public ParseExpresionContext parseExpresion() {
			return getRuleContext(ParseExpresionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LispParser.EOF, 0); }
		public LispContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lisp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterLisp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitLisp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitLisp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LispContext lisp() throws RecognitionException {
		LispContext _localctx = new LispContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lisp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			parseExpresion();
			setState(33);
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

	public static class ParseExpresionContext extends ParserRuleContext {
		public ParseExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseExpresion; }
	 
		public ParseExpresionContext() { }
		public void copyFrom(ParseExpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AggregateExpressionContext extends ParseExpresionContext {
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public AggregateExpressionContext(ParseExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterAggregateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitAggregateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitAggregateExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastExpressionContext extends ParseExpresionContext {
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public CastExpressionContext(ParseExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallExpressionContext extends ParseExpresionContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public CallExpressionContext(ParseExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaseExpressionContext extends ParseExpresionContext {
		public CaseBranchContext caseBranch() {
			return getRuleContext(CaseBranchContext.class,0);
		}
		public CaseExpressionContext(ParseExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterCaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitCaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitCaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CalculateExpressionContext extends ParseExpresionContext {
		public CalculateContext calculate() {
			return getRuleContext(CalculateContext.class,0);
		}
		public CalculateExpressionContext(ParseExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterCalculateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitCalculateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitCalculateExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseExpresionContext parseExpresion() throws RecognitionException {
		ParseExpresionContext _localctx = new ParseExpresionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_parseExpresion);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new AggregateExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				aggregate();
				}
				break;
			case 2:
				_localctx = new CalculateExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				calculate();
				}
				break;
			case 3:
				_localctx = new CaseExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				caseBranch();
				}
				break;
			case 4:
				_localctx = new CastExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				cast();
				}
				break;
			case 5:
				_localctx = new CallExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				call();
				}
				break;
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

	public static class AggregateContext extends ParserRuleContext {
		public Token aggFuncName;
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public TerminalNode AGGFUNC() { return getToken(LispParser.AGGFUNC, 0); }
		public TerminalNode INT() { return getToken(LispParser.INT, 0); }
		public ParseExpresionContext parseExpresion() {
			return getRuleContext(ParseExpresionContext.class,0);
		}
		public AggregateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterAggregate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitAggregate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitAggregate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateContext aggregate() throws RecognitionException {
		AggregateContext _localctx = new AggregateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_aggregate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(LPAREN);
			setState(43);
			((AggregateContext)_localctx).aggFuncName = match(AGGFUNC);
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(44);
				match(INT);
				}
				break;
			case LPAREN:
				{
				setState(45);
				parseExpresion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(48);
			match(RPAREN);
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

	public static class CalculateContext extends ParserRuleContext {
		public Token op;
		public CommonExpressionContext left;
		public CommonExpressionContext right;
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public TerminalNode OPERATOR() { return getToken(LispParser.OPERATOR, 0); }
		public List<CommonExpressionContext> commonExpression() {
			return getRuleContexts(CommonExpressionContext.class);
		}
		public CommonExpressionContext commonExpression(int i) {
			return getRuleContext(CommonExpressionContext.class,i);
		}
		public CalculateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterCalculate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitCalculate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitCalculate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalculateContext calculate() throws RecognitionException {
		CalculateContext _localctx = new CalculateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_calculate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(LPAREN);
			setState(51);
			((CalculateContext)_localctx).op = match(OPERATOR);
			setState(52);
			((CalculateContext)_localctx).left = commonExpression();
			setState(53);
			((CalculateContext)_localctx).right = commonExpression();
			setState(54);
			match(RPAREN);
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

	public static class CommonExpressionContext extends ParserRuleContext {
		public CommonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonExpression; }
	 
		public CommonExpressionContext() { }
		public void copyFrom(CommonExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CommonValueExpressionContext extends CommonExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public CommonValueExpressionContext(CommonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterCommonValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitCommonValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitCommonValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommonParseExpressionContext extends CommonExpressionContext {
		public ParseExpresionContext parseExpresion() {
			return getRuleContext(ParseExpresionContext.class,0);
		}
		public CommonParseExpressionContext(CommonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterCommonParseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitCommonParseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitCommonParseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonExpressionContext commonExpression() throws RecognitionException {
		CommonExpressionContext _localctx = new CommonExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_commonExpression);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new CommonValueExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				valueExpression();
				}
				break;
			case 2:
				_localctx = new CommonParseExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				parseExpresion();
				}
				break;
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

	public static class CaseBranchContext extends ParserRuleContext {
		public CaseBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBranch; }
	 
		public CaseBranchContext() { }
		public void copyFrom(CaseBranchContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleCaseContext extends CaseBranchContext {
		public Token id;
		public ValueExpressionContext elseValue;
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public TerminalNode CASE() { return getToken(LispParser.CASE, 0); }
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public TerminalNode INT() { return getToken(LispParser.INT, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SimpleCaseContext(CaseBranchContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionCaseContext extends CaseBranchContext {
		public ValueExpressionContext elseValue;
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public TerminalNode CASE() { return getToken(LispParser.CASE, 0); }
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ConditionCaseContext(CaseBranchContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterConditionCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitConditionCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitConditionCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBranchContext caseBranch() throws RecognitionException {
		CaseBranchContext _localctx = new CaseBranchContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_caseBranch);
		int _la;
		try {
			int _alt;
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new ConditionCaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(LPAREN);
				setState(61);
				match(CASE);
				setState(63); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(62);
						whenClause();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(65); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << NULL) | (1L << INT) | (1L << DOUBLE) | (1L << STRING))) != 0)) {
					{
					setState(67);
					((ConditionCaseContext)_localctx).elseValue = valueExpression();
					}
				}

				setState(70);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new SimpleCaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(LPAREN);
				setState(73);
				match(CASE);
				setState(74);
				((SimpleCaseContext)_localctx).id = match(INT);
				setState(76); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(75);
						whenClause();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(78); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << NULL) | (1L << INT) | (1L << DOUBLE) | (1L << STRING))) != 0)) {
					{
					setState(80);
					((SimpleCaseContext)_localctx).elseValue = valueExpression();
					}
				}

				setState(83);
				match(RPAREN);
				}
				break;
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

	public static class CastContext extends ParserRuleContext {
		public CastTypeContext type;
		public Token id;
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public TerminalNode CAST() { return getToken(LispParser.CAST, 0); }
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public CastTypeContext castType() {
			return getRuleContext(CastTypeContext.class,0);
		}
		public TerminalNode INT() { return getToken(LispParser.INT, 0); }
		public CastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastContext cast() throws RecognitionException {
		CastContext _localctx = new CastContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(LPAREN);
			setState(88);
			match(CAST);
			setState(89);
			((CastContext)_localctx).type = castType();
			setState(90);
			((CastContext)_localctx).id = match(INT);
			setState(91);
			match(RPAREN);
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

	public static class CallContext extends ParserRuleContext {
		public Token funcName;
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public TerminalNode CALL() { return getToken(LispParser.CALL, 0); }
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(LispParser.ID, 0); }
		public List<CommonExpressionContext> commonExpression() {
			return getRuleContexts(CommonExpressionContext.class);
		}
		public CommonExpressionContext commonExpression(int i) {
			return getRuleContext(CommonExpressionContext.class,i);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(LPAREN);
			setState(94);
			match(CALL);
			setState(95);
			((CallContext)_localctx).funcName = match(ID);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << NULL) | (1L << INT) | (1L << DOUBLE) | (1L << STRING))) != 0)) {
				{
				{
				setState(96);
				commonExpression();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(RPAREN);
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

	public static class CastTypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LispParser.ID, 0); }
		public TerminalNode STRINGWORD() { return getToken(LispParser.STRINGWORD, 0); }
		public TerminalNode INTWORD() { return getToken(LispParser.INTWORD, 0); }
		public TerminalNode STRING() { return getToken(LispParser.STRING, 0); }
		public CastTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterCastType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitCastType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitCastType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastTypeContext castType() throws RecognitionException {
		CastTypeContext _localctx = new CastTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_castType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTWORD) | (1L << STRINGWORD) | (1L << ID) | (1L << STRING))) != 0)) ) {
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

	public static class WhenClauseContext extends ParserRuleContext {
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
	 
		public WhenClauseContext() { }
		public void copyFrom(WhenClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleWhenClauseContext extends WhenClauseContext {
		public SimpleClauseContext cond;
		public ValueExpressionContext value;
		public SimpleClauseContext simpleClause() {
			return getRuleContext(SimpleClauseContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SimpleWhenClauseContext(WhenClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterSimpleWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitSimpleWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitSimpleWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionWhenClauseContext extends WhenClauseContext {
		public ConditionClauseContext cond;
		public ValueExpressionContext value;
		public ConditionClauseContext conditionClause() {
			return getRuleContext(ConditionClauseContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ConditionWhenClauseContext(WhenClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterConditionWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitConditionWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitConditionWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whenClause);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new SimpleWhenClauseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				((SimpleWhenClauseContext)_localctx).cond = simpleClause();
				setState(107);
				((SimpleWhenClauseContext)_localctx).value = valueExpression();
				}
				break;
			case 2:
				_localctx = new ConditionWhenClauseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				((ConditionWhenClauseContext)_localctx).cond = conditionClause();
				setState(110);
				((ConditionWhenClauseContext)_localctx).value = valueExpression();
				}
				break;
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

	public static class SimpleClauseContext extends ParserRuleContext {
		public ValueExpressionContext cond;
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SimpleClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterSimpleClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitSimpleClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitSimpleClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleClauseContext simpleClause() throws RecognitionException {
		SimpleClauseContext _localctx = new SimpleClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_simpleClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(LPAREN);
			setState(115);
			((SimpleClauseContext)_localctx).cond = valueExpression();
			setState(116);
			match(RPAREN);
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

	public static class ConditionClauseContext extends ParserRuleContext {
		public ConditionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionClause; }
	 
		public ConditionClauseContext() { }
		public void copyFrom(ConditionClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiConditionClauseContext extends ConditionClauseContext {
		public Token op;
		public ConditionClauseContext left;
		public ConditionClauseContext right;
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public List<ConditionClauseContext> conditionClause() {
			return getRuleContexts(ConditionClauseContext.class);
		}
		public ConditionClauseContext conditionClause(int i) {
			return getRuleContext(ConditionClauseContext.class,i);
		}
		public TerminalNode AND() { return getToken(LispParser.AND, 0); }
		public TerminalNode OR() { return getToken(LispParser.OR, 0); }
		public MultiConditionClauseContext(ConditionClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterMultiConditionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitMultiConditionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitMultiConditionClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleConditionClauseContext extends ConditionClauseContext {
		public Token op;
		public Token not;
		public Token id;
		public ValueExpressionContext cond;
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public TerminalNode OPERATOR() { return getToken(LispParser.OPERATOR, 0); }
		public TerminalNode INT() { return getToken(LispParser.INT, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(LispParser.NOT, 0); }
		public SingleConditionClauseContext(ConditionClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterSingleConditionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitSingleConditionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitSingleConditionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionClauseContext conditionClause() throws RecognitionException {
		ConditionClauseContext _localctx = new ConditionClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conditionClause);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new SingleConditionClauseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(LPAREN);
				setState(119);
				((SingleConditionClauseContext)_localctx).op = match(OPERATOR);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(120);
					((SingleConditionClauseContext)_localctx).not = match(NOT);
					}
				}

				setState(123);
				((SingleConditionClauseContext)_localctx).id = match(INT);
				setState(124);
				((SingleConditionClauseContext)_localctx).cond = valueExpression();
				setState(125);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new MultiConditionClauseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(LPAREN);
				setState(128);
				((MultiConditionClauseContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
					((MultiConditionClauseContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(129);
				((MultiConditionClauseContext)_localctx).left = conditionClause();
				setState(130);
				((MultiConditionClauseContext)_localctx).right = conditionClause();
				setState(131);
				match(RPAREN);
				}
				break;
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

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntValueExpressionContext extends ValueExpressionContext {
		public IntValueContext intValue() {
			return getRuleContext(IntValueContext.class,0);
		}
		public IntValueExpressionContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterIntValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitIntValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitIntValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullLiteralValueExpressionContext extends ValueExpressionContext {
		public TerminalNode NULL() { return getToken(LispParser.NULL, 0); }
		public NullLiteralValueExpressionContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterNullLiteralValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitNullLiteralValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitNullLiteralValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringValueExpressionContext extends ValueExpressionContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringValueExpressionContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterStringValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitStringValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitStringValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLiteralValueExpressionContext extends ValueExpressionContext {
		public TerminalNode INT() { return getToken(LispParser.INT, 0); }
		public IntLiteralValueExpressionContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterIntLiteralValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitIntLiteralValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitIntLiteralValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralValueExpressionContext extends ValueExpressionContext {
		public TerminalNode STRING() { return getToken(LispParser.STRING, 0); }
		public StringLiteralValueExpressionContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterStringLiteralValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitStringLiteralValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitStringLiteralValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralValueExpressionContext extends ValueExpressionContext {
		public TerminalNode DOUBLE() { return getToken(LispParser.DOUBLE, 0); }
		public DoubleLiteralValueExpressionContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterDoubleLiteralValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitDoubleLiteralValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitDoubleLiteralValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OriginValueExpressionContext extends ValueExpressionContext {
		public OriginContext origin() {
			return getRuleContext(OriginContext.class,0);
		}
		public OriginValueExpressionContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterOriginValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitOriginValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitOriginValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_valueExpression);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new IntLiteralValueExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(INT);
				}
				break;
			case 2:
				_localctx = new DoubleLiteralValueExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(DOUBLE);
				}
				break;
			case 3:
				_localctx = new StringLiteralValueExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NullLiteralValueExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				match(NULL);
				}
				break;
			case 5:
				_localctx = new IntValueExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				intValue();
				}
				break;
			case 6:
				_localctx = new StringValueExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(140);
				string();
				}
				break;
			case 7:
				_localctx = new OriginValueExpressionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(141);
				origin();
				}
				break;
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

	public static class IntValueContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public TerminalNode INTWORD() { return getToken(LispParser.INTWORD, 0); }
		public TerminalNode INT() { return getToken(LispParser.INT, 0); }
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public IntValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterIntValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitIntValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitIntValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntValueContext intValue() throws RecognitionException {
		IntValueContext _localctx = new IntValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_intValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(LPAREN);
			setState(145);
			match(INTWORD);
			setState(146);
			match(INT);
			setState(147);
			match(RPAREN);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public TerminalNode STRINGWORD() { return getToken(LispParser.STRINGWORD, 0); }
		public TerminalNode STRING() { return getToken(LispParser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(LPAREN);
			setState(150);
			match(STRINGWORD);
			setState(151);
			match(STRING);
			setState(152);
			match(RPAREN);
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

	public static class OriginContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public TerminalNode ORIGIN() { return getToken(LispParser.ORIGIN, 0); }
		public TerminalNode STRING() { return getToken(LispParser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public OriginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_origin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).enterOrigin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispListener ) ((LispListener)listener).exitOrigin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispVisitor ) return ((LispVisitor<? extends T>)visitor).visitOrigin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OriginContext origin() throws RecognitionException {
		OriginContext _localctx = new OriginContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_origin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(LPAREN);
			setState(155);
			match(ORIGIN);
			setState(156);
			match(STRING);
			setState(157);
			match(RPAREN);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u00a2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\4\5\4\61\n\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6=\n\6\3\7\3\7\3\7\6\7B\n\7\r\7\16\7"+
		"C\3\7\5\7G\n\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7O\n\7\r\7\16\7P\3\7\5\7T\n\7"+
		"\3\7\3\7\5\7X\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\td\n\t\f\t"+
		"\16\tg\13\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13s\n\13\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r|\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u0088\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0091\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\4\4\2\17\20"+
		"\31\32\3\2\21\22\2\u00a6\2\"\3\2\2\2\4*\3\2\2\2\6,\3\2\2\2\b\64\3\2\2"+
		"\2\n<\3\2\2\2\fW\3\2\2\2\16Y\3\2\2\2\20_\3\2\2\2\22j\3\2\2\2\24r\3\2\2"+
		"\2\26t\3\2\2\2\30\u0087\3\2\2\2\32\u0090\3\2\2\2\34\u0092\3\2\2\2\36\u0097"+
		"\3\2\2\2 \u009c\3\2\2\2\"#\5\4\3\2#$\7\2\2\3$\3\3\2\2\2%+\5\6\4\2&+\5"+
		"\b\5\2\'+\5\f\7\2(+\5\16\b\2)+\5\20\t\2*%\3\2\2\2*&\3\2\2\2*\'\3\2\2\2"+
		"*(\3\2\2\2*)\3\2\2\2+\5\3\2\2\2,-\7\5\2\2-\60\7\4\2\2.\61\7\27\2\2/\61"+
		"\5\4\3\2\60.\3\2\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\63\7\6\2\2\63\7\3\2"+
		"\2\2\64\65\7\5\2\2\65\66\7\3\2\2\66\67\5\n\6\2\678\5\n\6\289\7\6\2\29"+
		"\t\3\2\2\2:=\5\32\16\2;=\5\4\3\2<:\3\2\2\2<;\3\2\2\2=\13\3\2\2\2>?\7\5"+
		"\2\2?A\7\16\2\2@B\5\24\13\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF"+
		"\3\2\2\2EG\5\32\16\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\6\2\2IX\3\2\2\2"+
		"JK\7\5\2\2KL\7\16\2\2LN\7\27\2\2MO\5\24\13\2NM\3\2\2\2OP\3\2\2\2PN\3\2"+
		"\2\2PQ\3\2\2\2QS\3\2\2\2RT\5\32\16\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7"+
		"\6\2\2VX\3\2\2\2W>\3\2\2\2WJ\3\2\2\2X\r\3\2\2\2YZ\7\5\2\2Z[\7\f\2\2[\\"+
		"\5\22\n\2\\]\7\27\2\2]^\7\6\2\2^\17\3\2\2\2_`\7\5\2\2`a\7\r\2\2ae\7\31"+
		"\2\2bd\5\n\6\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2"+
		"\2\2hi\7\6\2\2i\21\3\2\2\2jk\t\2\2\2k\23\3\2\2\2lm\5\26\f\2mn\5\32\16"+
		"\2ns\3\2\2\2op\5\30\r\2pq\5\32\16\2qs\3\2\2\2rl\3\2\2\2ro\3\2\2\2s\25"+
		"\3\2\2\2tu\7\5\2\2uv\5\32\16\2vw\7\6\2\2w\27\3\2\2\2xy\7\5\2\2y{\7\3\2"+
		"\2z|\7\25\2\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\27\2\2~\177\5\32\16\2"+
		"\177\u0080\7\6\2\2\u0080\u0088\3\2\2\2\u0081\u0082\7\5\2\2\u0082\u0083"+
		"\t\3\2\2\u0083\u0084\5\30\r\2\u0084\u0085\5\30\r\2\u0085\u0086\7\6\2\2"+
		"\u0086\u0088\3\2\2\2\u0087x\3\2\2\2\u0087\u0081\3\2\2\2\u0088\31\3\2\2"+
		"\2\u0089\u0091\7\27\2\2\u008a\u0091\7\30\2\2\u008b\u0091\7\32\2\2\u008c"+
		"\u0091\7\23\2\2\u008d\u0091\5\34\17\2\u008e\u0091\5\36\20\2\u008f\u0091"+
		"\5 \21\2\u0090\u0089\3\2\2\2\u0090\u008a\3\2\2\2\u0090\u008b\3\2\2\2\u0090"+
		"\u008c\3\2\2\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2"+
		"\2\2\u0091\33\3\2\2\2\u0092\u0093\7\5\2\2\u0093\u0094\7\17\2\2\u0094\u0095"+
		"\7\27\2\2\u0095\u0096\7\6\2\2\u0096\35\3\2\2\2\u0097\u0098\7\5\2\2\u0098"+
		"\u0099\7\20\2\2\u0099\u009a\7\32\2\2\u009a\u009b\7\6\2\2\u009b\37\3\2"+
		"\2\2\u009c\u009d\7\5\2\2\u009d\u009e\7\26\2\2\u009e\u009f\7\32\2\2\u009f"+
		"\u00a0\7\6\2\2\u00a0!\3\2\2\2\17*\60<CFPSWer{\u0087\u0090";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}