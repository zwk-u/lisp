package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Collections;
import java.util.List;

public class StringValueExpressionNode extends ValueExpressionNode{
    private StringNode value;

    public StringValueExpressionNode(StringNode value) {
        this.value = value;
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitStringValueExpressionNode(this,context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Collections.singletonList(value);
    }
}
