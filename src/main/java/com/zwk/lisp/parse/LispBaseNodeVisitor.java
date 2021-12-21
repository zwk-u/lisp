package com.zwk.lisp.parse;

import com.zwk.lisp.parse.node.*;

public class LispBaseNodeVisitor<C, R> implements LispNodeVisitor<C, R> {
    @Override
    public R visitLisp(Lisp node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitAggregateExpression(AggregateParseExpressionNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitAggregateNode(AggregateNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitIntTerminalNode(IntTerminalNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitStringTerminalNode(StringTerminalNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitIdTerminalNode(IdTerminalNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitOperatorTerminalNode(OperatorTerminalNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitCalculateExpressionNode(CalculateExpressionNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitCalculateNode(CalculateNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitSimpleCaseNode(SimpleCaseNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitConditionCaseNode(ConditionCaseNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitCaseExpressionNode(CaseExpressionNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitCastExpressionNode(CastExpressionNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitCastNode(CastNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitCommonValueExpressionNode(CommonValueExpressionNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitCommonParseExpressionNode(CommonParseExpressionNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitCallExpressionNode(CallExpressionNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitCallNode(CallNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitIntLiteralValueExpressionNode(IntLiteralValueExpressionNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitDoubleTerminalNode(DoubleTerminalNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitDoubleLiteralValueExpressionNode(DoubleLiteralValueExpressionNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitStringLiteralValueExpressionNode(StringLiteralValueExpressionNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitIntValueNode(IntValueNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitIntValueExpressionNode(IntValueExpressionNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitStringNode(StringNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitSimpleClauseNode(SimpleClauseNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitSingleConditionClauseNode(SingleConditionClauseNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitMultiConditionClauseNode(MultiConditionClauseNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitSimpleWhenClauseNode(SimpleWhenClauseNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitConditionWhenClauseNode(ConditionWhenClauseNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitStringValueExpressionNode(StringValueExpressionNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitOriginValueExpressionNode(OriginValueExpressionNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitOriginNode(OriginNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visitNullLiteralValueExpressionNode(NullLiteralValueExpressionNode node, C context) {
        return visit(node, context);
    }

    @Override
    public R visit(LispNode node, C context) {
        R r = null;
        for (LispNode child : node.getChildren()) {
            r = combine(r, child.visit(this, context), context);
        }
        return r;
    }

    @Override
    public R combine(R pre, R next, C context) {
        return null;
    }

}
