package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Arrays;
import java.util.List;

public class AggregateNode extends LispNode {

    private StringTerminalNode aggFuncName;
    private IntTerminalNode id;
    private ParseExpressionNode expression;

    public AggregateNode(StringTerminalNode aggFuncName, IntTerminalNode id) {
        this.aggFuncName = aggFuncName;
        this.id = id;
    }

    public AggregateNode(StringTerminalNode aggFuncName, ParseExpressionNode expression) {
        this.aggFuncName = aggFuncName;
        this.expression = expression;
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitAggregateNode(this, context);
    }


    @Override
    public List<LispNode> getChildren() {
        if (id == null) {
            return Arrays.asList(aggFuncName, expression);
        } else
            return Arrays.asList(aggFuncName, id);
    }

    public StringTerminalNode getAggFuncName() {
        return aggFuncName;
    }

    public IntTerminalNode getId() {
        return id;
    }

    public ParseExpressionNode getExpression() {
        return expression;
    }
}
