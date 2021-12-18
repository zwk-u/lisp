package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Collections;
import java.util.List;

public class CallExpressionNode extends LispNode{
    private CallNode call;

    public CallExpressionNode(CallNode call) {
        this.call = call;
        setChildrenParent();
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitCallExpressionNode(this,context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Collections.singletonList(call);
    }
}
