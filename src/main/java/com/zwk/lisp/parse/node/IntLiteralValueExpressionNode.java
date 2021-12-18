package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Collections;
import java.util.List;

public class IntLiteralValueExpressionNode extends ValueExpressionNode {
    private IntTerminalNode value;

    public IntLiteralValueExpressionNode(IntTerminalNode value) {
        this.value = value;
        setChildrenParent();
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitIntLiteralValueExpressionNode(this, context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Collections.singletonList(value);
    }

    public IntTerminalNode getValue() {
        return value;
    }
}
