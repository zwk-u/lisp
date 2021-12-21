package com.zwk.lisp.impl;

import com.zwk.lisp.parse.LispBaseNodeVisitor;
import com.zwk.lisp.parse.node.*;

import java.util.List;

public class MyLispNodeVisitor extends LispBaseNodeVisitor<Void, StringBuilder> {
    @Override
    public StringBuilder visitAggregateNode(AggregateNode node, Void context) {
        StringBuilder sb = new StringBuilder();
        sb.append(node.getAggFuncName().getValue())
                .append("(")
                .append(node.getId() != null
                        ? node.getId().getValue()
                        : node.getExpression().accept(this, context))
                .append(")");
        return sb;
    }

    @Override
    public StringBuilder visitCalculateNode(CalculateNode node, Void context) {
        StringBuilder sb = new StringBuilder(" ");
        sb.append(node.getLeft().accept(this, context))
                .append(" ")
                .append(node.getOperator().getValue())
                .append(" ")
                .append(node.getRight().accept(this, context))
                .append(" ");
        return sb;
    }


    @Override
    public StringBuilder visitConditionCaseNode(ConditionCaseNode node, Void context) {
        StringBuilder sb = new StringBuilder(" CASE ");
        for (WhenClauseNode whenClause : node.getWhenClauses()) {
            sb.append(whenClause.accept(this, context));
        }
        if (node.getElseValue() != null) {
            sb.append(" ELSE ").append(node.getElseValue().accept(this, context));
        }
        sb.append(" END ");
        return sb;
    }

    @Override
    public StringBuilder visitSimpleCaseNode(SimpleCaseNode node, Void context) {
        StringBuilder sb = new StringBuilder(" CASE ");
        sb.append(node.getId().getValue()).append(" ");
        for (WhenClauseNode whenClause : node.getWhenClauses()) {
            sb.append(whenClause.accept(this, context)).append(" ");
        }
        if (node.getElseValue() != null) {
            sb.append(" ELSE ").append(node.getElseValue().accept(this, context));
        }
        sb.append(" END ");
        return sb;
    }

    @Override
    public StringBuilder visitSimpleWhenClauseNode(SimpleWhenClauseNode node, Void context) {
        StringBuilder sb = new StringBuilder(" WHEN ");
        return sb.append(node.getCond().accept(this, context))
                .append(" THEN ").append(node.getValue().accept(this, context));
    }

    @Override
    public StringBuilder visitConditionWhenClauseNode(ConditionWhenClauseNode node, Void context) {
        StringBuilder sb = new StringBuilder(" WHEN ");
        sb.append(node.getCond().accept(this, context))
                .append(" ")
                .append(" THEN ")
                .append(node.getValue().accept(this, context))
                .append(" ");
        return sb;
    }

    @Override
    public StringBuilder visitSingleConditionClauseNode(SingleConditionClauseNode node, Void context) {
        StringBuilder sb = new StringBuilder();
        sb.append(node.getId().getValue())
                .append(" ")
                .append(node.getOp().getValue())
                .append(node.isNot() ? " NOT " : " ")
                .append(node.getCond().accept(this, context))
                .append(" ");
        return sb;
    }

    @Override
    public StringBuilder visitMultiConditionClauseNode(MultiConditionClauseNode node, Void context) {
        StringBuilder sb = new StringBuilder();
        return sb.append(node.getLeft().accept(this, context))
                .append(node.getOp().getValue())
                .append(" ")
                .append(node.getRight().accept(this, context))
                .append(" ");
    }

    @Override
    public StringBuilder visitCastNode(CastNode node, Void context) {
        StringBuilder sb = new StringBuilder("CAST(");
        sb.append(node.getId().getValue())
                .append(" AS ")
                .append(node.getType().getValue())
                .append(")");
        return sb;
    }

    @Override
    public StringBuilder visitCallNode(CallNode node, Void context) {
        StringBuilder sb = new StringBuilder(node.getFuncName().getValue());
        sb.append("(");
        List<CommonExpressionNode> commonExpressions = node.getCommonExpressions();
        if (commonExpressions.size() > 0) {
            for (CommonExpressionNode commonExpression : commonExpressions) {
                sb.append(commonExpression.accept(this, context)).append(",");
            }
            sb.setLength(sb.length() - 1);
        }
        sb.append(")");
        return sb;
    }

    @Override
    public StringBuilder visitIntTerminalNode(IntTerminalNode node, Void context) {
        StringBuilder sb = new StringBuilder();
        sb.append(node.getValue());
        return sb;
    }

    @Override
    public StringBuilder visitStringTerminalNode(StringTerminalNode node, Void context) {
        return new StringBuilder(node.getValue());
    }

    @Override
    public StringBuilder combine(StringBuilder pre, StringBuilder next, Void context) {
        if (pre == null) {
            return next;
        }
        return pre.append(next);
    }
}
