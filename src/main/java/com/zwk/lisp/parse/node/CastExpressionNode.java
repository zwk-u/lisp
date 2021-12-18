package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Collections;
import java.util.List;

public class CastExpressionNode extends LispNode{
    private CastNode cast;

    public CastExpressionNode(CastNode cast) {
        this.cast = cast;
        setChildrenParent();
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitCastExpressionNode(this,context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Collections.singletonList(cast);
    }
}
