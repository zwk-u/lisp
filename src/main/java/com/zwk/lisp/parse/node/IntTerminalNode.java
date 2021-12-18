package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Collections;
import java.util.List;

public class IntTerminalNode extends LispTerminalNode<Integer> {
    private final int value;

    public IntTerminalNode(int value) {
        this.value = value;
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitIntTerminalNode(this, context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
