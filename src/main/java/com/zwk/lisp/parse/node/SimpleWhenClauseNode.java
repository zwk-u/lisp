package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Arrays;
import java.util.List;

public class SimpleWhenClauseNode extends WhenClauseNode {
    private SimpleClauseNode cond;
    private ValueExpressionNode value;

    public SimpleWhenClauseNode(SimpleClauseNode cond, ValueExpressionNode value) {
        this.cond = cond;
        this.value = value;
        setChildrenParent();
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitSimpleWhenClauseNode(this,context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Arrays.asList(cond, value);
    }

    public SimpleClauseNode getCond() {
        return cond;
    }

    public ValueExpressionNode getValue() {
        return value;
    }
}
