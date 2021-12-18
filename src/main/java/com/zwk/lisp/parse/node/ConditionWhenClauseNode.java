package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Arrays;
import java.util.List;

public class ConditionWhenClauseNode extends WhenClauseNode{
    private ConditionClauseNode cond;
    private ValueExpressionNode value;

    public ConditionWhenClauseNode(ConditionClauseNode cond, ValueExpressionNode value) {
        this.cond = cond;
        this.value = value;
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitConditionWhenClauseNode(this,context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Arrays.asList(cond,value);
    }

    public ConditionClauseNode getCond() {
        return cond;
    }

    public ValueExpressionNode getValue() {
        return value;
    }
}
