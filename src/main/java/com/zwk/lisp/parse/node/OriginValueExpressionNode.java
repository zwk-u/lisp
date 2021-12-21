package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Collections;
import java.util.List;

public class OriginValueExpressionNode extends ValueExpressionNode{
   private OriginNode origin;

    public OriginValueExpressionNode(OriginNode origin) {
        this.origin = origin;
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitOriginValueExpressionNode(this, context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Collections.singletonList(origin);
    }
}
