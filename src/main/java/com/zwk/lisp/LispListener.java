// Generated from D:/tools/workspace/lisp/src/main/java/com/zwk/lisp\Lisp.g4 by ANTLR 4.9.2
package com.zwk.lisp;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LispParser}.
 */
public interface LispListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LispParser#lisp}.
	 * @param ctx the parse tree
	 */
	void enterLisp(LispParser.LispContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#lisp}.
	 * @param ctx the parse tree
	 */
	void exitLisp(LispParser.LispContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aggregateExpression}
	 * labeled alternative in {@link LispParser#parseExpresion}.
	 * @param ctx the parse tree
	 */
	void enterAggregateExpression(LispParser.AggregateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aggregateExpression}
	 * labeled alternative in {@link LispParser#parseExpresion}.
	 * @param ctx the parse tree
	 */
	void exitAggregateExpression(LispParser.AggregateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code calculateExpression}
	 * labeled alternative in {@link LispParser#parseExpresion}.
	 * @param ctx the parse tree
	 */
	void enterCalculateExpression(LispParser.CalculateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calculateExpression}
	 * labeled alternative in {@link LispParser#parseExpresion}.
	 * @param ctx the parse tree
	 */
	void exitCalculateExpression(LispParser.CalculateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseExpression}
	 * labeled alternative in {@link LispParser#parseExpresion}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(LispParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseExpression}
	 * labeled alternative in {@link LispParser#parseExpresion}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(LispParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code castExpression}
	 * labeled alternative in {@link LispParser#parseExpresion}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(LispParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code castExpression}
	 * labeled alternative in {@link LispParser#parseExpresion}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(LispParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callExpression}
	 * labeled alternative in {@link LispParser#parseExpresion}.
	 * @param ctx the parse tree
	 */
	void enterCallExpression(LispParser.CallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callExpression}
	 * labeled alternative in {@link LispParser#parseExpresion}.
	 * @param ctx the parse tree
	 */
	void exitCallExpression(LispParser.CallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#aggregate}.
	 * @param ctx the parse tree
	 */
	void enterAggregate(LispParser.AggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#aggregate}.
	 * @param ctx the parse tree
	 */
	void exitAggregate(LispParser.AggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#calculate}.
	 * @param ctx the parse tree
	 */
	void enterCalculate(LispParser.CalculateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#calculate}.
	 * @param ctx the parse tree
	 */
	void exitCalculate(LispParser.CalculateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commonValueExpression}
	 * labeled alternative in {@link LispParser#commonExpression}.
	 * @param ctx the parse tree
	 */
	void enterCommonValueExpression(LispParser.CommonValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commonValueExpression}
	 * labeled alternative in {@link LispParser#commonExpression}.
	 * @param ctx the parse tree
	 */
	void exitCommonValueExpression(LispParser.CommonValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commonParseExpression}
	 * labeled alternative in {@link LispParser#commonExpression}.
	 * @param ctx the parse tree
	 */
	void enterCommonParseExpression(LispParser.CommonParseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commonParseExpression}
	 * labeled alternative in {@link LispParser#commonExpression}.
	 * @param ctx the parse tree
	 */
	void exitCommonParseExpression(LispParser.CommonParseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionCase}
	 * labeled alternative in {@link LispParser#caseBranch}.
	 * @param ctx the parse tree
	 */
	void enterConditionCase(LispParser.ConditionCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionCase}
	 * labeled alternative in {@link LispParser#caseBranch}.
	 * @param ctx the parse tree
	 */
	void exitConditionCase(LispParser.ConditionCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link LispParser#caseBranch}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(LispParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link LispParser#caseBranch}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(LispParser.SimpleCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#cast}.
	 * @param ctx the parse tree
	 */
	void enterCast(LispParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#cast}.
	 * @param ctx the parse tree
	 */
	void exitCast(LispParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(LispParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(LispParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#castType}.
	 * @param ctx the parse tree
	 */
	void enterCastType(LispParser.CastTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#castType}.
	 * @param ctx the parse tree
	 */
	void exitCastType(LispParser.CastTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleWhenClause}
	 * labeled alternative in {@link LispParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterSimpleWhenClause(LispParser.SimpleWhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleWhenClause}
	 * labeled alternative in {@link LispParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitSimpleWhenClause(LispParser.SimpleWhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionWhenClause}
	 * labeled alternative in {@link LispParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterConditionWhenClause(LispParser.ConditionWhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionWhenClause}
	 * labeled alternative in {@link LispParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitConditionWhenClause(LispParser.ConditionWhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#simpleClause}.
	 * @param ctx the parse tree
	 */
	void enterSimpleClause(LispParser.SimpleClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#simpleClause}.
	 * @param ctx the parse tree
	 */
	void exitSimpleClause(LispParser.SimpleClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleConditionClause}
	 * labeled alternative in {@link LispParser#conditionClause}.
	 * @param ctx the parse tree
	 */
	void enterSingleConditionClause(LispParser.SingleConditionClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleConditionClause}
	 * labeled alternative in {@link LispParser#conditionClause}.
	 * @param ctx the parse tree
	 */
	void exitSingleConditionClause(LispParser.SingleConditionClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiConditionClause}
	 * labeled alternative in {@link LispParser#conditionClause}.
	 * @param ctx the parse tree
	 */
	void enterMultiConditionClause(LispParser.MultiConditionClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiConditionClause}
	 * labeled alternative in {@link LispParser#conditionClause}.
	 * @param ctx the parse tree
	 */
	void exitMultiConditionClause(LispParser.MultiConditionClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intLiteralValueExpression}
	 * labeled alternative in {@link LispParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteralValueExpression(LispParser.IntLiteralValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intLiteralValueExpression}
	 * labeled alternative in {@link LispParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteralValueExpression(LispParser.IntLiteralValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteralValueExpression}
	 * labeled alternative in {@link LispParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteralValueExpression(LispParser.DoubleLiteralValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteralValueExpression}
	 * labeled alternative in {@link LispParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteralValueExpression(LispParser.DoubleLiteralValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteralValueExpression}
	 * labeled alternative in {@link LispParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralValueExpression(LispParser.StringLiteralValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteralValueExpression}
	 * labeled alternative in {@link LispParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralValueExpression(LispParser.StringLiteralValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intValueExpression}
	 * labeled alternative in {@link LispParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntValueExpression(LispParser.IntValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intValueExpression}
	 * labeled alternative in {@link LispParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntValueExpression(LispParser.IntValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringValueExpression}
	 * labeled alternative in {@link LispParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringValueExpression(LispParser.StringValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringValueExpression}
	 * labeled alternative in {@link LispParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringValueExpression(LispParser.StringValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#intValue}.
	 * @param ctx the parse tree
	 */
	void enterIntValue(LispParser.IntValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#intValue}.
	 * @param ctx the parse tree
	 */
	void exitIntValue(LispParser.IntValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(LispParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(LispParser.StringContext ctx);
}