package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Collections;
import java.util.List;

public class IntValueNode extends LispTerminalNode<Integer>{
    private IntTerminalNode value;

    public IntValueNode(IntTerminalNode value) {
        this.value = value;
        setChildrenParent();
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitIntValueNode(this,context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Collections.singletonList(value);
    }

    @Override
    public Integer getValue() {
        return value.getValue();
    }
}
