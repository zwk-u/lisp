package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Collections;
import java.util.List;

public class CommonValueExpressionNode extends CommonExpressionNode{
    private ValueExpressionNode valueExpression;

    public CommonValueExpressionNode(ValueExpressionNode valueExpression) {
        this.valueExpression = valueExpression;
        setChildrenParent();
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitCommonValueExpressionNode(this,context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Collections.singletonList(valueExpression);
    }

    public ValueExpressionNode getValueExpression() {
        return valueExpression;
    }
}
