package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Collections;
import java.util.List;

public class IntValueExpressionNode extends ValueExpressionNode{
    private IntValueNode value;

    public IntValueExpressionNode(IntValueNode value) {
        this.value = value;
        setChildrenParent();
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitIntValueExpressionNode(this,context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Collections.singletonList(value);
    }
}
