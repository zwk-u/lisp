// Generated from D:/tools/workspace/lisp/src/main/java/com/zwk/lisp\Lisp.g4 by ANTLR 4.9.2
package com.zwk.lisp;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LispParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LispVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LispParser#lisp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLisp(LispParser.LispContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aggregateExpression}
	 * labeled alternative in {@link LispParser#parseExpresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateExpression(LispParser.AggregateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calculateExpression}
	 * labeled alternative in {@link LispParser#parseExpresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculateExpression(LispParser.CalculateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseExpression}
	 * labeled alternative in {@link LispParser#parseExpresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpression(LispParser.CaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code castExpression}
	 * labeled alternative in {@link LispParser#parseExpresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(LispParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callExpression}
	 * labeled alternative in {@link LispParser#parseExpresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpression(LispParser.CallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#aggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate(LispParser.AggregateContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#calculate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculate(LispParser.CalculateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commonValueExpression}
	 * labeled alternative in {@link LispParser#commonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonValueExpression(LispParser.CommonValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commonParseExpression}
	 * labeled alternative in {@link LispParser#commonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonParseExpression(LispParser.CommonParseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionCase}
	 * labeled alternative in {@link LispParser#caseBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionCase(LispParser.ConditionCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link LispParser#caseBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCase(LispParser.SimpleCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#cast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(LispParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(LispParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#castType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastType(LispParser.CastTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleWhenClause}
	 * labeled alternative in {@link LispParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleWhenClause(LispParser.SimpleWhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionWhenClause}
	 * labeled alternative in {@link LispParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionWhenClause(LispParser.ConditionWhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#simpleClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleClause(LispParser.SimpleClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleConditionClause}
	 * labeled alternative in {@link LispParser#conditionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleConditionClause(LispParser.SingleConditionClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiConditionClause}
	 * labeled alternative in {@link LispParser#conditionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiConditionClause(LispParser.MultiConditionClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intLiteralValueExpression}
	 * labeled alternative in {@link LispParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteralValueExpression(LispParser.IntLiteralValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleLiteralValueExpression}
	 * labeled alternative in {@link LispParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteralValueExpression(LispParser.DoubleLiteralValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteralValueExpression}
	 * labeled alternative in {@link LispParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralValueExpression(LispParser.StringLiteralValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intValueExpression}
	 * labeled alternative in {@link LispParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntValueExpression(LispParser.IntValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringValueExpression}
	 * labeled alternative in {@link LispParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValueExpression(LispParser.StringValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#intValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntValue(LispParser.IntValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LispParser.StringContext ctx);
}