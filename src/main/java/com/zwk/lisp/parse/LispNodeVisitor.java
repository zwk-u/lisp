package com.zwk.lisp.parse;

import com.zwk.lisp.parse.node.*;

public interface LispNodeVisitor<C, R> {
    R visitLisp(Lisp node, C context);

    R visitAggregateExpression(AggregateParseExpressionNode node, C context);

    R visitAggregateNode(AggregateNode node, C context);

    R visitIntTerminalNode(IntTerminalNode node, C context);

    R visitStringTerminalNode(StringTerminalNode node, C context);

    R visitIdTerminalNode(IdTerminalNode node, C context);

    R visitOperatorTerminalNode(OperatorTerminalNode node, C context);

    R visitCalculateExpressionNode(CalculateExpressionNode node, C context);

    R visitCalculateNode(CalculateNode node, C context);

    R visitSimpleCaseNode(SimpleCaseNode node, C context);

    R visitConditionCaseNode(ConditionCaseNode node, C context);

    R visitCaseExpressionNode(CaseExpressionNode node, C context);

    R visitCastExpressionNode(CastExpressionNode node, C context);

    R visitCastNode(CastNode node, C context);

    R visitCommonValueExpressionNode(CommonValueExpressionNode node, C context);

    R visitCommonParseExpressionNode(CommonParseExpressionNode node, C context);

    R visitCallExpressionNode(CallExpressionNode node, C context);

    R visitCallNode(CallNode node, C context);

    R visitIntLiteralValueExpressionNode(IntLiteralValueExpressionNode node, C context);

    R visitDoubleTerminalNode(DoubleTerminalNode node, C context);

    R visitDoubleLiteralValueExpressionNode(DoubleLiteralValueExpressionNode node, C context);

    R visitStringLiteralValueExpressionNode(StringLiteralValueExpressionNode node, C context);

    R visitIntValueNode(IntValueNode node, C context);

    R visitIntValueExpressionNode(IntValueExpressionNode node, C context);

    R visitStringNode(StringNode node, C context);

    R visit(LispNode node, C context);

    R combine(R pre, R next, C context);

    R visitSimpleClauseNode(SimpleClauseNode node, C context);

    R visitSingleConditionClauseNode(SingleConditionClauseNode node, C context);

    R visitMultiConditionClauseNode(MultiConditionClauseNode node, C context);

    R visitSimpleWhenClauseNode(SimpleWhenClauseNode node, C context);

    R visitConditionWhenClauseNode(ConditionWhenClauseNode node, C context);

    R visitStringValueExpressionNode(StringValueExpressionNode node, C context);

    R visitOriginValueExpressionNode(OriginValueExpressionNode node, C context);

    R visitOriginNode(OriginNode node, C context);
}
