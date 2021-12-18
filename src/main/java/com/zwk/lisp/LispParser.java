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
		INT=17, DOUBLE=18, ID=19, STRING=20, COMMENT=21, WS=22;
	public static final int
		RULE_lisp = 0, RULE_parseExpresion = 1, RULE_aggregate = 2, RULE_calculate = 3, 
		RULE_commonExpression = 4, RULE_caseBranch = 5, RULE_cast = 6, RULE_call = 7, 
		RULE_castType = 8, RULE_whenClause = 9, RULE_simpleClause = 10, RULE_conditionClause = 11, 
		RULE_valueExpression = 12, RULE_intValue = 13, RULE_string = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"lisp", "parseExpresion", "aggregate", "calculate", "commonExpression", 
			"caseBranch", "cast", "call", "castType", "whenClause", "simpleClause", 
			"conditionClause", "valueExpression", "intValue", "string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'('", "')'", "'COUNT'", "'SUM'", "'AVG'", "'MAX'", 
			"'MIN'", "'CAST'", "'CALL'", "'CASE'", "'INT'", "'STRING'", "'AND'", 
			"'OR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPERATOR", "AGGFUNC", "LPAREN", "RPAREN", "COUNT", "SUM", "AVG", 
			"MAX", "MIN", "CAST", "CALL", "CASE", "INTWORD", "STRINGWORD", "AND", 
			"OR", "INT", "DOUBLE", "ID", "STRING", "COMMENT", "WS"
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
			setState(30);
			parseExpresion();
			setState(31);
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
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new AggregateExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				aggregate();
				}
				break;
			case 2:
				_localctx = new CalculateExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				calculate();
				}
				break;
			case 3:
				_localctx = new CaseExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				caseBranch();
				}
				break;
			case 4:
				_localctx = new CastExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				cast();
				}
				break;
			case 5:
				_localctx = new CallExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
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
			setState(40);
			match(LPAREN);
			setState(41);
			((AggregateContext)_localctx).aggFuncName = match(AGGFUNC);
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(42);
				match(INT);
				}
				break;
			case LPAREN:
				{
				setState(43);
				parseExpresion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(46);
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
			setState(48);
			match(LPAREN);
			setState(49);
			((CalculateContext)_localctx).op = match(OPERATOR);
			setState(50);
			((CalculateContext)_localctx).left = commonExpression();
			setState(51);
			((CalculateContext)_localctx).right = commonExpression();
			setState(52);
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
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new CommonValueExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				valueExpression();
				}
				break;
			case 2:
				_localctx = new CommonParseExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
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
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new ConditionCaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(LPAREN);
				setState(59);
				match(CASE);
				setState(61); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(60);
						whenClause();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(63); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << INT) | (1L << DOUBLE) | (1L << STRING))) != 0)) {
					{
					setState(65);
					((ConditionCaseContext)_localctx).elseValue = valueExpression();
					}
				}

				setState(68);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new SimpleCaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(LPAREN);
				setState(71);
				match(CASE);
				setState(72);
				((SimpleCaseContext)_localctx).id = match(INT);
				setState(74); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(73);
						whenClause();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(76); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << INT) | (1L << DOUBLE) | (1L << STRING))) != 0)) {
					{
					setState(78);
					((SimpleCaseContext)_localctx).elseValue = valueExpression();
					}
				}

				setState(81);
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
			setState(85);
			match(LPAREN);
			setState(86);
			match(CAST);
			setState(87);
			((CastContext)_localctx).type = castType();
			setState(88);
			((CastContext)_localctx).id = match(INT);
			setState(89);
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
			setState(91);
			match(LPAREN);
			setState(92);
			match(CALL);
			setState(93);
			((CallContext)_localctx).funcName = match(ID);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << INT) | (1L << DOUBLE) | (1L << STRING))) != 0)) {
				{
				{
				setState(94);
				commonExpression();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
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
			setState(102);
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
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new SimpleWhenClauseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				((SimpleWhenClauseContext)_localctx).cond = simpleClause();
				setState(105);
				((SimpleWhenClauseContext)_localctx).value = valueExpression();
				}
				break;
			case 2:
				_localctx = new ConditionWhenClauseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				((ConditionWhenClauseContext)_localctx).cond = conditionClause();
				setState(108);
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
			setState(112);
			match(LPAREN);
			setState(113);
			((SimpleClauseContext)_localctx).cond = valueExpression();
			setState(114);
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
		public Token id;
		public ValueExpressionContext cond;
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public TerminalNode OPERATOR() { return getToken(LispParser.OPERATOR, 0); }
		public TerminalNode INT() { return getToken(LispParser.INT, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
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
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new SingleConditionClauseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(LPAREN);
				setState(117);
				((SingleConditionClauseContext)_localctx).op = match(OPERATOR);
				setState(118);
				((SingleConditionClauseContext)_localctx).id = match(INT);
				setState(119);
				((SingleConditionClauseContext)_localctx).cond = valueExpression();
				setState(120);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new MultiConditionClauseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(LPAREN);
				setState(123);
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
				setState(124);
				((MultiConditionClauseContext)_localctx).left = conditionClause();
				setState(125);
				((MultiConditionClauseContext)_localctx).right = conditionClause();
				setState(126);
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

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_valueExpression);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new IntLiteralValueExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(INT);
				}
				break;
			case 2:
				_localctx = new DoubleLiteralValueExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(DOUBLE);
				}
				break;
			case 3:
				_localctx = new StringLiteralValueExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new IntValueExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				intValue();
				}
				break;
			case 5:
				_localctx = new StringValueExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				string();
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
			setState(137);
			match(LPAREN);
			setState(138);
			match(INTWORD);
			setState(139);
			match(INT);
			setState(140);
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
			setState(142);
			match(LPAREN);
			setState(143);
			match(STRINGWORD);
			setState(144);
			match(STRING);
			setState(145);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\u0096\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\5\4/\n\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\5\6;\n\6\3\7\3\7\3\7\6\7@\n\7\r\7\16\7A\3\7\5\7E\n"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7M\n\7\r\7\16\7N\3\7\5\7R\n\7\3\7\3\7\5\7"+
		"V\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\tb\n\t\f\t\16\te\13\t"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13q\n\13\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0083\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u008a\n\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\4"+
		"\4\2\17\20\25\26\3\2\21\22\2\u0098\2 \3\2\2\2\4(\3\2\2\2\6*\3\2\2\2\b"+
		"\62\3\2\2\2\n:\3\2\2\2\fU\3\2\2\2\16W\3\2\2\2\20]\3\2\2\2\22h\3\2\2\2"+
		"\24p\3\2\2\2\26r\3\2\2\2\30\u0082\3\2\2\2\32\u0089\3\2\2\2\34\u008b\3"+
		"\2\2\2\36\u0090\3\2\2\2 !\5\4\3\2!\"\7\2\2\3\"\3\3\2\2\2#)\5\6\4\2$)\5"+
		"\b\5\2%)\5\f\7\2&)\5\16\b\2\')\5\20\t\2(#\3\2\2\2($\3\2\2\2(%\3\2\2\2"+
		"(&\3\2\2\2(\'\3\2\2\2)\5\3\2\2\2*+\7\5\2\2+.\7\4\2\2,/\7\23\2\2-/\5\4"+
		"\3\2.,\3\2\2\2.-\3\2\2\2/\60\3\2\2\2\60\61\7\6\2\2\61\7\3\2\2\2\62\63"+
		"\7\5\2\2\63\64\7\3\2\2\64\65\5\n\6\2\65\66\5\n\6\2\66\67\7\6\2\2\67\t"+
		"\3\2\2\28;\5\32\16\29;\5\4\3\2:8\3\2\2\2:9\3\2\2\2;\13\3\2\2\2<=\7\5\2"+
		"\2=?\7\16\2\2>@\5\24\13\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3"+
		"\2\2\2CE\5\32\16\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\6\2\2GV\3\2\2\2H"+
		"I\7\5\2\2IJ\7\16\2\2JL\7\23\2\2KM\5\24\13\2LK\3\2\2\2MN\3\2\2\2NL\3\2"+
		"\2\2NO\3\2\2\2OQ\3\2\2\2PR\5\32\16\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7"+
		"\6\2\2TV\3\2\2\2U<\3\2\2\2UH\3\2\2\2V\r\3\2\2\2WX\7\5\2\2XY\7\f\2\2YZ"+
		"\5\22\n\2Z[\7\23\2\2[\\\7\6\2\2\\\17\3\2\2\2]^\7\5\2\2^_\7\r\2\2_c\7\25"+
		"\2\2`b\5\n\6\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2"+
		"\2\2fg\7\6\2\2g\21\3\2\2\2hi\t\2\2\2i\23\3\2\2\2jk\5\26\f\2kl\5\32\16"+
		"\2lq\3\2\2\2mn\5\30\r\2no\5\32\16\2oq\3\2\2\2pj\3\2\2\2pm\3\2\2\2q\25"+
		"\3\2\2\2rs\7\5\2\2st\5\32\16\2tu\7\6\2\2u\27\3\2\2\2vw\7\5\2\2wx\7\3\2"+
		"\2xy\7\23\2\2yz\5\32\16\2z{\7\6\2\2{\u0083\3\2\2\2|}\7\5\2\2}~\t\3\2\2"+
		"~\177\5\30\r\2\177\u0080\5\30\r\2\u0080\u0081\7\6\2\2\u0081\u0083\3\2"+
		"\2\2\u0082v\3\2\2\2\u0082|\3\2\2\2\u0083\31\3\2\2\2\u0084\u008a\7\23\2"+
		"\2\u0085\u008a\7\24\2\2\u0086\u008a\7\26\2\2\u0087\u008a\5\34\17\2\u0088"+
		"\u008a\5\36\20\2\u0089\u0084\3\2\2\2\u0089\u0085\3\2\2\2\u0089\u0086\3"+
		"\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\33\3\2\2\2\u008b"+
		"\u008c\7\5\2\2\u008c\u008d\7\17\2\2\u008d\u008e\7\23\2\2\u008e\u008f\7"+
		"\6\2\2\u008f\35\3\2\2\2\u0090\u0091\7\5\2\2\u0091\u0092\7\20\2\2\u0092"+
		"\u0093\7\26\2\2\u0093\u0094\7\6\2\2\u0094\37\3\2\2\2\16(.:ADNQUcp\u0082"+
		"\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}