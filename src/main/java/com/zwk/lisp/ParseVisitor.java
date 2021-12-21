package com.zwk.lisp;

import com.zwk.lisp.parse.node.*;

import java.util.ArrayList;
import java.util.List;

public class ParseVisitor extends LispBaseVisitor<LispNode> {
    @Override
    public LispNode visitLisp(LispParser.LispContext ctx) {
        return visit(ctx.parseExpresion());
    }

    @Override
    public LispNode visitAggregateExpression(LispParser.AggregateExpressionContext ctx) {
        return new AggregateParseExpressionNode((AggregateNode) visit(ctx.aggregate()));
    }

    @Override
    public LispNode visitAggregate(LispParser.AggregateContext ctx) {
        if (ctx.INT() != null) {
            IntTerminalNode node = new IntTerminalNode(Integer.parseInt(ctx.INT().getText()));
            return new AggregateNode(new StringTerminalNode(ctx.aggFuncName.getText()), node);
        } else {
            return new AggregateNode(new StringTerminalNode(ctx.aggFuncName.getText()),
                    (ParseExpressionNode) visit(ctx.parseExpresion()));
        }
    }

    @Override
    public LispNode visitCalculateExpression(LispParser.CalculateExpressionContext ctx) {
        return new CalculateExpressionNode((CalculateNode) visit(ctx.calculate()));
    }

    @Override
    public LispNode visitCalculate(LispParser.CalculateContext ctx) {
        OperatorTerminalNode operator = new OperatorTerminalNode(ctx.op.getText());
        CommonExpressionNode left = (CommonExpressionNode) visit(ctx.left);
        CommonExpressionNode right = (CommonExpressionNode) visit(ctx.right);
        return new CalculateNode(operator, left, right);
    }

    @Override
    public LispNode visitCommonValueExpression(LispParser.CommonValueExpressionContext ctx) {
        return new CommonValueExpressionNode((ValueExpressionNode) visit(ctx.valueExpression()));
    }

    @Override
    public LispNode visitCommonParseExpression(LispParser.CommonParseExpressionContext ctx) {
        return new CommonParseExpressionNode((ParseExpressionNode) visit(ctx.parseExpresion()));
    }

    @Override
    public LispNode visitCaseExpression(LispParser.CaseExpressionContext ctx) {
        return new CaseExpressionNode((CaseNode) visit(ctx.caseBranch()));
    }

    @Override
    public LispNode visitConditionCase(LispParser.ConditionCaseContext ctx) {
        List<WhenClauseNode> whenClauses = new ArrayList<>();
        for (LispParser.WhenClauseContext context : ctx.whenClause()) {
            whenClauses.add((WhenClauseNode) visit(context));
        }
        return new ConditionCaseNode(whenClauses, (ValueExpressionNode) visit(ctx.elseValue));
    }

    @Override
    public LispNode visitSimpleWhenClause(LispParser.SimpleWhenClauseContext ctx) {
        return new SimpleWhenClauseNode((SimpleClauseNode) visit(ctx.cond), (ValueExpressionNode) visit(ctx.value));
    }

    @Override
    public LispNode visitConditionWhenClause(LispParser.ConditionWhenClauseContext ctx) {
        return new ConditionWhenClauseNode((ConditionClauseNode) visit(ctx.cond), (ValueExpressionNode) visit(ctx.value));
    }

    @Override
    public LispNode visitSimpleCase(LispParser.SimpleCaseContext ctx) {
        List<WhenClauseNode> whenClauses = new ArrayList<>();
        for (LispParser.WhenClauseContext context : ctx.whenClause()) {
            whenClauses.add((WhenClauseNode) visit(context));
        }
        return new SimpleCaseNode(
                new IntTerminalNode(Integer.parseInt(ctx.id.getText())),
                whenClauses,
                ctx.elseValue == null ? null : (ValueExpressionNode) visit(ctx.elseValue));
    }

    @Override
    public LispNode visitSimpleClause(LispParser.SimpleClauseContext ctx) {
        return new SimpleClauseNode((ValueExpressionNode) visit(ctx.cond));
    }

    @Override
    public LispNode visitSingleConditionClause(LispParser.SingleConditionClauseContext ctx) {
        OperatorTerminalNode op = new OperatorTerminalNode(ctx.op.getText());
        IntTerminalNode id = new IntTerminalNode(Integer.parseInt(ctx.id.getText()));
        return new SingleConditionClauseNode(op, id, (ValueExpressionNode) visit(ctx.cond));
    }

    @Override
    public LispNode visitMultiConditionClause(LispParser.MultiConditionClauseContext ctx) {
        OperatorTerminalNode op = new OperatorTerminalNode(ctx.op.getText());
        return new MultiConditionClauseNode(op,
                (ConditionClauseNode) visit(ctx.left),
                (ConditionClauseNode) visit(ctx.right));
    }

    @Override
    public LispNode visitCastExpression(LispParser.CastExpressionContext ctx) {
        return new CastExpressionNode((CastNode) visit(ctx.cast()));
    }

    @Override
    public LispNode visitCast(LispParser.CastContext ctx) {
        String type = ctx.type.getText();
        if (type.startsWith("'")) {
            type = type.substring(1, type.length() - 1);
        }
        return new CastNode(new IdTerminalNode(type),
                new IntTerminalNode(Integer.parseInt(ctx.id.getText())));
    }

    @Override
    public LispNode visitCallExpression(LispParser.CallExpressionContext ctx) {
        return new CallExpressionNode((CallNode) visit(ctx.call()));
    }

    @Override
    public LispNode visitCall(LispParser.CallContext ctx) {
        IdTerminalNode funcName = new IdTerminalNode(ctx.funcName.getText());
        List<LispParser.CommonExpressionContext> commonExpression = ctx.commonExpression();
        List<CommonExpressionNode> commonExpressions = new ArrayList<>();
        if (commonExpression != null) {
            for (LispParser.CommonExpressionContext context : commonExpression) {
                commonExpressions.add((CommonExpressionNode) visit(context));
            }
        }
        return new CallNode(funcName, commonExpressions);
    }

    @Override
    public LispNode visitOriginValueExpression(LispParser.OriginValueExpressionContext ctx) {
        return new OriginValueExpressionNode((OriginNode) visit(ctx.origin()));
    }

    @Override
    public LispNode visitOrigin(LispParser.OriginContext ctx) {
        String val = ctx.STRING().getText();
        val = val.substring(1, val.length() - 1);
        val = val.replace("\\'", "'");
        return new OriginNode(new StringTerminalNode(val));
    }

    @Override
    public LispNode visitIntLiteralValueExpression(LispParser.IntLiteralValueExpressionContext ctx) {
        return new IntLiteralValueExpressionNode(new IntTerminalNode(Integer.parseInt(ctx.INT().getText())));
    }

    @Override
    public LispNode visitDoubleLiteralValueExpression(LispParser.DoubleLiteralValueExpressionContext ctx) {
        return new DoubleLiteralValueExpressionNode(new DoubleTerminalNode(Double.parseDouble(ctx.DOUBLE().getText())));
    }

    @Override
    public LispNode visitIntValueExpression(LispParser.IntValueExpressionContext ctx) {
        return new IntValueExpressionNode((IntValueNode) visit(ctx.intValue()));
    }

    @Override
    public LispNode visitString(LispParser.StringContext ctx) {
        return new StringNode(new StringTerminalNode(ctx.STRING().getText()));
    }

    @Override
    public LispNode visitStringLiteralValueExpression(LispParser.StringLiteralValueExpressionContext ctx) {
        return new StringLiteralValueExpressionNode(new StringTerminalNode(ctx.STRING().getText()));
    }

    @Override
    public LispNode visitStringValueExpression(LispParser.StringValueExpressionContext ctx) {
        return new StringValueExpressionNode((StringNode) visit(ctx.string()));
    }

    @Override
    public LispNode visitIntValue(LispParser.IntValueContext ctx) {
        return new IntValueNode(new IntTerminalNode(Integer.parseInt(ctx.INT().getText())));
    }
}
