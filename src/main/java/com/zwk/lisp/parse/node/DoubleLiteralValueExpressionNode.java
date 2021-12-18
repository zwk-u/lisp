package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Collections;
import java.util.List;

public class DoubleLiteralValueExpressionNode extends ValueExpressionNode{
    private DoubleTerminalNode value;

    public DoubleLiteralValueExpressionNode(DoubleTerminalNode value) {
        this.value = value;
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitDoubleLiteralValueExpressionNode(this,context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Collections.singletonList(value);
    }
}
